package com.ty.hospital_app.controller.branch;

import java.util.List;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.service.imp.BranchServiceImp;

public class TestGetHospitalBranchesController {
	public static void main(String[] args) {
		
		BranchServiceImp branchServiceImp=new BranchServiceImp();
		List<Branch> branchs=branchServiceImp.getHospitalBranches(1);
		int count=1;
		if(branchs!=null) {
			for(Branch branch:branchs) {
				System.out.println(count+" ===========here is detail of branch========");
				System.out.println("branch name is : " + branch.getName());
				System.out.println("branch email is : " + branch.getEmail());
				System.out.println("branch phone is : " + branch.getPhone());
				System.out.println("this branch belong to this hospital : " + branch.getHospital().getName());
				System.out.println("this branch belong to this hospital website is : " + branch.getHospital().getWebsite());
			System.out.println("=================================");
			count++;
			}
		}else {
			System.out.println("there is no branchs for ur provided hospital or hospital is not exit");
		}
	}

}
