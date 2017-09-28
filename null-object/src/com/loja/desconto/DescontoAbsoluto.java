package com.loja.desconto;

import com.loja.Desconto;

public class DescontoAbsoluto implements Desconto {

	private double valorDesconto;
	
	public DescontoAbsoluto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	@Override
	public double darDesconto(double valorOriginal) {
		return valorOriginal - valorDesconto;
	}

}
