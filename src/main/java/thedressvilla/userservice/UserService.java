package thedressvilla.userservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import thedressvilla.userdao.UserDAOImpl;
import thedressvilla.usermodel.Address;
import thedressvilla.usermodel.User;

@Service
@Transactional
public class UserService {

	@Autowired
	UserDAOImpl userDAOImpl;
	
	public boolean addUser(User user)
	{
		return userDAOImpl.addUser(user);
	}
	
	public boolean deleteUser(User user)
	{
		return userDAOImpl.deleteUser(user);
	}
	
	public boolean update(User user)
	{
		return userDAOImpl.update(user);
	}
	
	public List<User> getAllUsers()
	{
		return userDAOImpl.getAllUsers();
	}
	
	public User getUserById(int id)
	{
		return userDAOImpl.getUserById(id);
	}
	
	public void removeUser(int id)
	{
		this.userDAOImpl.removeUser(id);
	}
	
	public String insertAddress(Address address)
	{
		 userDAOImpl.insertAddress(address);
		 return "success";
	}
}
