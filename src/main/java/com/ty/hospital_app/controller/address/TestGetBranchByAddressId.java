package com.ty.hospital_app.controller.address;

import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.service.imp.AddressServiceImp;

public class TestGetBranchByAddressId {
	public static void main(String[] args) {

		AddressServiceImp addressServiceImp = new AddressServiceImp();
		Branch branch = addressServiceImp.getBranchByAddressId(1);
		if (branch != null) {
			System.out.println("====branch details=============");
			System.out.println("branch name is: "+branch.getName());
			System.out.println("branch email  is: "+branch.getEmail());
			System.out.println("branch phone number  is: "+branch.getPhone());

			System.out.println("=======branch address details=========");

			System.out.println("branch city is : "+branch.getAddress().getCity());
			System.out.println("branch country is : "+branch.getAddress().getCountry());
			System.out.println("branch state is : "+branch.getAddress().getState());

			System.out.println("==========branch hospital details=================");
			System.out.println("branch hospital name is : "+branch.getHospital().getName());
			System.out.println("branch hospital website is : "+branch.getHospital().getWebsite());
			
		} else {
			System.out.println("there is no branch present in that address id sorry");
		}
	}

}
