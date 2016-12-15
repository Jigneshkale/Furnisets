package com.niit.furnisets.dao;

import java.util.List;

import com.niit.furnisets.model.Register;

public interface RegisterDAO {
	
	public void addUser(Register reg);
	
	public void updateUser(Register reg, int id);
	
	public void deleteUser(int id);
	
	public List<Register> getAllUsers();
	
	public Register getUserById(int id);

}
