package servlet.com.torneopa.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Torneopa extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// Obtenemos un objeto Print Writer para enviar respuesta
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<Html><Head><Title>torneo pa</Title></Head>");
		pw.println("<BODY BGCOLOR=\"#CCBBAA\">");
		pw.println("<H2>Leyendo parametros desde un formulario html</H2><P>");
		pw.println("<UL>\n");
		pw.println("Te llamas " + req.getParameter("NOM") + "<BR>");
		pw.println("y tienes "  + req.getParameter("EDA") + " anios<BR>");
		pw.println("</BODY></Html>");
		pw.close();
	}
}