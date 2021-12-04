package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();
//		BigDecimal bonus = service.calcularBonus(new Funcionario("Cleyson", LocalDate.now(), new BigDecimal("25000")));
//		assertEquals(new BigDecimal("0.00"), bonus);

		assertThrows(IllegalArgumentException.class,
				() -> service.calcularBonus(new Funcionario("Cleyson", LocalDate.now(), new BigDecimal("25000"))));

//		try {
//			service.calcularBonus(new Funcionario("Cleyson", LocalDate.now(), new BigDecimal("25000")));
//			fail("Nao deu a exception!");
//		} catch (Exception e) {
//			assertEquals("funcionário com salário maior do que R$ 10.000,00 não pode receber bônus", e.getMessage());
//		}

	}

	@Test
	void bonusDeveriaSer10PorcentoDoSalario0() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Cleyson", LocalDate.now(), new BigDecimal("2500")));

		assertEquals(new BigDecimal("250.00"), bonus);
	}

	@Test
	void bonus() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Cleyson", LocalDate.now(), new BigDecimal("10000")));

		assertEquals(new BigDecimal("1000.00"), bonus);
	}

}
