package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cours.ebenus.dao.entities.Animal;
import com.cours.ebenus.dao.entities.Proprietaire;
import com.cours.ebenus.service.IServiceFacade;
import com.cours.ebenus.service.ServiceFacade;

/**
 * Servlet implementation class ProprietaireServlet
 */
public class ProprietaireServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProprietaireServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IServiceFacade serviceFacade = new ServiceFacade();
		java.util.List<Proprietaire> proprietaires = new ArrayList<Proprietaire>();
		proprietaires = (java.util.List<Proprietaire>) serviceFacade.getProprietaireDao().findAllProprietaires();
		request.setAttribute("title",proprietaires);
		
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
