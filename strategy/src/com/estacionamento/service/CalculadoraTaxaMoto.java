package com.estacionamento.service;

import com.estacionamento.model.Veiculo;

public class CalculadoraTaxaMoto implements Calculadora {

	private static final double TAXA_UNICA = 10.0;
	
	@Override
	public double calcular(Veiculo veiculo) {
		return TAXA_UNICA;
	}

}