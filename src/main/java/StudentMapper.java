import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


@Data
@AllArgsConstructor
public class StudentMapper {

    protected Connection connection;

    public Student getStudentById(int id) throws SQLException {
        ResultSet resultSet = connection
                .createStatement()
                .executeQuery(String.format("select * from students where students.id = %d", id));
        if (resultSet != null) {
            resultSet.first();
            return new Student(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getInt("score"));
        } else return null;
    }

}
