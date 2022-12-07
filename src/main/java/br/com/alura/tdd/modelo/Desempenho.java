package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {
	A_DESEJAR {
		@Override
		public BigDecimal percentualReajuste() {
			// TODO Auto-generated method stub
			return new BigDecimal("0.03");
		}
	},
	BOM_DESEMPENHO {
		@Override
		public BigDecimal percentualReajuste() {
			// TODO Auto-generated method stub
			return new BigDecimal("0.15");
		}
	},
	OTIMO_DESEMPENHO {
		@Override
		public BigDecimal percentualReajuste() {
			// TODO Auto-generated method stub
			return new BigDecimal("0.20");
		}
	};
	
	public abstract BigDecimal percentualReajuste();

}
