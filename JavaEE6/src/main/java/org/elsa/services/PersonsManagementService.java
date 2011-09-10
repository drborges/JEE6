package org.elsa.services;

import javax.ejb.Stateful;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.elsa.domain.Person;

@Stateful
public class PersonsManagementService {

	@PersistenceContext
	private EntityManager entityManager;
	
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void create(Person newPerson) {
		
		entityManager.persist(newPerson);
	}
}
