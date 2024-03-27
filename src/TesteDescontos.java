import java.math.BigDecimal;


import br.com.alura.loja.orcamento.Orcamento;
import desconto.CalculadoraDeDescontos;

public class TesteDescontos {

	public static void main(String[] args) {
		
		
		Orcamento orcamentoprimeiro = new Orcamento(new BigDecimal("100"), 6);
		Orcamento orcamentosegundo = new Orcamento(new BigDecimal("1000"), 1);
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(orcamentoprimeiro));
		System.out.println(calculadora.calcular(orcamentosegundo));
		
	}

}
