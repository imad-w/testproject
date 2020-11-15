package projet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnexionMysql {
	
	static Connection conn =null;

	
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
    try {  Class.forName("com.mysql.jdbc.Driver");
System.out.println ("driver etablie");
	}
catch (ClassNotFoundException e) 
{
System.out.println ("driver non trouvé");
}
    
String URL =  ("jdbc:mysql://localhost:3306/pam" );
String USER = "root";
String PASSWD = "";

try {
conn=DriverManager.getConnection(URL,USER,PASSWD);;
System.out.println ("connexion  base MySql etablie");} 
catch (SQLException e) {
System.out.println ("pas de connexion");
                       }
}
	
}

