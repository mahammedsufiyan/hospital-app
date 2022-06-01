package com.ty.hospital_app.controller.person;

import com.ty.hospital_app.dto.Person;
import com.ty.hospital_app.service.imp.PersonServiceImp;

public class TestUpdatePersonController {
	public static void main(String[] args) {
		PersonServiceImp personServiceImp=new PersonServiceImp();
		Person person=new Person();
		person.setName("suman");
		person.setAge(26);
		person.setDob("1/25/2005");
		person.setEmail("suman@gmail.com");
		person.setGender("male");
		person.setPhone(110903999);
		
		Person person2=personServiceImp.updatePerson(person,4);
		if(person2!=null) {
			System.out.println("person is updated successfully");
		}
		
		else {
			System.out.println("person id is not exit to update");
		}
		
		
	}

}
