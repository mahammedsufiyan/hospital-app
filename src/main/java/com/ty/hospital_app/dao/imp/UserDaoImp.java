package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.User_Dao;
import com.ty.hospital_app.dto.User;

public class UserDaoImp implements User_Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = null;

	public User saveUser(User user) {
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return entityManager.find(User.class, user.getId());
	}

	public User validateUser(String email, String password) {
		String sql = "select y from User y where y.email=?1 and y.password=?2";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, email);
		query.setParameter(2, password);
		List<User> users = query.getResultList();
		if (users.size() > 0) {
			return users.get(0);
		} else {
			return null;
		}

	}

	public List<User> getAllUsers() {
		String sql = "select u from User u";
		Query query = entityManager.createQuery(sql);
		List<User> list = query.getResultList();
		if (list.size() > 0) {
			return list;
		} else {
			return null;
		}
	}

	public User getUserById(int id) {
		User user = entityManager.find(User.class, id);
		if (user != null) {
			return user;
		}
		return null;
	}

	public User updateUser(User user, int id) {
		entityTransaction = entityManager.getTransaction();
		User user2 = entityManager.find(User.class, id);

		if (user2 != null) {
			user.setId(id);
			entityTransaction.begin();
			entityManager.merge(user);
			entityTransaction.commit();
			return user2;
		} else {
			return null;
		}
	}

	public boolean deleteUserById(int user_id) {
		entityTransaction=entityManager.getTransaction();
		User user=entityManager.find(User.class, user_id);
		if(user!=null) {
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			return true;
		}else {
		return false;
		}
		
	}

}
