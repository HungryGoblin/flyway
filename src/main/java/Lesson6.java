import java.sql.SQLException;

public class Lesson6 {

    public static void main(String[] args) throws SQLException {
        // MAPPER DEMO
        Student student = new StudentMapper(DBTools.connection).getStudentById(1);
        System.out.println(student);
        // IDENTITY MAPPER DEMO
        StudentIdentityMap studentIdentityMap = new StudentIdentityMap();
        System.out.println(studentIdentityMap.getStudentById(2));
        System.out.println(studentIdentityMap.getStudentById(2));
        System.out.println(studentIdentityMap.getStudentById(3));
    }
}
