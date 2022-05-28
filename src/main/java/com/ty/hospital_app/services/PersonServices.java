package com.ty.hospital_app.services;

import java.util.List;

import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.Person;

public interface PersonServices {

	Person savePerson(Person person);

	Person getPersonById(int person_id);

	List<Encounter> getPersonEncountersByPersonId(int person_id);

	List<Person> getAllPerson();

	Person updatePerson(Person person, int person_id);

	boolean deletePerson(int person_id);

}