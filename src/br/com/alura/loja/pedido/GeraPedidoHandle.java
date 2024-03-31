package br.com.alura.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcaoAposGerarPedido;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class GeraPedidoHandle {
	
	private List<AcaoAposGerarPedido> acoes;

	

	public GeraPedidoHandle(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void execulte(GerarPedido gerar) {
		Orcamento orcamento = new Orcamento(gerar.getValorOrcamento(), gerar.getQuantidadeItens());
		String cliente = gerar.getCliente();
		Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);
		
		acoes.forEach(a -> a.execute(pedido));
	}
}
