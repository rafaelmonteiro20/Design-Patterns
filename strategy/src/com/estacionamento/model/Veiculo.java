package com.estacionamento.model;

import java.time.LocalDateTime;

public class Veiculo {

	private final String placa;
	
	private final TipoVeiculo tipo;
	
	private final LocalDateTime horaDaEntrada;
	
	public Veiculo(String placa, TipoVeiculo tipo, LocalDateTime horaDaEntrada) {
		this.placa = placa;
		this.tipo = tipo;
		this.horaDaEntrada = horaDaEntrada;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public TipoVeiculo getTipo() {
		return tipo;
	}
	
	public LocalDateTime getHoraDaEntrada() {
		return horaDaEntrada;
	}
	
	public double getTotalConta() {
		return tipo.getCalculadora().calcular(this);
	}

	@Override
	public String toString() {
		return "Veiculo [placa = " + placa + ", tipo = " + tipo + ", horaDaEntrada = " + horaDaEntrada + "]";
	}
	
}