package com.aeroporto;

public class TrechoAereoComConexao extends TrechoAereoComEscala {

	private int tarifa;
	
	public TrechoAereoComConexao(TrechoAereo inicio, TrechoAereo termino, int tarifa) {
		super(inicio, termino);
		this.tarifa = tarifa;
	}
	
	@Override
	public int getCusto() {
		return super.getCusto() + tarifa;
	}

}
