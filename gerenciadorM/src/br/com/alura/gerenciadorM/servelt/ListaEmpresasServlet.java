package br.com.alura.gerenciadorM.servelt;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciadorM.modelo.Banco;
import br.com.alura.gerenciadorM.modelo.Empresa;

/**
 * Servlet implementation class ListaEmpresasServlet
 */
//@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
//		PrintWriter out = response.getWriter();
//		out.println("<html><body>nomeEmpresa</body></html>");

		request.setAttribute("empresas", lista);
//
		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas.jsp");
		rd.forward(request, response);
	}
}