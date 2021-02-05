package com.jdmj.InventoryManagement.dao;

import java.util.List;

import com.jdmj.InventoryManagement.entity.User;

public interface UserDao {

	public List<User> getUsers();/// ???????????

	public void saveUser(User theUser);

	public User getUser(int theId);
}
