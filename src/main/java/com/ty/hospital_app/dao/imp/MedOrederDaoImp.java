package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.LockModeType;
import javax.persistence.Persistence;

import com.ty.hospital_app.dao.MedOrder_Dao;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.dto.MedOrder;

public class MedOrederDaoImp implements MedOrder_Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = null;

	public MedOrder saveMedOrder(MedOrder medOrder, int encounter_id) {
		entityTransaction = entityManager.getTransaction();
		Encounter encounter = entityManager.find(Encounter.class, encounter_id);
		if (encounter != null) {
			entityTransaction.begin();
			medOrder.setEncounter(encounter);
			entityManager.persist(medOrder);
			entityTransaction.commit();
			return entityManager.find(MedOrder.class, medOrder.getId());
		} else {
			return null;
		}
	}

	public MedOrder getMedOrderById(int medOrder_id) {
		MedOrder medOrder = entityManager.find(MedOrder.class, medOrder_id);
		if (medOrder != null) {
			return medOrder;
		} else {
			return null;
		}
	}

	public List<MedOrder> getMedOrderByEncounterId(int encounter_id) {
		Encounter encounter = entityManager.find(Encounter.class, encounter_id);
		if (encounter != null) {
			List<MedOrder> medOrders = encounter.getMedOrders();
			return medOrders;
		} else {
			return null;
		}
	}

	public MedOrder updateMedOrder(MedOrder medOrder, int medOrder_id) {
		entityTransaction = entityManager.getTransaction();
		MedOrder medOrder2 = entityManager.find(MedOrder.class, medOrder_id);
		if (medOrder2 != null) {
			entityTransaction.begin();
			entityManager.merge(medOrder);
			entityTransaction.commit();
			return entityManager.find(MedOrder.class, medOrder.getId());
		} else {
			return null;
		}
	}

	public boolean deleteMedOrder(int medOrder_id) {
		entityTransaction = entityManager.getTransaction();
		MedOrder medOrder = entityManager.find(MedOrder.class, medOrder_id);
		if (medOrder != null) {
			entityTransaction.begin();
			entityManager.remove(medOrder);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

	public List<Item> getItemsByMedOrderId(int medOrder_id) {
		MedOrder medOrder = entityManager.find(MedOrder.class, medOrder_id);
		if (medOrder != null) {
			List<Item> items = medOrder.getItems();
			return items;
		} else {
			return null;
		}
	}

}
