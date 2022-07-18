package com.cdac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.entity.Customer;

@Component
public class CustomerDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void add(Customer customer) {
		entityManager.persist(customer);
	}
	
	public boolean isCustomerPresent(String email) {
		Query query = entityManager.createQuery("select count(c) from Customer c where c.email = :em");
		query.setParameter("em", email);
		Long count = (Long) query.getSingleResult();
		if(count == 1)
			return true;
		return false;
	}

	public boolean isCustomerPresent(String email, String password) {
		/*Query query = entityManager.createQuery("select count(c) from Customer c where c.email = :em and c.password = :pw");
		query.setParameter("em", email);
		query.setParameter("pw", password);
		Long count = (Long) query.getSingleResult();
		if(count == 1)
			return true;
		return false;*/
		return (Long)
				entityManager
				.createQuery("select count(c) from Customer c where c.email = :em and c.password = :pw")
				.setParameter("em", email)
				.setParameter("pw", password)
				.getSingleResult() == 1 ? true : false;
	}

	public Customer fetch(String email) {
		/*Query query = entityManager.createQuery("select c from Customer c where c.email = :em");
		query.setParameter("em", email);
		Customer customer = (Customer) query.getSingleResult();
		return customer;*/
		return (Customer) entityManager
				.createQuery("select c from Customer c where c.email = :em")
				.setParameter("em", email)
				.getSingleResult();
	}
	
	public List<Customer> fetchAll() {
		return entityManager
				.createQuery("select c from Customer c", Customer.class)
				.getResultList();
	}
}
