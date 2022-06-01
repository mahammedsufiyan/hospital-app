package com.ty.hospital_app.controller.address;

import java.util.List;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.service.imp.AddressServiceImp;
import com.ty.hospital_app.service.imp.BranchServiceImp;

public class TestGetBranchByCityController {
	public static void main(String[] args) {
		
		AddressServiceImp branchServiceImp=new AddressServiceImp();
		List<Branch> branch=branchServiceImp.getBranchByCity("muysoor");
		if (branch != null) {
			System.out.println(branch.get(0));
			} else {
			System.out.println("there is no branch present in that address id sorry");
		}
	}

}
/////////////////////////////////////////////////////////////////////////////////////////////////////