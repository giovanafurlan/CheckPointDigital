package br.com.fiap.usuario.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.fiap.usuario.model.Formulario;

public class FormularioDao {
	
	public void create(Formulario formulario) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("progamer-persistence-unit");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(formulario);
		manager.getTransaction().commit();
		
		manager.clear();
	}
	
	public List<Formulario> listAll(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("progamer-persistence-unit");
		EntityManager manager = factory.createEntityManager();

		TypedQuery<Formulario> query = manager.createQuery("SELECT s FROM Formulario s", Formulario.class);
		
		return query.getResultList();
	}

}
