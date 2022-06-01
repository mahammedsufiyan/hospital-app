package com.ty.hospital_app.service.imp;

import java.util.List;

import com.ty.hospital_app.dao.imp.HospitalDaoImp;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.Hospital_Service;

public class HospitalServiceImp implements Hospital_Service {
	HospitalDaoImp hospitalDao = new HospitalDaoImp();

	public Hospital saveHospital(Hospital hospital) {

		return hospitalDao.saveHospital(hospital);
	}

	public Hospital getHospitalById(int id) {

		return hospitalDao.getHospitalById(id);
	}

	public List<Branch> getHospitalBranchesById(int hospital_id) {

		return hospitalDao.getHospitalBranchesById(hospital_id);
	}

	public List<Hospital> getAllHospital() {

		return hospitalDao.getAllHospital();
	}

	public Hospital updateHospital(Hospital hospital, int hospital_id) {

		return hospitalDao.updateHospital(hospital, hospital_id);
	}

	public boolean deleteHospital(int hospital_id) {
		// TODO Auto-generated method stub
		return hospitalDao.deleteHospital(hospital_id);
	}

}
