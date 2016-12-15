package com.niit.furnisets.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.furnisets.model.Register;


@Repository("RegisterDAO")
@EnableTransactionManagement
public class RegisterDAOImpl implements RegisterDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	@Transactional
	public void addUser(Register reg) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(reg);
	}

	@Transactional
	public void updateUser(Register reg,int id) {
		System.out.println("Product ID" + reg.getId());
		Session session = sessionFactory.getCurrentSession();
		Register reg1 = (Register)session.get(Register.class, id);
		reg1.setFirstName(reg.getFirstName());
		reg1.setLastName(reg.getLastName());
		reg1.setUserName(reg.getUserName());
		reg1.setNumber(reg.getNumber());
		reg1.setEmail(reg.getEmail());
		reg1.setPassword(reg.getPassword());
		session.update(reg1);
		
		
	}
	
	@Transactional
	public void deleteUser(int id) {
		Session session = sessionFactory.getCurrentSession();
		Register reg = (Register)session.get(Register.class, id);
		session.delete(reg);
		
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Register> getAllUsers() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Register").list();
	}

	@Transactional
	public Register getUserById(int id) {
		Session session = sessionFactory.getCurrentSession();
		return (Register) session.get(Register.class, id);
	}
	
	
}