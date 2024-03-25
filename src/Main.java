import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImposto;
import br.com.alura.loja.imposto.TipoImposto;
import br.com.alura.loja.orcamento.Orcamento;

public class Main {

	public static void main(String[] args) {
		
		
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		
		CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
		
		System.out.println(calculadora.calcular(orcamento, TipoImposto.ISS));
		

	}

}
