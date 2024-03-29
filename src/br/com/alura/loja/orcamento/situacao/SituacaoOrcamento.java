package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

import br.com.alura.loja.exception.DomainException;


public abstract class SituacaoOrcamento {
	
	public BigDecimal CalcularDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	public void aprovar(Orcamento orcamento) {
		throw new DomainException("Orcamento não pode ser aprovado.");
	}
	public void reprovar(Orcamento orcamento) {
		throw new DomainException("Orcamento não pode ser reprovado.");
	}
	public void finalizar(Orcamento orcamento) {
		throw new DomainException("Orcamento não pode ser finalizado.");
	}
}	
	

