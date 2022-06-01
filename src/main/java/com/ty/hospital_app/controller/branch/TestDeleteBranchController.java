package com.ty.hospital_app.controller.branch;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.service.imp.BranchServiceImp;

public class TestDeleteBranchController {
	public static void main(String[] args) {
		
		BranchServiceImp branchServiceImp=new BranchServiceImp();
		boolean result=branchServiceImp.deleteBranch(4);
		if(result) {
			System.out.println("branch is removed or deleted based on it's id");
		}else {
			System.out.println("branch is not removed or deleted because id not present to remove or delete branch");
		}
	}

}
