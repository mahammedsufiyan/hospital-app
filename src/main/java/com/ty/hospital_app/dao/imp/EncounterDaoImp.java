package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital_app.dao.Encounter_Dao;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.Person;

public class EncounterDaoImp implements Encounter_Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = null;

	public Encounter saveEncounter(int branch_id, int person_id, Encounter encounter) {
		entityTransaction = entityManager.getTransaction();
		Branch branch = entityManager.find(Branch.class, branch_id);
		Person person = entityManager.find(Person.class, person_id);
		if (branch != null && person != null) {
			entityTransaction.begin();
			encounter.setBranch(branch);
			encounter.setPerson(person);
			entityManager.persist(encounter);
			entityTransaction.commit();
			return entityManager.find(Encounter.class, encounter.getId());
		} else {
			return null;
		}
	}

	public Encounter getEncounterById(int id) {
		Encounter encounter = entityManager.find(Encounter.class, id);
		if (encounter != null) {
			return encounter;
		} else {
			return null;
		}
	}

	public List<Encounter> getEncountersByBranchId(int branch_id) {
		Branch branch = entityManager.find(Branch.class, branch_id);
		if (branch != null) {
			List<Encounter> encounters = branch.getencounter();
			return encounters;
		} else {

			return null;
		}
	}

	public Encounter updateEncounter(Encounter encounter, int encounter_id) {
		entityTransaction = entityManager.getTransaction();
		Encounter encounter2 = entityManager.find(Encounter.class, encounter_id);
		if (encounter2 != null) {
			entityTransaction.begin();
			encounter.setId(encounter_id);
			entityManager.merge(encounter);
			entityTransaction.commit();
			return entityManager.find(Encounter.class, encounter.getId());
		} else {
			return null;
		}
	}

	public boolean deleteEncounter(int encounter_id) {
		entityTransaction = entityManager.getTransaction();
		Encounter encounter = entityManager.find(Encounter.class, encounter_id);
		if (encounter != null) {
			entityTransaction.begin();
			entityManager.remove(encounter);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

}
