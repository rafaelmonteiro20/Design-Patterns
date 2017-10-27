package com.loja.entrega;

import com.loja.TipoEntrega;
import com.loja.Venda;

public class EntregaNormal implements TipoEntrega {

	@Override
	public double entrega(Venda venda) {
		return 50.0;
	}
	
}
