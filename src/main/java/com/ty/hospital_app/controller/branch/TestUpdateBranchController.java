package com.ty.hospital_app.controller.branch;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.service.imp.BranchServiceImp;

public class TestUpdateBranchController {
	public static void main(String[] args) {
		Branch branch = new Branch();
		branch.setEmail("apolahospitalindranagar@gmail.com");
		branch.setName("apola hospital indra  nagar");
		branch.setPhone(112289956);

		BranchServiceImp branchServiceImp = new BranchServiceImp();
		Branch branch2 = branchServiceImp.updateBranch(branch, 4);
		if (branch2 != null) {
			System.out.println("branch is updated based on its id");
		} else {
			System.out.println("branch is not updated because  id is not present or branch is not present");
		}

	}

}
