package algaworks;

import java.util.ArrayList;
import java.util.List;

import desconto.CalculadoraFaixaDesconto;
import test.QuantidadeItensInvalidaException;

public class Pedido {
	
	private List<ItemPedido> itens = new ArrayList<>();
	
	private CalculadoraFaixaDesconto calculadoraFaixaDesconto;
	
	public Pedido(CalculadoraFaixaDesconto calculadoraFaixaDesconto) {
		this.calculadoraFaixaDesconto = calculadoraFaixaDesconto;
	}

	public void adicionarItem(ItemPedido itemPedido) {
		validarQuantidadeItens(itemPedido);
		itens.add(itemPedido);
	}

	private void validarQuantidadeItens(ItemPedido itemPedido) {
		if(itemPedido.getQuantidade() < 0) {
			throw new  QuantidadeItensInvalidaException();
		}
	}

	public ResumoPedido resumo() {
		double valorTotal = itens.stream().mapToDouble(i -> i.getValorUnitario() * i.getQuantidade()).sum();
		double desconto = calculadoraFaixaDesconto.desconto(valorTotal);
		 
		return new ResumoPedido(valorTotal, desconto);
	}
	
}
