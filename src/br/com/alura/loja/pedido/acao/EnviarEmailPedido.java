package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {
	
	public void executar(Pedido pedido) {
		
		
	}

	@Override
	public void execute(Pedido pedido) {
		System.out.println("Enviar email");
		
	}

}
