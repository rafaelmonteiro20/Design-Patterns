package com.agenda.dao;

import java.util.HashMap;
import java.util.Map;

import com.agenda.model.Contato;

public class CacheContatoDAO implements DAO {

	private DAO dao;
	
	private Map<Long, Contato> cache;
	
	public CacheContatoDAO(DAO dao) {
		this.dao = dao;
		this.cache = new HashMap<>();
	}
	
	@Override
	public void inserir(Contato contato) {
		dao.inserir(contato);
		cache.put(contato.getId(), contato);
	}

	@Override
	public Contato buscar(Long id) {
		if(cache.containsKey(id))
			return cache.get(id);
		
		Contato buscado = dao.buscar(id);
		
		if(buscado != null)
			cache.put(id, buscado);
		
		return buscado;
	}

	@Override
	public void excluir(Contato contato) {
		dao.excluir(contato);
		cache.remove(contato);
	}

}