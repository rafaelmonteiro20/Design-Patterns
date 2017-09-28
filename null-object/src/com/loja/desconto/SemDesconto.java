package com.loja.desconto;

import com.loja.Desconto;

public class SemDesconto implements Desconto {

	@Override
	public double darDesconto(double valorOriginal) {
		return valorOriginal;
	}

}
