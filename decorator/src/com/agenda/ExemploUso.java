package com.agenda;

import com.agenda.dao.CacheContatoDAO;
import com.agenda.dao.ContatoDAO;
import com.agenda.dao.DAO;
import com.agenda.model.Contato;

public class ExemploUso {

	public static void main(String[] args) {
		
		DAO dao = new CacheContatoDAO(new ContatoDAO());
		
		dao.inserir(new Contato(4L, "Rafael Monteiro", "(85) 9 9667-5555"));

		Contato c1 = dao.buscar(2L); //Na primeira vez será buscado no BD
		Contato c2 = dao.buscar(4L);
		
		System.out.println(c1);
		System.out.println(c2);
	}
	
}