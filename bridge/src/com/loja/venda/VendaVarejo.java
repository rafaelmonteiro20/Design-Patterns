package com.loja.venda;

import com.loja.TipoEntrega;
import com.loja.Venda;

public class VendaVarejo extends Venda {

	public VendaVarejo(TipoEntrega tipoEntrega) {
		super(tipoEntrega);
	}

	@Override
	protected double preco() {
		return getItens().stream()
				.mapToDouble(Item::total).sum();
	}

}
