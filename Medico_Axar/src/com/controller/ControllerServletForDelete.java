package com.controller;
import com.dao.*;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServletForDelete
 */
@WebServlet("/ControllerServletForDelete")
public class ControllerServletForDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ControllerServletForDelete() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out=response.getWriter();
		int ar=0;
		MedicoDaoForDelete md=new MedicoDaoForDelete();
		try {
			ar=md.deleteappointment();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(ar!=0)
		{
			out.println("<body background=\\\"C:\\\\Users\\\\Lenovo\\\\Desktop\\\\SWETA_AXAR_PROJECT\\\\Pics\\\\p2.jpg\\\"><h2>Deleted "+ar+" Rows From AppointmentInfo Table </h2></body>");
		}
		else
		{
			out.println("<body background=\\\"C:\\\\Users\\\\Lenovo\\\\Desktop\\\\SWETA_AXAR_PROJECT\\\\Pics\\\\p2.jpg\\\"><h2>There is not any appointment having amout less than 50</h2></body>");
		}
		
	}

}
