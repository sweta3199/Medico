package com.controller;
import com.bean.*;
import com.dao.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServletForTotalProcedure
 */
@WebServlet("/ControllerServletForTotalProcedure")
public class ControllerServletForTotalProcedure extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ControllerServletForTotalProcedure() {
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
		List<TransactionBean> list=new ArrayList<TransactionBean>();
		TransactionBean bean=new TransactionBean();
		String clinicName=request.getParameter("clinicName");
		String provider=request.getParameter("provider");
		String year=request.getParameter("year");
		String month=request.getParameter("month");
		bean.setclinicName(clinicName);
		bean.setMonth(month);
		bean.setProvider(provider);
		bean.setYear(year);
		MedicoDaoForView md=new MedicoDaoForView(bean);
		try {
			list=md.showTotalProcedureType();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("<body background=\"C:\\Users\\Lenovo\\Desktop\\SWETA_AXAR_PROJECT\\Pics\\p2.jpg\"><table border='1' width='100%' style=\"margin-top:100px\">");
		out.println("<th>Procedure Type</th><th>Clinic Name</th><th>Provider</th><th>Year</th><th>Month</th><th>Count</th><th>TotalAmount</th><th>Amount</th>");
		
		for(TransactionBean obj:list)
		{
			out.print("<tr><td>"+obj.getProcedureType()+"</td><td>"+obj.getclinicName()+"</td><td>"+obj.getProvider()+"</td><td>"+obj.getYear()+"</td><td>"+obj.getMonth()+"</td><td>"+obj.getCount()+"</td><td>"+obj.getSumAmount()+"</td><td>"+obj.getAmount()+"</td></tr>");
		}
		
		out.print("</table></body>");
	}

}
