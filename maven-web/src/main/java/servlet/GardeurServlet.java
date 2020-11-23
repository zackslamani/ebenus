package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cours.ebenus.dao.entities.Gardeur;
import com.cours.ebenus.dao.entities.Proprietaire;
import com.cours.ebenus.service.IServiceFacade;
import com.cours.ebenus.service.ServiceFacade;

/**
 * Servlet implementation class GardeurServlet
 */
public class GardeurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GardeurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IServiceFacade serviceFacade = new ServiceFacade();
		java.util.List<Gardeur> gardeurs = new ArrayList<Gardeur>();
		gardeurs = (java.util.List<Gardeur>) serviceFacade.getGardeurDao().findAllGardeurs();
		request.setAttribute("title",gardeurs);
		
		this.getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
