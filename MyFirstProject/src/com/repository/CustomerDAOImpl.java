package com.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory factory; 
	
	@Override
	public Customer getCustomer(int id) {
		
		Session session = factory.getCurrentSession(); 
		
		Customer customer = session.get(Customer.class, id); 
		
		return customer;
	}

	@Override
	public List<Customer> getCustomers() {
				
		Session session = factory.getCurrentSession(); 
				
		Query<Customer> query = session.createQuery("from Customer order by lastName", Customer.class); 
				
		List<Customer> customers = query.getResultList(); 
				
		return customers;
	}

	@Override
	public void saveCustomer(Customer customer) {
		
		Session session = factory.getCurrentSession(); 
		
		session.saveOrUpdate(customer); 		
	}

	@Override
	public void deleteCustomer(int id) {
		
		Session session = factory.getCurrentSession(); 
		
		Customer customer = session.get(Customer.class, id); 
		
		session.delete(customer);	
	}
}
