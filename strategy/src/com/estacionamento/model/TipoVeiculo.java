package com.estacionamento.model;

import com.estacionamento.service.Calculadora;
import com.estacionamento.service.CalculadoraTaxaCarro;
import com.estacionamento.service.CalculadoraTaxaMoto;

public enum TipoVeiculo {

	CARRO {
		@Override
		public Calculadora getCalculadora() {
			return new CalculadoraTaxaCarro();
		}
	},
	
	MOTO {
		@Override
		public Calculadora getCalculadora() {
			return new CalculadoraTaxaMoto();
		}
	};
	
	public abstract Calculadora getCalculadora();
	
}