package com.niit.furnisets.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.furnisets.model.ContactUs;


@Repository
public class ContactUsDAOImpl implements ContactUsDAO {

	
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public void createUser(ContactUs contactus) {
		Session session = sessionFactory.openSession();
		try{
			session.saveOrUpdate(contactus);
			System.out.println("User Record Created");
			
		}
		catch(HibernateException ex){
			System.out.println("Could Not Create User " + ex.getMessage());
			
		}
		finally
		{
			session.close();
		}

	}

}
