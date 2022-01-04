package br.com.alura.gerenciadorM.acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciadorM.modelo.Banco;

public class RemoveEmpresa implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String paramId = request.getParameter("id");
		Integer id = Integer.parseInt(paramId);
		
		System.out.println(id);
		
		Banco banco = new Banco();
		banco.removeEmpresa(id);
		
		return "redirect:entrada?acao=ListaEmpresas";
//		response.sendRedirect("entrada?acao=ListaEmpresas");
		
	}

}
