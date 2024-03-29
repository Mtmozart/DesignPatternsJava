package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.situacao.Analise;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {

	private BigDecimal valor;
	private int quantidadeItems;
	private SituacaoOrcamento situacao;

	public Orcamento(BigDecimal valor, int quantidadeItems) {
		this.valor = valor;
		this.quantidadeItems = quantidadeItems;
		this.situacao = new Analise();
	}

	public void aplicarDescontoExtraa() {
		BigDecimal valorDoDescontoExtra = this.situacao.CalcularDescontoExtra(this);
		this.valor = this.valor.subtract(valorDoDescontoExtra);
	}
	
	public void aprovar() {
		this.situacao.aprovar(this);
	}
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	
	public void finalizar() {
		this.situacao.finalizar(this);
	}	

	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidadeItems() {
		return quantidadeItems;
	}
	public SituacaoOrcamento getSituacaoOrcamento() {
		return this.situacao;
	}
	public void setSituacaoOrcamento(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

}
