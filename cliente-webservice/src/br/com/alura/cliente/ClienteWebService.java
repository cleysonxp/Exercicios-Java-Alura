package br.com.alura.cliente;

import org.apache.http.client.fluent.Request;

public class ClienteWebService {

	public static void main(String[] args) throws Exception {

		String conteudo = Request.Post("http://localhost:8080/gerenciadorM/empresas")
				.addHeader("Accept", "application/xml").execute().returnContent().toString();

		System.out.println(conteudo);

	}

}
