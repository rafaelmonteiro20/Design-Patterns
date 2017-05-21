package com.financeiro.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.financeiro.printer.LogPrinter;

public abstract class Logger {

	public void log(String message) {
		LogPrinter printer = createLogger();
		message = getDateAndTime() + "\n" + message;
		printer.print(message);
	}
	
	protected abstract LogPrinter createLogger();
	
	private String getDateAndTime() {
		LocalDateTime agora = LocalDateTime.now();
		return agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm"));
	}
	
}