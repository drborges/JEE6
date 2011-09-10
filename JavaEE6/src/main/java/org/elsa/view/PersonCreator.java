package org.elsa.view;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import org.elsa.domain.Person;
import org.elsa.services.PersonsManagementService;

@Model
public class PersonCreator {

	private Person newPerson = new Person();
	
	@Inject
	private PersonsManagementService service;
	
	public void save() {
		System.out.println(newPerson);
		service.create(getNewPerson());
	}

	public Person getNewPerson() {
		return newPerson;
	}

	public void setNewPerson(Person newPerson) {
		this.newPerson = newPerson;
	}
	
	
}
