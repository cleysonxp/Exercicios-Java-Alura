package br.com.alura.tdd;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	@Test
	public void somarDoisNumerosPositivos() {
		Calculadora cal = new Calculadora();
		int soma = cal.somar(5, 7);
		
		Assert.assertEquals(12, soma);
	}

}
