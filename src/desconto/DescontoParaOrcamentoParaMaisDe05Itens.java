package desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoParaMaisDe05Itens extends Desconto{
	public DescontoParaOrcamentoParaMaisDe05Itens(Desconto proximo) {
		super(proximo);
	}
	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	
	}
	
	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItems() > 5;
	}
	
}
