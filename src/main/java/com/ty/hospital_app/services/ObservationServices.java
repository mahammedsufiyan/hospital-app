package com.ty.hospital_app.services;

import java.util.List;

import com.ty.hospital_app.dto.Observation;

public interface ObservationServices {

	Observation createObservation (Observation observation,int encounter_id ); 
	Observation getObservationById(int observation_id);
	List<Observation> getObservationsByEncounterId(int encounter_id);
	Observation updateObservation(Observation observation ,int observation_id);  
	boolean deleteObservation (int observation_id);                                                                        
}