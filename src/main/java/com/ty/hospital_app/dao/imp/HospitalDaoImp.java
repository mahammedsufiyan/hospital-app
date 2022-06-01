package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.Hospital_Dao;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Hospital;

public class HospitalDaoImp implements Hospital_Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = null;

	public Hospital saveHospital(Hospital hospital) {
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		entityManager.persist(hospital);
		entityTransaction.commit();

		return entityManager.find(Hospital.class, hospital.getId());
	}

	public Hospital getHospitalById(int hospital_id) {
		Hospital hospital = entityManager.find(Hospital.class, hospital_id);
		if (hospital != null) {
			return hospital;
		} else {
			return null;
		}
	}

	public List<Branch> getHospitalBranchesById(int hospital_id) {
		Hospital hospital=entityManager.find(Hospital.class, hospital_id);
		if(hospital!=null) {
			List<Branch> branchs=hospital.getBranch();
			return branchs;
		}else {
		return null;
		}
	}

	public List<Hospital> getAllHospital() {
		String sql="select t from Hospital t";
		Query query=entityManager.createQuery(sql);
		List<Hospital> hospitals=query.getResultList();
		if(hospitals!=null) {
			return hospitals;
		}else {
		return null;
		}
	}

	public Hospital updateHospital(Hospital hospital, int hospital_id) {
		entityTransaction=entityManager.getTransaction();
		Hospital  hospital2=entityManager.find(Hospital.class, hospital_id);
		if(hospital2!=null) {
			hospital.setId(hospital_id);
			entityTransaction.begin();
			entityManager.merge(hospital);
			entityTransaction.commit();
			return entityManager.find(Hospital.class, hospital.getId());
		}else {
		return null;
		}
	}

	public boolean deleteHospital(int hospital_id) {
		entityTransaction=entityManager.getTransaction();
		Hospital hospital=entityManager.find(Hospital.class, hospital_id);
		if(hospital!=null) {
			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();
			return true;
		}else {
		return false;
		}
	}

}
