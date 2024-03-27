package desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoParaMaisDe05Itens extends Desconto{
	public DescontoParaOrcamentoParaMaisDe05Itens(Desconto proximo) {
		super(proximo);
	}
	public BigDecimal calcular(Orcamento orcamento) {
		
		if (orcamento.getQuantidadeItems() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		return proximo.calcular(orcamento);
	}
}
