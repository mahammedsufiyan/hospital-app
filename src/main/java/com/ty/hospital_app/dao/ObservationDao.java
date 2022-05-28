package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Observation;

public interface ObservationDao {

	Observation createObservation (Observation observation,int encounter_id ); 
	Observation getObservationById(int observation_id);
	List<Observation> getObservationsByEncounterId(int encounter_id);
	Observation updateObservation(Observation observation ,int observation_id);  
	boolean deleteObservation (int observation_id);                                                                        
}