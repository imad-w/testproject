package projet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnexionMysql {
	
	Connection conn =null;
	
public static void ConnexionDb() {
		
	// https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html#package.description
    // auto java.sql.Driver discovery -- no longer need to load a java.sql.Driver class via Class.forName

    // register JDBC driver, optional since java 1.6
    /*try {
        Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }*/

    // auto close connection
    try (Connection conn = DriverManager.getConnection(
            "jdbc:mysql://127.0.0.1:80/PAM", "root","")) {
		Class.forName("com.mysql.jdbc.Driver");


        if (conn != null) {
            System.out.println("Connected to the database!");
        } else {
            System.out.println("Failed to make connection!");
        }

    } catch (SQLException e) {
        System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
    } catch (Exception e) {
        e.printStackTrace();
    }
}
	
}
