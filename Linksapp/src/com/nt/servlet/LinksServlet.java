package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LinksServlet
 */
@WebServlet("/LinksServlet")
public class LinksServlet extends HttpServlet {
 
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=null;
		Locale []locales =null;
	    String pval=null;
	    pw=res.getWriter();
	    res.setContentType("text/htm");
	    pval=req.getParameter("s1");
	    locales=Locale.getAvailableLocales();
	    if(pval.equalsIgnoreCase("link1")) {
	    	pw.println("<br>all languages</br>");
	    	
	    	for(Locale l:locales) {
	    		pw.println(l.getDisplayLanguage()+"<br>");
	    	}
	    }
	    

	    else if(pval.equalsIgnoreCase("link2")) {
	    	pw.println("<br>all countries</br>");
	    	
	    	for(Locale l:locales) {
	    		pw.println(l.getDisplayCountry()+"<br>");
	    	}
	    }
	   else {  
		   pw.println("<br>all System properties</br>");
   	
   	for(Locale l:locales) {
   		pw.println(System.getProperties()+"<br>");
   	}
	   }
	    pw.println("<a href='input.html'><img src='images/home.png'>");
	   pw.close(); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		doGet(req,res);
	}

}
