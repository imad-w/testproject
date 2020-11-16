package projet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnexionMysql {
	
	 Connection conn =null;

	
public static Connection ConnexionDb() {
		
	// https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html#package.description
    // auto java.sql.Driver discovery -- no longer need to load a java.sql.Driver class via Class.forName

    // register JDBC driver, optional since java 1.6
    /*try {
        Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }*/

    // auto close connection
    try { 
    	
    	//chargement du pilote MySQL
    	Class.forName("com.mysql.jdbc.Driver");
    	
		//ouverture de la connexion
    	 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pam","root","" );;
    	 return conn;
	}
catch (Exception e) 
{
	JOptionPane.showMessageDialog(null, e);
	return null;
}
}   
}
