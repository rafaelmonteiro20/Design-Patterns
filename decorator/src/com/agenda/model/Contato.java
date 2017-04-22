package com.agenda.model;

public class Contato {

	private Long id;
	
	private String nome;
	
	private String celular;

	public Contato(Long id, String nome, String celular) {
		this.id = id;
		this.nome = nome;
		this.celular = celular;
	}
	
	public Contato() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Override
	public String toString() {
		return "Contato [id = " + id + ", nome = " + nome + ", celular = " + celular + "]";
	}
	
}