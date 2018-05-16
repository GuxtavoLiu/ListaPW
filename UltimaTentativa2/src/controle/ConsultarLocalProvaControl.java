package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.ConsultarLocalProva;

@WebServlet("/Palmeiras")
public class ConsultarLocalProvaControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ConsultarLocalProvaControl() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String v1 = (request.getParameter("nome"));
		String v2 = (request.getParameter("curso"));

		ConsultarLocalProva consultarLocalProva = new ConsultarLocalProva();

		String result = consultarLocalProva.localProva(v1, v2);

		request.setAttribute("resultado", result);
		RequestDispatcher dispatcher = request.getRequestDispatcher("localProva.jsp");
		dispatcher.forward(request, response);

	}

}
