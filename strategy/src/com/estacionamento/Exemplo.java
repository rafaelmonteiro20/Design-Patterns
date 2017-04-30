package com.estacionamento;

import static com.estacionamento.model.TipoVeiculo.CARRO;
import static com.estacionamento.model.TipoVeiculo.MOTO;

import java.time.LocalDateTime;

import com.estacionamento.model.Veiculo;

public class Exemplo {

	public static void main(String[] args) {
	
		LocalDateTime entrada1 = LocalDateTime.now().minusHours(5);
		LocalDateTime entrada2 = LocalDateTime.now().minusHours(2);
		
		Veiculo carro = new Veiculo("AAA1234", CARRO, entrada1);
		Veiculo moto = new Veiculo("BBB1234", MOTO, entrada2);
		
		System.out.println(carro.getTotalConta());
		System.out.println(moto.getTotalConta());
	}

}