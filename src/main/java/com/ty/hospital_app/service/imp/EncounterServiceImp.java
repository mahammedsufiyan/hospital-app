package com.ty.hospital_app.service.imp;

import java.util.List;

import com.ty.hospital_app.dao.imp.EncounterDaoImp;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.service.Encounter_Service;

public class EncounterServiceImp implements Encounter_Service {
	EncounterDaoImp encounterDao = new EncounterDaoImp();

	public Encounter saveEncounter(int branch_id, int person_id, Encounter encounter) {

		return encounterDao.saveEncounter(branch_id, person_id, encounter);
	}

	public Encounter getEncounterById(int id) {

		return encounterDao.getEncounterById(id);
	}

	public List<Encounter> getEncountersByBranchId(int branch_id) {

		return encounterDao.getEncountersByBranchId(branch_id);
	}

	public Encounter updateEncounter(Encounter encounter, int encounter_id) {

		return encounterDao.updateEncounter(encounter, encounter_id);
	}

	public boolean deleteEncounter(int encounter_id) {

		return encounterDao.deleteEncounter(encounter_id);
	}

}
