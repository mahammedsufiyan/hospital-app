package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital_app.dao.Observation_Dao;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.Observation;

public class ObservationDaoImp implements Observation_Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = null;

	public Observation createObservation(Observation observation, int encounter_id) {
		entityTransaction = entityManager.getTransaction();
		Encounter encounter = entityManager.find(Encounter.class, encounter_id);
		if (encounter != null) {
			entityTransaction.begin();
			observation.setEncounter(encounter);
			
			
			entityManager.persist(observation);
			entityTransaction.commit();
			return entityManager.find(Observation.class, observation.getId());

		} else {
			return null;
		}
	}

	public Observation getObservationById(int observation_id) {
		Observation observation = entityManager.find(Observation.class, observation_id);
		if (observation != null) {
			return observation;
		} else {
			return null;
		}
	}

	public List<Observation> getObservationByEncounterId(int encounter_id) {
		Encounter encounter = entityManager.find(Encounter.class, encounter_id);
		if (encounter != null) {
			List<Observation> observations = encounter.getObservations();
			return observations;
		} else {
			return null;
		}
	}

	public Observation updateObservation(Observation observation, int observation_id) {
		entityTransaction = entityManager.getTransaction();
		Observation observation2 = entityManager.find(Observation.class, observation_id);
		if (observation2 != null) {
			entityTransaction.begin();
			entityManager.merge(observation);
			entityTransaction.commit();
			return entityManager.find(Observation.class, observation.getId());
		} else {
			return null;
		}
	}

	public boolean deleteObservation(int observation_id) {
		entityTransaction = entityManager.getTransaction();
		Observation observation = entityManager.find(Observation.class, observation_id);
		if (observation != null) {
			entityTransaction.begin();
			entityManager.remove(observation);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

}
