package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {
	
	@Test
	public void reajusteDeveriaSerDeTresPorcentroQuandoDesempenhoForADesejar() {
		ReajusteService service = new ReajusteService();
		Funcionario f = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));
		
		service.concederReajuste(f, Desempenho.A_DESEJAR);
		
		assertEquals(new BigDecimal("1030.00"), f.getSalario());
		
	}
	
	@Test
	public void reajusteDeveriaSerDeQuinzePorcentroQuandoDesempenhoForBom() {
		ReajusteService service = new ReajusteService();
		Funcionario f = new Funcionario("Gabriel", LocalDate.now(), new BigDecimal("1000.00"));
		
		service.concederReajuste(f, Desempenho.BOM_DESEMPENHO);
		
		assertEquals(new BigDecimal("1150.00"), f.getSalario());
		
	}
	
	@Test
	public void reajusteDeveriaSerDeVintePorcentroQuandoDesempenhoForBom() {
		ReajusteService service = new ReajusteService();
		Funcionario f = new Funcionario("Gabriel", LocalDate.now(), new BigDecimal("1000.00"));
		
		service.concederReajuste(f, Desempenho.OTIMO_DESEMPENHO);
		
		assertEquals(new BigDecimal("1200.00"), f.getSalario());
	}
	

}
