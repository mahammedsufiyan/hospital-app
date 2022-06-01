package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.Address_Dao;
import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dto.Branch;

public class AddressDaoImp implements Address_Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = null;

	
	public Address saveAddress(Address address, int branch_id) {
		entityTransaction = entityManager.getTransaction();
		Branch branch = entityManager.find(Branch.class, branch_id);
		if (branch != null) {
			entityTransaction.begin();
			address.setBranch(branch);
			entityManager.persist(address);
			entityTransaction.commit();
			return entityManager.find(Address.class, address.getId());
		} else {
			return null;
		}
	}

	public Branch getBranchByAddressId(int address_id) {
		Address address = entityManager.find(Address.class, address_id);
		if (address != null) {
			Branch branch = address.getBranch();
			return branch;
		} else {
			return null;
		}

	}

	public List<Branch> getBranchByCity(String city) {
		String sql = "select r fron City r where r.city=?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, city);
		List<Branch> branchs = query.getResultList();
		if (branchs != null) {
			return branchs;
		} else {
			return null;
		}
	}

	public Address updateAddress(Address address, int address_id) {
		entityTransaction = entityManager.getTransaction();
		Address address2 = entityManager.find(Address.class, address_id);
		if (address2 != null) {		
			entityTransaction.begin();
			address.setId(address_id);

			entityManager.merge(address);
			entityTransaction.commit();
			return address;
		} else {
			return null;
		}
	}

	public boolean deleteAddress(int address_id) {
		entityTransaction = entityManager.getTransaction();
		Address address = entityManager.find(Address.class, address_id);
		if (address != null) {
			entityTransaction.begin();
			entityManager.remove(address);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

}
