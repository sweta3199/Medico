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
 * Servlet implementation class ControllerServletForUpdate
 */
@WebServlet("/ControllerServletForUpdate")
public class ControllerServletForUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ControllerServletForUpdate() {
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
		
		MedicoDaoUpdate md=new MedicoDaoUpdate();
		int affectedRows[] = null;
		try {
			affectedRows = md.updateAge();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(affectedRows.length!=0)
		{
			out.println("<body background=\"C:\\Users\\Lenovo\\Desktop\\SWETA_AXAR_PROJECT\\Pics\\p2.jpg\"><h2>Patient's Age and Agegroup has been updated</h2></body>");
		}
		else
		{
			out.println("<body background=\"C:\\Users\\Lenovo\\Desktop\\SWETA_AXAR_PROJECT\\Pics\\p2.jpg\"><h2>Patient's Age and Agegroup is already updated</h2></body>");
		}
		/*for(int i:affectedRows)
		{
			System.out.println(i);
		}
		//sout.println("<button type=\"submit\" action=\"");*/
	}

}
