package com.luv2code.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestdbServlet")
public class TestdbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String driver="com.mysql.jdbc.Driver";
		String Username="springstudent";
		String password="springstudent";
		
	String url="jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
	
		try {
			PrintWriter out=response.getWriter();
			
			out.println("Connecting to Database"+url);
			
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,Username,password);
			out.println("Success");
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
			throw new ServletException(ex);
		}
	}

}
