package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Calendar1 extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		String pval =null;
		Calendar cal=null;
		int day=0;
		int week=0;
	        int v1=0;
			int   v2=0;
		pw=res.getWriter();
		res.setContentType("text/html");
		
	   pval=req.getParameter("s1");
		if(!pval.equalsIgnoreCase("link1") && !pval.equalsIgnoreCase("link2")) {
			v1=Integer.parseInt(req.getParameter("p1"));
			v2=Integer.parseInt(req.getParameter("p2"));
			} 
		else {
			
		cal=Calendar.getInstance();
		}
	
		if  (pval.equalsIgnoreCase("add")) {
			pw.println("<h1 style='color:red;text-align:center'>addition::"+(v1+v2)+"</h1>");
		}
		else if (pval.equalsIgnoreCase("sub")) {
			pw.println("<h1 style='color:red;text-align:center'>subtraction::"+(v1-v2)+"</h1>");
		}
		else if (pval.equalsIgnoreCase("mul")) {
			pw.println("<h1 style='color:red;text-align:center'>multiplication::"+(v1*v2)+"</h1>");
		}
		else if(pval.equalsIgnoreCase("div")) {
			pw.println("<h1 style='color:red;text-align:center'>division::"+(v1/v2)+"</h1>");
		}
	else if (pval.equalsIgnoreCase("link1")) {
			
			pw.println("<h1 style='color:red;text-align:center'>day of year::"+cal.get(Calendar.DAY_OF_YEAR)+"</h1>");
		}
	else  {
		
		pw.println("<h1 style='color:red;text-align:center'>week no of the year::"+cal.get(Calendar.WEEK_OF_YEAR)+"</h1>");
	}
	
		
		pw.println("<br><p color='cyan'> click below to go to home</br>");
		pw.println("<br><a href='index.html'><img src='images/home.png'></a></br>");
		pw.close();
	}

	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
