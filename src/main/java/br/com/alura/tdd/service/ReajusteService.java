package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario f, Desempenho desempenho ) {
		
			BigDecimal percentual = desempenho.percentualReajuste();
			BigDecimal reajuste = f.getSalario().multiply(percentual);
			f.reajustarSalario(reajuste);
		
		
		
	

}}
