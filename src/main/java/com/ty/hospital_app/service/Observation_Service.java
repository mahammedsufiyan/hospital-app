package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dto.Observation;

public interface Observation_Service {
	Observation createObservation(Observation observation, int encounter_id);

	Observation getObservationById(int observation_id);

	List<Observation> getObservationByEncounterId(int encounter_id);

	Observation updateObservation(Observation observation, int observation_id);

	boolean deleteObservation(int observation_id);

}
