package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido{
	
	@Override
	public void execute(Pedido pedido) {
		System.out.println("Salvando no banco de dados.");
	}

}
