import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.GeraPedidoHandle;
import br.com.alura.loja.pedido.GerarPedido;
import br.com.alura.loja.pedido.Pedido;

public class TestesPedidos {
	
	public static void main(String[] args) {
		String cliente = args[0];
		BigDecimal valorOrcamento = new BigDecimal(args[1]);
		int quantidade	= Integer.parseInt(args[2]);		
		GerarPedido gerador = new GerarPedido(cliente, valorOrcamento, quantidade);
		GeraPedidoHandle geradorHandler = new GeraPedidoHandle(/*teria uma dependencia*/);
		geradorHandler.execulte(gerador);
	
		
	}

}
