package com.ty.hospital_app.service.imp;

import java.util.List;

import com.ty.hospital_app.dao.imp.AddressDaoImp;
import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.service.Address_Service;

public class AddressServiceImp implements Address_Service{
   AddressDaoImp addressDao=new AddressDaoImp();
	public Address saveAddress(Address address, int branch_id) {
		
		return addressDao.saveAddress(address, branch_id);
	}

	public Branch getBranchByAddressId(int address_id) {
		
		return addressDao.getBranchByAddressId(address_id);
	}

	public List<Branch> getBranchByCity(String city) {
		
		return addressDao.getBranchByCity(city);
	}

	public Address updateAddress(Address address, int address_id) {
		
		return addressDao.updateAddress(address, address_id);
	}

	public boolean deleteAddress(int address_id) {
		
		return addressDao.deleteAddress(address_id);
	}

}
