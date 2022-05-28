package com.ty.hospital_app.services;

import java.util.List;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Hospital;

public interface HospitalServices {
	Hospital saveHospital(Hospital hospital);
	Hospital getHospitalById(int hospital_id);                               
	List<Branch>  getHospitalBranchesById(int branch_id) ;               
	List<Hospital> getAllHospital();                                           
	Hospital updateHospital(Hospital hospital ,int id); 
	boolean deleteHospital(int id);

}