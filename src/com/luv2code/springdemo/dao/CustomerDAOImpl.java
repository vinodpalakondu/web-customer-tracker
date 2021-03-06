package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	// SessionFactory  session
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		
	 Session currentSession=sessionFactory.getCurrentSession();
		
		
	  Query<Customer> thequery = currentSession.createQuery("from Customer",Customer.class);
	  
	  List<Customer> customers=thequery.getResultList();
	   
	    return customers;
		
		
	}

}
