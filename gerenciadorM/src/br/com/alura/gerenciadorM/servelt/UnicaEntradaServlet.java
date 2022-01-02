package br.com.alura.gerenciadorM.servelt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciadorM.acao.AlterarEmpresa;
import br.com.alura.gerenciadorM.acao.ListaEmpresas;
import br.com.alura.gerenciadorM.acao.MostraEmpresa;
import br.com.alura.gerenciadorM.acao.NovaEmpresa;
import br.com.alura.gerenciadorM.acao.RemoveEmpresa;


@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String paramAcao = request.getParameter("acao");

		if (paramAcao.equals("ListaEmpresas")) {
			ListaEmpresas acao = new ListaEmpresas();
			acao.executa(request, response);
		} else if (paramAcao.equals("RemovaEmpresa")) {
			RemoveEmpresa acao = new RemoveEmpresa();
			acao.executa(request, response);
		} else if (paramAcao.equals("MostraEmpresa")) {
			MostraEmpresa acao = new MostraEmpresa();
			acao.executa(request, response);
		} else if (paramAcao.equals("AlteraEmpresa")) {
			AlterarEmpresa acao = new AlterarEmpresa();
			acao.executa(request, response);
		}else if (paramAcao.equals("NovaEmpresa")) {
			NovaEmpresa acao = new NovaEmpresa();
			acao.executa(request, response);
		}
	}

}
