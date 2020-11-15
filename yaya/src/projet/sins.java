package projet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class sins
 */
@WebServlet("/sins")
public class sins extends HttpServlet {
	
	
		
	
	
    Connection conn;
	Statement stmt;
	String username,password,adress,role;
	int numero;
	
	
	
	
	
	
	private static final long serialVersionUID = 1L;
       
    
	
    public sins() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/ins.jsp").forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	
		
		
		
		
	username=request.getParameter("username");
	password=request.getParameter("password");
	adress=request.getParameter("adress");
	numero=Integer.parseInt(request.getParameter("numero"));
	role=request.getParameter("role");
	
	String URL =  ("jdbc:mysql://localhost:3306/pam" );
	String USER = "root";
	String PASSWD = "";
   
	Connection conn = null;
	

    try {
    	
    	/*chargement du pilote MySQL*/
		Class.forName("com.mysql.jdbc.Driver");
		
		/*ouverture de la connexion*/
		conn = DriverManager.getConnection(URL, USER,PASSWD);
		
		/*Envoi d’un requête*/
		String query = "INSERT INTO `utilisateur`(`username`, `password`, `adress`, `numero`, `role`) VALUES (?,?,?,?,?)";
		System.out.println(query);
		
		
		/*passer une requête à la base*/
		stmt=conn.createStatement();
		
		/*exécutions de procédures stockées*/
		stmt.execute(query);
		
		
		System.out.println ("connexion  base MySql etablie");
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		System.out.println ("pas de connexion");
		e.printStackTrace();
	}
		
		
		
		
		
		
		
		doGet(request, response);
	}

}
