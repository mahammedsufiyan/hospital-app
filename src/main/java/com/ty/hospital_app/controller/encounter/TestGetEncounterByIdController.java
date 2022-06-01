package com.ty.hospital_app.controller.encounter;

import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.service.imp.EncounterServiceImp;

public class TestGetEncounterByIdController {
	public static void main(String[] args) {

		EncounterServiceImp encounterServiceImp = new EncounterServiceImp();
		Encounter encounter = encounterServiceImp.getEncounterById(2);
		if (encounter != null) {
			System.out.println("==========here is the details of encounter========");
			System.out.println("reason for encounter "+encounter.getReason());
			System.out.println("admite date "+encounter.getAdmit_date_time());
			System.out.println("discharge date "+encounter.getDischarge_date_time());
			System.out.println("===============here is the person details=============");
			System.out.println("person age is "+encounter.getPerson().getAge());
			System.out.println("person date of birth is "+encounter.getPerson().getDob());
			System.out.println("person email is "+encounter.getPerson().getEmail());
			System.out.println("person gender is "+encounter.getPerson().getGender());
			System.out.println("person name is "+encounter.getPerson().getName());
			System.out.println("person phone is "+encounter.getPerson().getPhone());

			System.out.println("=============here is the person admited branch details========");
			System.out.println("branch email is "+encounter.getBranch().getEmail());
			System.out.println("branch name is "+encounter.getBranch().getName());
			System.out.println("branch phone is "+encounter.getBranch().getPhone());

			System.out.println("==============here is the person admited branch addressdetails=========");
			System.out.println("branch present in this city "+encounter.getBranch().getAddress().getCity());
			System.out.println("branch present in this country "+encounter.getBranch().getAddress().getCountry());
			System.out.println("branch present in this state "+encounter.getBranch().getAddress().getState());

		}
		else {
			System.out.println("there is no encounter to show the details");
		}
	}

}
