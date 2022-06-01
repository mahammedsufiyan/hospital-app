package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital_app.dao.Item_Dao;
import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.dto.MedOrder;

public class ItemDaoImp implements Item_Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = null;

	public Item saveItem(Item item, int medOrder_id) {
		entityTransaction = entityManager.getTransaction();
		MedOrder medOrder = entityManager.find(MedOrder.class, medOrder_id);
		if (medOrder != null) {
			entityTransaction.begin();
			item.setMedOrder(medOrder);
			entityManager.persist(item);
			entityTransaction.commit();
			return entityManager.find(Item.class, item.getId());
		} else {
			return null;
		}
	}

	public Item getItemById(int item_id) {
		Item item = entityManager.find(Item.class, item_id);
		if (item != null) {
			return item;
		} else {
			return null;
		}
	}

	public List<Item> getItemByMedOrderId(int medOrder_id) {
		MedOrder medOrder = entityManager.find(MedOrder.class, medOrder_id);
		if (medOrder != null) {
			List<Item> items = medOrder.getItems();
			return items;
		} else {
			return null;
		}
	}

	public Item updateItem(Item item, int item_id) {
		entityTransaction = entityManager.getTransaction();
		Item item2 = entityManager.find(Item.class, item_id);
		if (item2 != null) {
			entityTransaction.begin();
			entityManager.merge(item);
			entityTransaction.commit();
			return entityManager.find(Item.class, item.getId());
		} else {
			return null;
		}
	}

	public boolean deleteItem(int item_id) {
		entityTransaction = entityManager.getTransaction();
		Item item = entityManager.find(Item.class, item_id);
		if (item != null) {
			entityTransaction.begin();
			entityManager.remove(item);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

}
