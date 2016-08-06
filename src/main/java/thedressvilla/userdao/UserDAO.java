package thedressvilla.userdao;

import java.util.List;

import thedressvilla.usermodel.Address;
import thedressvilla.usermodel.User;

public interface UserDAO {
	public boolean addUser(User user);
	public boolean deleteUser(User user);
	public boolean update(User user);
	public List<User> getAllUsers();
	public User getUserById(int id);
	public void removeUser(int id);
	String insertAddress(Address address);
	

}
