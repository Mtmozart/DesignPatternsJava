


# DesignPatternsJava

# Padrões do curso que eu estudo:

- Pattern Strategy

O Pattern Strategy é um padrão comportamental que permite definir uma família de algoritmos, encapsulá-los e torná-los intercambiáveis. Isso permite que o cliente escolha o algoritmo a ser utilizado dinamicamente.

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
- Chain of Responsibility

- Template Method

- State

- Command

- Observer
