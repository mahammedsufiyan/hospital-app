package com.ty.hospital_app.controller.address;

import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.service.imp.AddressServiceImp;

public class TestUpdateAddressController {
	public static void main(String[] args) {
		Address address=new Address();
		address.setCity("mysoor");
		address.setCountry("india");
		address.setState("karnataka");
		
		
		AddressServiceImp addressServiceImp =new AddressServiceImp();
	Address address2=addressServiceImp.updateAddress(address, 1);
	if(address2!=null) {
		System.out.println("address is updated base on address id");
	}else {
		System.out.println("address id is not present to update sorry");
	}
	}

}
//////////////////////////////////branch id empty while updating////////////////