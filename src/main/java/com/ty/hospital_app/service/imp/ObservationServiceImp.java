package com.ty.hospital_app.service.imp;

import java.util.List;

import com.ty.hospital_app.dao.imp.ObservationDaoImp;
import com.ty.hospital_app.dto.Observation;
import com.ty.hospital_app.service.Observation_Service;

public class ObservationServiceImp implements Observation_Service {
	ObservationDaoImp observationDao = new ObservationDaoImp();

	public Observation createObservation(Observation observation, int encounter_id) {

		return observationDao.createObservation(observation, encounter_id);
	}

	public Observation getObservationById(int observation_id) {

		return observationDao.getObservationById(observation_id);
	}

	public List<Observation> getObservationByEncounterId(int encounter_id) {

		return observationDao.getObservationByEncounterId(encounter_id);
	}

	public Observation updateObservation(Observation observation, int observation_id) {

		return observationDao.updateObservation(observation, observation_id);
	}

	public boolean deleteObservation(int observation_id) {

		return observationDao.deleteObservation(observation_id);
	}

}
