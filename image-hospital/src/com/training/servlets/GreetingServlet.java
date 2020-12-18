package com.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.demo.model.Doctor;

/**
 * Servlet implementation class GreetingServlet
 */
@WebServlet("/greet")
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GreetingServlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("Constructor Called ==============");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println(request.getClass().getName());
		System.out.println(response.getClass().getName());
		
		request.setAttribute("heading", "our Specialists");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("showDoctor.jsp");
		
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		
		String doctorName = request.getParameter("doctorName");
		String doctorId = request.getParameter("doctorId");
		String mobileNumber = request.getParameter("mobileNumber");
		String specialization = request.getParameter("specialization");
		String date =  request.getParameter("dateOfBirth");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		LocalDate dateOfBirth = LocalDate.parse(date, formatter);
		
		Doctor doctor = new Doctor(Integer.parseInt(doctorId), doctorName, Long.parseLong(mobileNumber), specialization, dateOfBirth);
		request.setAttribute("doctorDetails", doctor);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("showDoctor.jsp");
		dispatcher.forward(request, response);

		
		
	}

}
