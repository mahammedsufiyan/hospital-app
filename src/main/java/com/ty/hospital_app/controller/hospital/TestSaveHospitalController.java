package com.ty.hospital_app.controller.hospital;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.imp.HospitalServiceImp;

public class TestSaveHospitalController {
	public static void main(String[] args) {
		
		Hospital hospital=new Hospital();
		hospital.setName("Jaaz hospital");
		hospital.setWebsite("www.jaaz@gmail.com");
		
		
		HospitalServiceImp hospitalServiceImp=new HospitalServiceImp();
	Hospital hospital2=hospitalServiceImp.saveHospital(hospital);
		if(hospital2!=null) {
			System.out.println("hospital created successfully");
		}else {
			System.out.println("hospital not added or created successfully");
		}
		
	}

}
