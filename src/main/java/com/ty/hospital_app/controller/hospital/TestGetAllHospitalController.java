package com.ty.hospital_app.controller.hospital;

import java.util.List;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.imp.HospitalServiceImp;

public class TestGetAllHospitalController {
	public static void main(String[] args) {

		HospitalServiceImp hospitalServiceImp = new HospitalServiceImp();
		List<Hospital> hospitals = hospitalServiceImp.getAllHospital();
		int count = 1;
		if (hospitals != null) {
			for (Hospital hospital : hospitals) {
				System.out.println(count + " ===here is the details of hospital======");
				System.out.println("hospital name is : " + hospital.getName());
				System.out.println("hospital website is : " + hospital.getWebsite());
				System.out.println("hospital id is : " + hospital.getId());
				count++;
			}
		} else {
			System.out.println("there is no hospital to show");
		}
	}

}
