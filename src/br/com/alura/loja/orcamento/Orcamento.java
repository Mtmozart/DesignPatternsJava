package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

	private BigDecimal valor;
	private int quantidadeItems;
	
	

	public Orcamento(BigDecimal valor, int quantidadeItems) {
		this.valor = valor;
		this.quantidadeItems = quantidadeItems;
	}



	public BigDecimal getValor() {
		return valor;
	}
	

	public int getQuantidadeItems() {
		return quantidadeItems;
	}


	
	
	
}
