package com.ty.hospital_app.controller.branch;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.imp.BranchServiceImp;

public class TestGetBranchHospitalByIdController {
	public static void main(String[] args) {
		BranchServiceImp branchServiceImp = new BranchServiceImp();
		Hospital hospital = branchServiceImp.getBranchHospitalById(12);
		if (hospital != null) {
			System.out.println("=======here is the details of hospital");
			System.out.println(hospital.getName());
			System.out.println(hospital.getWebsite());

		} else {
			System.out.println("we are not getting id of this  branch to give its hospital");
		}
	}

}
