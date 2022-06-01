package com.ty.hospital_app.controller.person;

import com.ty.hospital_app.dto.Person;
import com.ty.hospital_app.service.imp.PersonServiceImp;

public class TestDeletePersonController {
	public static void main(String[] args) {
		
		PersonServiceImp personServiceImp=new PersonServiceImp();
		boolean res=personServiceImp.deletePerson(4);
		if(res) {
			System.out.println("yes person is deleted based on id");
		}else {
			System.out.println("no person is not deleted because there is no id present");
		}
	}

}
