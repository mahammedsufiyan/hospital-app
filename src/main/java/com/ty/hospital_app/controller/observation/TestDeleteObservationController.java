package com.ty.hospital_app.controller.observation;

import com.ty.hospital_app.service.imp.ObservationServiceImp;

public class TestDeleteObservationController {
	public static void main(String[] args) {
		ObservationServiceImp observationServiceImp=new ObservationServiceImp();
		boolean result=observationServiceImp.deleteObservation(2);
		if(result) {
			System.out.println("yes observation deleted based on observation id");
		}else {
			System.out.println("yes observation not deleted because  observation id is not present");
		}
	}

}
