package com.luv2code.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = "springstudent";
		String password = "springstudent";
		String jdbcurl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		
		try {
			
			PrintWriter out = response.getWriter();
			out.println("Connection to database :" +jdbcurl);
			out.println("Starting 1");
			Class.forName(driver);
			out.println("Starting 2" );
			Connection myconn = DriverManager.getConnection(jdbcurl, user , password);
			out.println("Connected Successfully");
			myconn.close();
		}
	
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new ServletException();
		}
	
	}

}
