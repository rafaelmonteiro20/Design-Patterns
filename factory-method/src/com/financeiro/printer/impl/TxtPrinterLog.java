package com.financeiro.printer.impl;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.financeiro.printer.LogPrinter;

public class TxtPrinterLog implements LogPrinter {

	private String arquivo;
	
	public TxtPrinterLog(String arquivo) {
		this.arquivo = arquivo;
	}
	
	@Override
	public void print(String message) {
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(this.arquivo))) {
			writer.write(message);
		} catch (IOException e) {
			throw new RuntimeException("Erro ao escrever o log no arquivo.");
		}
	}
}