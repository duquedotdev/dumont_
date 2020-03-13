package dev.duque.dumont.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dev.duque.dumont.models.Aeronauta;

@Repository
@Transactional

public class AeronautaDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void salvarAeronauta(Aeronauta aeronauta) {
		manager.persist(aeronauta);		
	}

	public List<Aeronauta> listarAeronautas() {
		return manager.createQuery("select p from Aeronauta p", Aeronauta.class)
				.getResultList();		
		
	}
		

}
