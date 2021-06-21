import lombok.Data;
import org.flywaydb.core.Flyway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Data
public class DBTools {

    protected static Connection connection;

    private static void initDB () {
        Flyway flyway = Flyway.configure().dataSource(
                "jdbc:h2:file:~/DATABASE", "databaseUser", "databasePassword").load();
        flyway.migrate();
    }

    private static void initDBConnection() throws ClassNotFoundException, SQLException {
        Class.forName ("org.h2.Driver");
        connection = DriverManager.
                getConnection("jdbc:h2:file:~/DATABASE", "databaseUser", "databasePassword");
    }

    static {
        initDB();
        try {
            initDBConnection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
