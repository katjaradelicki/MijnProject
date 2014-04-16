package be.vdab.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import be.vdab.valueobjects.Adres;

/**
 * Servlet die het resultaat toont van een adres.
 */
@WebServlet("/resultaat.htm")
public class ResultaatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VIEW="resultaat.jsp"; //"/WEB-INF/JSP/resultaat.jsp"
       
 

	/**
	 * Hier wordt het adres getoond
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Adres adres=new Adres("Heverdreeg","3A",0,3000,"Leuven");
		request.setAttribute("adres", adres);
		RequestDispatcher dispatcher=request.getRequestDispatcher(VIEW);
		dispatcher.forward(request, response);
	}


}
