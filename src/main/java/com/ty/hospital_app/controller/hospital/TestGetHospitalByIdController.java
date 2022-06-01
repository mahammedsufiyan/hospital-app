package com.ty.hospital_app.controller.hospital;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.imp.HospitalServiceImp;

public class TestGetHospitalByIdController {
	public static void main(String[] args) {
		
		HospitalServiceImp hospitalServiceImp=new HospitalServiceImp();
		Hospital hospital=hospitalServiceImp.getHospitalById(3);
		if(hospital!=null) {
			System.out.println("========here is the details of hospital==========");
			System.out.println("hospital name is : "+hospital.getName());
			System.out.println("hospital website is : "+hospital.getWebsite());
			System.out.println("hospital id is : "+hospital.getId());
		}else {
			System.out.println("there is no hospital to display on that particular id");
		}
	}

}
