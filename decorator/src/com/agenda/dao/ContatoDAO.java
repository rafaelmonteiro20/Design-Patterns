package com.agenda.dao;

import java.util.HashMap;
import java.util.Map;

import com.agenda.model.Contato;

public class ContatoDAO implements DAO {

	// Simulando o BD
	private static Map<Long, Contato> contatos = new HashMap<>();
	
	static {
		contatos.put(1L, new Contato(1L, "José", "(88) 9 9999-9999"));
		contatos.put(2L, new Contato(2L, "Maria", "(88) 9 8888-8888"));
		contatos.put(3L, new Contato(3L, "José", "(88) 9 7777-7777"));
	}
	
	@Override
	public void inserir(Contato contato) {
		contatos.put(contato.getId(), contato);
	}

	@Override
	public Contato buscar(Long id) {
		return contatos.get(id);
	}

	@Override
	public void excluir(Contato contato) {
		contatos.remove(contato.getId());
	}

}