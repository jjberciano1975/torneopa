package com.paises.ztorneopa;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Torneopa
 */
public class Torneopa extends HttpServlet {
	public static void main(String[] args) {
		
	}
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Torneopa() {
        super();
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
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<Html><Head><Title>torneo pa</Title></Head>");
		pw.println("<BODY BGCOLOR=\"#CCBBAA\">");
		pw.println("<H2>Leyendo parametros desde un formulario html</H2><P>");
		pw.println("<UL>\n");
		pw.println("Te llamas " + request.getParameter("NOM") + "<BR>");
		pw.println("y tienes "  + request.getParameter("EDA") + " anios<BR>");
		pw.println("</BODY></Html>");
		pw.close();
	}

}
