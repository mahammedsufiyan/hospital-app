package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.Hospital;

public interface Branch_Service {
	Branch saveBranch(Branch branch, int hospital_id);

	Branch getBranchById(int branch_id);

	Hospital getBranchHospitalById(int branch_id);

	List<Branch> getHospitalBranches(int hospital_id);

	List<Encounter> getBranchEncounters(int branch_id);

	Branch updateBranch(Branch branch, int branch_id);

	boolean deleteBranch(int branch_id);

}
