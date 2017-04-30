package com.estacionamento.service;

import java.time.Duration;
import java.time.LocalDateTime;

import com.estacionamento.model.Veiculo;

public class CalculadoraTaxaCarro implements Calculadora {

	private static final double TAXA_HORA = 5.0;
	
	private static final double DIARIA = 30.0;
	
	@Override
	public double calcular(Veiculo veiculo) {
		LocalDateTime entrada = veiculo.getHoraDaEntrada();
		LocalDateTime agora = LocalDateTime.now();
		
		Duration duracao = Duration.between(entrada, agora);
		long horas = duracao.toHours();
		
		//Se passar de 6 horas paga a diária
		if(horas < 6)
			return TAXA_HORA * horas;
		
		return DIARIA;
	}

}