import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImposto;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

public class Main {

	public static void main(String[] args) {
		
		
		Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);
		
		CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
		
		System.out.println(calculadora.calcular(orcamento, new ISS()));
		System.out.println(calculadora.calcular(orcamento, new ICMS()));
		

	}

}
