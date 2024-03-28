package desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto cadeiaDeDescontos = new DescontoParaOrcamentoParaMaisDe05Itens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
						new SemDesconto())
				);
		
		return cadeiaDeDescontos.calcular(orcamento);
		}		
	}

