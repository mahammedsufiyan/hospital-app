package com.ty.hospital_app.controller.hospital;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.imp.HospitalServiceImp;

public class TestDeleteHospital {
	public static void main(String[] args) {
		
		HospitalServiceImp hospitalServiceImp=new HospitalServiceImp();
		boolean result=hospitalServiceImp.deleteHospital(3);
		if(result) {
			System.out.println("hospital is deleted based on hospital id");
		}else {
			System.out.println("hospital is not deleted because hospital id is not present");
		}
	}

}
