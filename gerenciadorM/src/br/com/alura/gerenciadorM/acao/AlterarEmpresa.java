package br.com.alura.gerenciadorM.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciadorM.modelo.Banco;
import br.com.alura.gerenciadorM.modelo.Empresa;

public class AlterarEmpresa {

	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String nomeEmpresa = request.getParameter("nome");
		String paramDataEmpresa = request.getParameter("data");
		String paramId = request.getParameter("id");
		Integer id = Integer.parseInt(paramId);
		
		System.out.println("Alterando empresa " + id);
		
		Date dataAbetura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbetura = sdf.parse(paramDataEmpresa);			
		} catch (ParseException e) {			
			throw new ServletException(e);
		}
		
		System.out.println(id);
		
		Banco banco = new Banco();
		Empresa empresa = banco.buscaEmpresaPelaId(id);
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbetura);
		
		response.sendRedirect("entrada?acao=ListaEmpresas");
		
	}

}
