package com.algaworks.tdd.service;

import java.util.List;

import com.algaworks.tdd.model.Pedido;

public class PedidoService {
	
	private List<AcaoLancamentoPedido> acoes;
	
	public PedidoService(List<AcaoLancamentoPedido> acoes) {
		this.acoes = acoes;
	}

	public double lancar(Pedido pedido) {
		double imposto = pedido.getValor() * 0.1;
		
		acoes.forEach(a -> a.executar(pedido));
		
		return imposto;
	}

	public Pedido pagar(Long codigoPedido) {
		// TODO Auto-generated method stub
		return null;
	}

}
