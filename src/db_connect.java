
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class db_connect {

    public static Connection connection = null;

    public static Connection dbConnect() {          // Database setup
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:sMs.sqlite");
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showInputDialog(null, e);
            return null;
        }
    }

}
