package com.loja.entrega;

import com.loja.TipoEntrega;
import com.loja.Venda;

public class FreteGratis implements TipoEntrega {

	@Override
	public double entrega(Venda venda) {
		return 0;
	}

}
