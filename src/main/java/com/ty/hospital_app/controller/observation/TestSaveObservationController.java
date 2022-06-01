package com.ty.hospital_app.controller.observation;

import java.time.LocalDateTime;
import java.util.Observable;

import com.ty.hospital_app.dto.Observation;
import com.ty.hospital_app.service.imp.ObservationServiceImp;

public class TestSaveObservationController {
	public static void main(String[] args) {
		
		Observation observation=new Observation();
		observation.setWriterName("kushal");
		observation.setDescription("Oversleep");
		observation.setStatus("High stage");
		observation.setLocal_date_time(LocalDateTime.of(2022, 1, 30, 3, 59));
		
		ObservationServiceImp observationServiceImp =new ObservationServiceImp();
		Observation observation2=observationServiceImp.createObservation(observation, 1);
		if(observation2!=null) {
			System.out.println("observation is over");
		}
		else {
			System.out.println("observation is not happen till now");
		}
	}

}
