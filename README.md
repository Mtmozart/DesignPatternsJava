


# DesignPatternsJava

# Padrões do curso que eu estudo:

- Pattern Strategy -- link: https://refactoring.guru/design-patterns/strategy

O Pattern Strategy é um padrão comportamental que permite definir uma família de algoritmos, encapsulá-los e torná-los intercambiáveis. Isso permite que o cliente escolha o algoritmo a ser utilizado dinamicamente.

Quando utilizar: quando eu tenho um parâmetro e sabe que aquela regra é baseada naquela parâmetro.

```java
public class MeuImposto implements Imposto {

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        // Implemente a lógica de cálculo do imposto aqui
    }
}
//----------------
public class ISS implements Imposto{

 	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}
}
//----------------
public class ICMS implements Imposto{

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}
}

public static void main(String[] args) {
		
		
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		
		CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
		
		System.out.println(calculadora.calcular(orcamento, new ISS()));
		System.out.println(calculadora.calcular(orcamento, new ICMS()));
		

	}


```
- Chain of Responsibility: é um padrão de design comportamental que visa criar uma cadeia de objetos que possam tratar solicitações de forma sequencial. Nesse padrão, cada objeto na cadeia possui a capacidade de processar uma solicitação ou passá-la adiante para o próximo objeto na cadeia. 

Aplicandp:

	```java
public abstract class Desconto {
	
	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	public  abstract BigDecimal calcular(Orcamento orcamento);
	
}
//----------------
public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends Desconto {
	public DescontoParaOrcamentoComValorMaiorQueQuinhentos(Desconto proximo) {
		super(proximo);

	}
	public BigDecimal calcular(Orcamento orcamento) {

		if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
			return orcamento.getValor().multiply(new BigDecimal("0.05"));
		}
		return proximo.calcular(orcamento);
	}

}
//----------------
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
//----------------
public class SemDesconto extends Desconto {
	public SemDesconto() {
		super(null);
	}
	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;

	}
}
//----------------
public class CalculadoraDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoParaOrcamentoParaMaisDe05Itens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
						new SemDesconto())
				);
		
		return desconto.calcular(orcamento);
		}		
	}

```

- Template Method - A ideia deste padrão é que tenhamos um método que funcione como um template/modelo de modo que faz parte do processo e o restante é delegado, exemplo de aplicação:
link: https://refactoring.guru/design-patterns/template-method.

```java
public abstract class Desconto {
	
	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	public BigDecimal calcular(Orcamento orcamento) {
		if(deveAplicar(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		return proximo.calcular(orcamento);
	};
	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	public abstract boolean deveAplicar(Orcamento orcamento);
	
}
//---------------- As classes filhas ficam a implementação total, sendo um bom uso da herança:
@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}
	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}


```

- State

- Command

- Observer
