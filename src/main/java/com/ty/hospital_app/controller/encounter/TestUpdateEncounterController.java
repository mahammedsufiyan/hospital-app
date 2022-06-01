package com.ty.hospital_app.controller.encounter;

import java.time.LocalDateTime;

import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.service.imp.EncounterServiceImp;

public class TestUpdateEncounterController {
	public static void main(String[] args) {
		
		Encounter encounter=new Encounter();
		encounter.setAdmit_date_time(LocalDateTime.of(1980, 12, 12, 9, 15));
		encounter.setDischarge_date_time(LocalDateTime.of(1980, 12, 10, 10, 15));
		encounter.setReason("vision problem");
		
		EncounterServiceImp encounterServiceImp=new EncounterServiceImp();
		Encounter encounter2=encounterServiceImp.updateEncounter(encounter, 3);
		if(encounter2!=null) {
			System.out.println("encouter is updated based on encounter id");
		}else {
			System.out.println("encouter is not updated because on encounter id not present");
		}
	}

}
/////////////////////////////////////////////////////////////////