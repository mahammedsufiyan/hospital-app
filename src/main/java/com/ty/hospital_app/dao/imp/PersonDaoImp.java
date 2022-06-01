package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.Person_Dao;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.Person;

public class PersonDaoImp implements Person_Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = null;

	public Person savePerson(Person person) {
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		return entityManager.find(Person.class, person.getId());

	}

	public Person getPersonById(int person_id) {
		Person person = entityManager.find(Person.class, person_id);
		if (person != null) {
			return person;
		} else {
			return null;
		}
	}

	public List<Encounter> getPersonEncountersByPersonId(int person_id) {
		Person person = entityManager.find(Person.class, person_id);
		if (person != null) {
			List<Encounter> encounters = person.getEncounter();
			return encounters;
		} else {
			return null;
		}
	}

	public List<Person> getAllPerson() {
		String sql = "select t from Person t ";
		Query query = entityManager.createQuery(sql);
		List<Person> persons = query.getResultList();
		if (persons != null) {
			return persons;
		} else {
			return null;
		}

	}

	public Person updatePerson(Person person, int person_id) {
		
		entityTransaction = entityManager.getTransaction();
		Person person2 = entityManager.find(Person.class, person_id);
		if (person2 != null) {
			person.setId(person_id);
			entityTransaction.begin();
			entityManager.merge(person);
			entityTransaction.commit();
			return person;
		} else {
			return null;
		}
	}

	public boolean deletePerson(int person_id) {
		entityTransaction = entityManager.getTransaction();
		Person person = entityManager.find(Person.class, person_id);
		if (person != null) {
			person.setId(person_id);
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
			return true;
		} else {

			return false;
		}
	}

}
