package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {

	private Funcionario funcionario;
	private ReajusteService service;

	@BeforeEach
	public void inicializar() {
		System.out.println("Inicio");
		this.service = new ReajusteService();
		this.funcionario = new Funcionario("Cleyson", LocalDate.now(), new BigDecimal("1000.00"));
	}

	@AfterEach
	public void finalizar() {
		System.out.println("fim");
	}

	@BeforeAll
	public static void antesDeTodos() {
		System.out.println("ANTES DE TODOS");
	}

	@AfterAll
	public static void depoisDeTodos() {
		System.out.println("DEPOIS DE TODOS");
	}

	@Test
	public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar() {
		service.concederReajuste(funcionario, Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}

	@Test
	public void reajusteDeveriaSerDeQuinzePorcentoQuandoDesempenhoForADesejar() {
		service.concederReajuste(funcionario, Desempenho.EXCELENTE);
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}

	@Test
	public void reajusteDeveriaSerDeVintePorcentoQuandoDesempenhoForADesejar() {
		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}
}