package com.ty.hospital_app.controller.person;

import java.time.LocalDateTime;

import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.Person;
import com.ty.hospital_app.service.imp.PersonServiceImp;

public class TesSavetPersonController {
	public static void main(String[] args) {
		PersonServiceImp personService = new PersonServiceImp();

		Person person1 = new Person();

		person1.setName("manga");
		person1.setAge(25);
		person1.setEmail("mang@gmail.com");
		person1.setGender("male");
		person1.setPhone(564956);
		person1.setDob("12/12/1990");

		Person person=personService.savePerson(person1);
		if(person!=null) {
			System.out.println("person is saved");
		}else {
			System.out.println("person is not saved some thing went wrong");
		}

	}

}
