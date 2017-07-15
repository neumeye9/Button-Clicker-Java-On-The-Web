package com.krista.buttonclicker.controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String counter = (String) session.getAttribute("counter");
		Integer number = 0;
		
		if(counter != null){
			number = Integer.parseInt(counter);
			number += 1;
			counter = number.toString();
			session.setAttribute("counter",counter);
		}
		else{
			session.setAttribute("counter","0");
		}
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/counter.jsp");
		view.forward(request, response);
		}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
