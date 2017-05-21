package com.financeiro.printer.impl;

import com.financeiro.printer.LogPrinter;

public class ConsoleLogPrinter implements LogPrinter {

	@Override
	public void print(String message) {
		System.out.println(message);
	}

}