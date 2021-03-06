package com.controller;
import com.bean.*;
import com.dao.*;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ControllerServlet() {
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
	protected void doPost(jakarta.servlet.http.HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out=response.getWriter();
		AppointmentBean bean=new AppointmentBean();
		MedicoDao dao=new MedicoDao(bean);
		int count;
		
			String clinicName=request.getParameter("clinicName");
			bean.setclinicName(clinicName);
			try {
				count = dao.getTotalCountOfAppointment(1);
				out.println("<body background=\"C:\\Users\\Lenovo\\Desktop\\SWETA_AXAR_PROJECT\\Pics\\p2.jpg\"><h2>The Total Number Of appointments of the clinic "+bean.getclinicName()+" are:\t"+count+"</h2></body>");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String month=request.getParameter("month");
			bean.setMonth(month);
			try {
				count = dao.getTotalCountOfAppointment(2);
				out.println("<body background=\"C:\\Users\\Lenovo\\Desktop\\SWETA_AXAR_PROJECT\\Pics\\p2.jpg\"><h2>The Total Number Of appointments in month "+bean.getMonth()+" are:\t"+count+"</h2></body>");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		
			String year=request.getParameter("year");
			bean.setYear(year);
			try {
				count=dao.getTotalCountOfAppointment(3);
				out.println("<body background=\"C:\\Users\\Lenovo\\Desktop\\SWETA_AXAR_PROJECT\\Pics\\p2.jpg\"><h2>The Total Number Of appointments in year "+bean.getYear()+" are:\t"+count+"</h2></body>");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		//out.print("<body>");
				
	}

}
