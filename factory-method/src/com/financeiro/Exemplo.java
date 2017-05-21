package com.financeiro;

import com.financeiro.logger.Logger;
import com.financeiro.logger.impl.TxtLogger;
import com.financeiro.service.CalculadoraImposto;

public class Exemplo {

	public static void main(String[] args) {

		Logger logger = new TxtLogger(); // ou new ConsoleLogger();
		CalculadoraImposto calculadora = new CalculadoraImposto(logger);
		calculadora.calcular(1000.0);
		
	}
	
}