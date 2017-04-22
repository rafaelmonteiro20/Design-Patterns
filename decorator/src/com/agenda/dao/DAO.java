package com.agenda.dao;

import com.agenda.model.Contato;

public interface DAO {

	void inserir(Contato contato);
	
	Contato buscar(Long id);
	
	void excluir(Contato contato);
	
}