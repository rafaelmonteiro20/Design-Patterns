package com.financeiro.logger.impl;

import com.financeiro.logger.Logger;
import com.financeiro.printer.LogPrinter;
import com.financeiro.printer.impl.ConsoleLogPrinter;

public class ConsoleLogger extends Logger {

	@Override
	protected LogPrinter createLogger() {
		return new ConsoleLogPrinter();
	}

}