package com.aeroporto;

public class TrechoAereoComEscala implements TrechoAereo {

	private TrechoAereo inicio;
	private TrechoAereo termino;

	public TrechoAereoComEscala(TrechoAereo inicio, TrechoAereo termino) {
		if(!inicio.getDestino().equals(termino.getOrigem()))
			throw new RuntimeException();
		
		this.inicio = inicio;
		this.termino = termino;
	}

	@Override
	public String getOrigem() {
		return inicio.getOrigem();
	}

	@Override
	public String getDestino() {
		return termino.getDestino();
	}

	@Override
	public int getCusto() {
		return inicio.getCusto() + termino.getCusto();
	}

	@Override
	public int getDistancia() {
		return inicio.getDistancia() + termino.getDistancia();
	}

}
