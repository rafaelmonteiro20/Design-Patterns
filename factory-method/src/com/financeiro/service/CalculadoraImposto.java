package com.financeiro.service;

import com.financeiro.logger.Logger;

public class CalculadoraImposto {

	private Logger logger;

	public CalculadoraImposto(Logger logger) {
		this.logger = logger;
	}

	public void calcular(double valor) {
		double imposto = valor * 0.07;
		logger.log("Valor R$ " + valor + "\nImposto R$ " + imposto);
	}
	
}