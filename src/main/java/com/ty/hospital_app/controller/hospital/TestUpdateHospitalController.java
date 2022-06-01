package com.ty.hospital_app.controller.hospital;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.imp.HospitalServiceImp;

public class TestUpdateHospitalController {
	public static void main(String[] args) {
		
		Hospital hospital=new Hospital();
		hospital.setName("ganesha hospital");
		hospital.setWebsite("www.ganeshahospital.com");
		
		HospitalServiceImp hospitalServiceImp=new HospitalServiceImp();
		Hospital hospital2=hospitalServiceImp.updateHospital(hospital, 3);
		if(hospital2!=null) {
			System.out.println("hospital is updated based on id of hospital");
		}else {
			System.out.println("hospital is not updated because there is no hospital or hospital id is not present to update");
		}
	}

}
