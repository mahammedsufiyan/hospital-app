package com.ty.hospital_app.controller.person;

import java.util.List;

import com.ty.hospital_app.dto.Person;
import com.ty.hospital_app.service.imp.PersonServiceImp;

public class TestGetAllPersonController {
	public static void main(String[] args) {
		PersonServiceImp personServiceImp =new PersonServiceImp();
		List<Person> persons=personServiceImp.getAllPerson();
		int count=1;
		if(persons!=null) {
			for(Person person:persons ) {
				System.out.println(count+" ->===here is the details of person===");
				System.out.println("person name is: "+person.getName());
				System.out.println("person age is: "+person.getAge());
				System.out.println("person date of birth is: "+person.getDob());
				System.out.println("person email is: "+person.getEmail());
				System.out.println("person phone is: "+ person.getPhone());
				System.out.println("person gender is: "+person.getGender());
				System.out.println("====================");
				count++;
				
			}
			
		}
		else {
			System.out.println("there is no user to display on that id");
		}
	}

}
