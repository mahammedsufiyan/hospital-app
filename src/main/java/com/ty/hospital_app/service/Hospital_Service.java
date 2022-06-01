package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Hospital;

public interface Hospital_Service {
	Hospital saveHospital(Hospital hospital);

	Hospital getHospitalById(int id);

	List<Branch> getHospitalBranchesById(int hospital_id);

	List<Hospital> getAllHospital();

	Hospital updateHospital(Hospital hospital, int hospital_id);

	boolean deleteHospital(int hospital_id);

}
