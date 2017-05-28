package com.loja.model;

import com.loja.boleto.Boleto;
import com.loja.boleto.bb.BBBoleto;
import com.loja.boleto.cef.CEFBoleto;

public enum Banco {

	BB {
		@Override
		public Boleto getBoleto() {
			return new BBBoleto();
		}
	},
	
	CEF {
		@Override
		public Boleto getBoleto() {
			return new CEFBoleto();
		}
	};
	
	public abstract Boleto getBoleto();
	
}