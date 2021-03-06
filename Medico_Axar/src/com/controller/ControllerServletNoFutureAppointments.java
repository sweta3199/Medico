package com.controller;
import com.bean.*;
import com.dao.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServletNoFutureAppointments
 */
@WebServlet("/ControllerServletNoFutureAppointments")
public class ControllerServletNoFutureAppointments extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ControllerServletNoFutureAppointments() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out=response.getWriter();
		List<PatientBean> p;
		MedicoDaoNoFutureAppointmnets md=new MedicoDaoNoFutureAppointmnets();
		try {
			p=md.listOfPatientsWithNoFutureAppointments();
			out.println("<body background=\"C:\\Users\\Lenovo\\Desktop\\SWETA_AXAR_PROJECT\\Pics\\p2.jpg\"><h2>There are total \t"+ p.size()+" Patients who don't have future appointments</h2><h3>The details of those:</h3>");
			out.println("<table border='1' width='100%'");
			out.println("<tr><th>patId</th><th>practiceId</th><th>lastName</th><th>fisrtName</th><th>city</th><th>state</th><th>gender</th><th>patientAgeGroup</th><th>birthDate</th><th>age</th></tr>");
			
			for(PatientBean l:p)
			{
				out.print("<tr><td>"+l.getpatId()+"</td><td>"+l.getpracticeId()+"</td><td>"+l.getlastName()+"</td><td>"+l.getfirstName()+"</td><td>"+l.getcity()+"</td><td>"+l.getstate()+"</td><td>"+l.getgender()+"</td><td>"+l.getpatientagegroup()+"</td><td>"+l.getbirthdate()+"</td><td>"+l.getage()+"</td></tr>");
				
			}
			out.print("</table></body>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
