package com.ty.hospital_app.controller.address;

import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.service.imp.AddressServiceImp;

public class TestDeleteAddressController {
	public static void main(String[] args) {
		AddressServiceImp addressServiceImp=new AddressServiceImp();
		boolean result=addressServiceImp.deleteAddress(1);
		if(result) {
			System.out.println("address is deleted based on address id");
		}else {
			System.out.println("address is not deleted because address id is wrong");
		}
	}

}
