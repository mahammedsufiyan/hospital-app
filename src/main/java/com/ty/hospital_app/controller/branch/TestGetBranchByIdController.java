package com.ty.hospital_app.controller.branch;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.service.imp.BranchServiceImp;

public class TestGetBranchByIdController {
	public static void main(String[] args) {

		BranchServiceImp branchServiceImp = new BranchServiceImp();
		Branch branch = branchServiceImp.getBranchById(13);
		if (branch != null) {
			System.out.println("===========here is detail of branch========");
			System.out.println("branch name is : " + branch.getName());
			System.out.println("branch email is : " + branch.getEmail());
			System.out.println("branch phone is : " + branch.getPhone());
			System.out.println("this branch belong to this hospital : " + branch.getHospital().getName());
			System.out.println("this branch belong to this hospital website is : " + branch.getHospital().getWebsite());
			//System.out.println("this branch belong to this hospital present in this city : " + branch.getAddress().getCity());
//			System.out.println("branch present in this city : "+branch.getAddress().getCity());
//			System.out.println("branch present in this country : "+branch.getAddress().getCountry());
//			System.out.println("branch present in this state : "+branch.getAddress().getState());
//			System.out.println("branch present in this branch : "+branch.getAddress().getBranch());
		} else {
			System.out.println("there is no branch present in this id to display branch");
		}
	}

}
