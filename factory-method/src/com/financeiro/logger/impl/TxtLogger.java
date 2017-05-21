package com.financeiro.logger.impl;

import com.financeiro.logger.Logger;
import com.financeiro.printer.LogPrinter;
import com.financeiro.printer.impl.TxtPrinterLog;

public class TxtLogger extends Logger {

	@Override
	protected LogPrinter createLogger() {
		return new TxtPrinterLog("log.txt");
	}

}