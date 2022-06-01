package com.ty.hospital_app.controller.observation;

import java.util.List;

import com.ty.hospital_app.dto.Observation;
import com.ty.hospital_app.service.imp.ObservationServiceImp;

public class TestGetObservationByEncounterIdController {
	public static void main(String[] args) {
		ObservationServiceImp observationServiceImp=new ObservationServiceImp();
		List<Observation> observations=observationServiceImp.getObservationByEncounterId(1);
		if(observations!=null) {
			for(Observation observation:observations) {
				System.out.println("====================");
				System.out.println(observation.getWriterName());
				System.out.println(observation.getDescription());
				System.out.println(observation.getStatus());
				System.out.println(observation.getLocal_date_time());
				System.out.println("======================");
			}
		}else {
			System.out.println("there is no observation list to show");
		}
	}

}
