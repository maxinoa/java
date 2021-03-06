package ar.com.dcsys.model;

import java.util.List;

import ar.com.dcsys.data.person.Person;
import ar.com.dcsys.data.person.types.PersonType;
import ar.com.dcsys.exceptions.PersonException;

public interface PersonsManager {

//	public Person findByPrincipal(DCSysPrincipal principal) throws PersonException;
	
	public List<Person> findAll() throws PersonException;
	public List<Person> findAllBy(List<PersonType> types) throws PersonException;
	
	public Person findById(String id) throws PersonException;
	public Person findByDni(String dni) throws PersonException;
	
	public String persist(Person p) throws PersonException;
	public void remove(Person p) throws PersonException;	

	public List<PersonType> findAllTypes() throws PersonException;
	
	//public Person findByStudentNumber(String studentNumber) throws PersonException;	
	
}
