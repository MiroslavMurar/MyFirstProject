package com.testDB;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDB
 */
@WebServlet("/TestDB")
public class TestDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String user = "Opakovanie01"; 
		String pass = "Opakovanie01"; 
		String jdbcUrl = "jdbc:mysql://localhost:3306/MyFirstProject?useSSL=false";
		String driver = "com.mysql.jdbc.Driver"; 
		
		try { 
		 	PrintWriter out = response.getWriter(); 
		 	out.println("connecting to database: " + jdbcUrl);
		 	
		 	Class.forName(driver); 
		 	Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass); 
		 	
		 	out.println("Connection successful"); 
		 	myConn.close();
 	
			
		} catch (Exception e) { 
			e.printStackTrace();
			throw new ServletException(); 
		}
				
				
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

