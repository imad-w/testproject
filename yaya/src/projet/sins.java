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
import javax.swing.JOptionPane;

import pam.ConnexionMysql;





/**
 * Servlet implementation class sins
 */
@WebServlet("/sins")
public class sins extends HttpServlet {
	
	
		
	
	
    
	String username,password,adress,role;
	int numero;
	
	
	
	
	Connection conn = null;
    PreparedStatement prepared =null;
    ResultSet resultat=null;
    
	
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
		
		
	
		conn = ConnexionMysql.ConnexionDb();	
		
		
		
	

	
	Connection conn = null;
	
	
	
    try {
    	
    	//Envoi d’un requête
		String query = "INSERT INTO `utilisateur`(`username`, `password`, `adress`, `numero`, `role`) VALUES (?,?,?,?,?)";
		System.out.println(query);
    	
		//ouverture de la connexion
        conn = DriverManager.getConnection("jdbc:mysql://localhost/pam","root","");
    	
    	
		prepared=conn.prepareStatement(query);

		username=request.getParameter("username");
		password=request.getParameter("password");
		adress=request.getParameter("adress");
		numero=Integer.parseInt(request.getParameter("numero"));
		role=request.getParameter("role");
		
		
		prepared.executeUpdate();
		
		JOptionPane.showMessageDialog(null, "register succesfully");


		prepared = conn.prepareStatement(query);
		resultat= prepared.executeQuery();
		
		
		//passer une requête à la base
		stmt=conn.createStatement();
		
		//exécutions de procédures stockées
		stmt.execute(query);
		
		
		
	} catch (SQLException e) {
		JOptionPane.showMessageDialog(null,"verifier les coordonnees");
		e.printStackTrace();
	}
		
		
		
		
		
		
		
		doGet(request, response);
	}

}
