package com.ty.hospital_app.service.imp;

import java.util.List;

import com.ty.hospital_app.dao.imp.PersonDaoImp;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.Person;
import com.ty.hospital_app.service.Person_Service;

public class PersonServiceImp implements Person_Service{
PersonDaoImp personDao=new PersonDaoImp();
	public Person savePerson(Person person) {
		
		return personDao.savePerson(person);
	}

	public Person getPersonById(int person_id) {
		
		return personDao.getPersonById(person_id);
	}

	public List<Encounter> getPersonEncountersByPersonId(int person_id) {
		
		return personDao.getPersonEncountersByPersonId(person_id);
	}

	public List<Person> getAllPerson() {
		
		return personDao.getAllPerson();
	}

	public Person updatePerson(Person person, int person_id) {
		
		return personDao.updatePerson(person, person_id);
	}

	public boolean deletePerson(int person_id) {
		
		return personDao.deletePerson(person_id);
	}

}
