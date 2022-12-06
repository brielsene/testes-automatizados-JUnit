package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();

		BigDecimal calcularBonus = service
				.calcularBonus(new Funcionario("Gabriel", LocalDate.now(), new BigDecimal("25000")));

		assertEquals(BigDecimal.ZERO, calcularBonus);

	}

	@Test
	void bonusDeveriaSer10PorCentroDoSalario() {
		BonusService service = new BonusService();

		BigDecimal calcularBonus = service
				.calcularBonus(new Funcionario("Gabriel", LocalDate.now(), new BigDecimal("2500")));

		assertEquals(new BigDecimal("250.0"), calcularBonus);

	}
	
	@Test
	void bonusDeveriaSerDezPorCentroParaSalarioDe10000() {
		BonusService service = new BonusService();

		BigDecimal calcularBonus = service
				.calcularBonus(new Funcionario("Gabriel", LocalDate.now(), new BigDecimal("10000")));

		assertEquals(new BigDecimal("1000.0"), calcularBonus);

	}
}
