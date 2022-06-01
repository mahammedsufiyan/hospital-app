package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital_app.dao.Branch_Dao;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.Hospital;

public class BranchDaoImp implements Branch_Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = null;

	public Branch saveBranch(Branch branch, int hospital_id) {
		entityTransaction = entityManager.getTransaction();
		Hospital hospital = entityManager.find(Hospital.class, hospital_id);
		if (hospital != null) {

			entityTransaction.begin();
			branch.setHospital(hospital);
			// branch.setAddress(null);
			entityManager.persist(branch);
			entityTransaction.commit();
			return entityManager.find(Branch.class, branch.getId());
		} else {
			return null;
		}
	}

	public Branch getBranchById(int branch_id) {
		Branch branch = entityManager.find(Branch.class, branch_id);
		if (branch != null) {
			return branch;
		} else {
			return null;
		}
	}

	public Hospital getBranchHospitalById(int branch_id) {
		Branch branch = entityManager.find(Branch.class, branch_id);
		if (branch != null) {
			Hospital hospital = branch.getHospital();
			return hospital;
		} else {
			return null;
		}

	}//////////////////////////////////////////////////////////////////

	public List<Branch> getHospitalBranches(int hospital_id) {
		Hospital hospital = entityManager.find(Hospital.class, hospital_id);
		if (hospital != null) {

			List<Branch> branchs = hospital.getBranch();
			return branchs;
		} else {
			return null;
		}
	}

	public List<Encounter> getBranchEncounters(int branch_id) {
		Branch branch = entityManager.find(Branch.class, branch_id);
		if (branch != null) {
			List<Encounter> encounters = branch.getEncounter();
			return encounters;
		} else {
			return null;
		}
	}

	public Branch updateBranch(Branch branch, int branch_id) {
		entityTransaction = entityManager.getTransaction();

		Branch branch2 = entityManager.find(Branch.class, branch_id);

		if (branch2 != null) {
			branch.setId(branch_id);
			entityTransaction.begin();

			entityManager.merge(branch);
			entityTransaction.commit();
			return branch;// entityManager.find(Branch.class, branch.getId());
		} else {
			return null;
		}
	}

	public boolean deleteBranch(int branch_id) {
		entityTransaction = entityManager.getTransaction();

		Branch branch = entityManager.find(Branch.class, branch_id);
		if (branch != null) {
			entityTransaction.begin();
			entityManager.remove(branch);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

}
