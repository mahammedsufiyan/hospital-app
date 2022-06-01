package com.ty.hospital_app.controller.observation;

import com.ty.hospital_app.dto.Observation;
import com.ty.hospital_app.service.imp.ObservationServiceImp;

public class TestGetObservationByIdController {
	public static void main(String[] args) {
		
		ObservationServiceImp observationServiceImp=new ObservationServiceImp();
		Observation  observation=observationServiceImp.getObservationById(2);
		if(observation!=null) {
			System.out.println(observation.getWriterName());
			System.out.println(observation.getDescription());
			System.out.println(observation.getStatus());
			System.out.println(observation.getLocal_date_time());
		}else {
			System.out.println("there is no observation id is present to display");
		}
	}

}
