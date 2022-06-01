package com.ty.hospital_app.controller.address;

import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.service.imp.AddressServiceImp;

public class TestSaveAddressController {
	public static void main(String[] args) {

		Address address = new Address();
		address.setCity("bangalore");
		address.setState("karnataka");
		address.setCountry("india");
		

		AddressServiceImp addressServiceImp = new AddressServiceImp();
		Address address2 = addressServiceImp.saveAddress(address, 2);
		if (address2 != null) {
			System.out.println("yes address is saved  for this branch");
		} else {
			System.out.println("address is not saved because branch id is or branch is not there to add address");
		}

	}

}
