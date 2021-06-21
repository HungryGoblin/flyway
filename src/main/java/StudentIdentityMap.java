import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class StudentIdentityMap {

    private final Map<Integer, Student> students = new HashMap<>();
    private final StudentMapper studentMapper = new StudentMapper(DBTools.connection);

    public Student getStudentById(int id) throws SQLException {
        Student student = students.get(id);
        if (student == null) {
            student = studentMapper.getStudentById(id);
            students.put(student.getId(), student);
        }
        return student;
    }
}
