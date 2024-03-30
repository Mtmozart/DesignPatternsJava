package br.com.alura.loja.pedido;

import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;

public class GeraPedidoHandle {

	// contrutor com injeção de dependências: repository, servicer o que for

	public void execulte(GerarPedido gerar) {
		Orcamento orcamento = new Orcamento(gerar.getValorOrcamento(), gerar.getQuantidadeItens());

		String cliente = gerar.getCliente();

		Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);

		System.out.print("Salvar um Pedido no Banco de Dados");
		System.out.print("Enviar e-mail com dados do novo pedido;");
	}
}
