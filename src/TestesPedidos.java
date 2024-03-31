import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.GeraPedidoHandle;
import br.com.alura.loja.pedido.GerarPedido;
import br.com.alura.loja.pedido.Pedido;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestesPedidos {
	
	public static void main(String[] args) {
		String cliente = "Matheus";
		BigDecimal valorOrcamento = new BigDecimal("300");
		int quantidade	= Integer.parseInt("2");		
		GerarPedido gerador = new GerarPedido(cliente, valorOrcamento, quantidade);
		GeraPedidoHandle geradorHandler = new GeraPedidoHandle(
				Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido())
				);
		geradorHandler.execulte(gerador);
	}

}
