package thedressvilla.userdao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

import thedressvilla.usermodel.Address;
import thedressvilla.usermodel.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
@Autowired
	SessionFactory sessionFactory;
	
	public Session getSession()
	{
		return sessionFactory.openSession();
	}
	public boolean addUser(User user)
	{
		Session s=getSession();
		Transaction tx=s.beginTransaction();
		s.save(user);
		tx.commit();
		s.close();
		return true;
	}
	
	public boolean deleteUser(User user)
	{
		Session s=getSession();
		Transaction tx=s.beginTransaction();
		s.delete(user);
		tx.commit();
		s.close();
		return true;
	}
	
	public boolean update(User user)
	{
		Session s=getSession();
		Transaction tx=s.beginTransaction();
		s.update(user);
		tx.commit();
		s.close();
		return true;
	}
	
	@SuppressWarnings("unchecked")
	public List<User> getAllUsers()
	{
		Session s=getSession();
		Transaction tx=s.beginTransaction();
		List<User> l=(List<User>)s.createQuery("From USERS").list();
		tx.commit();
		s.close();
		return l;
	}
	
	public User getUserById(int id)
	{
		Session s=getSession();
		Transaction tx=s.beginTransaction();
		User user=s.load(User.class, new Integer(id));
		tx.commit();
		s.close();
		return user;
	}
	
	public void removeUser(int id)
	{
		Session s=getSession();
		Transaction tx=s.beginTransaction();
		User user=s.load(User.class, new Integer(id));
		if(null != user)
		{
			s.delete(user);
		}
		tx.commit();
		s.close();
	}

	public String insertAddress(Address address)
	{
		Session s=getSession();
		Transaction tx=s.beginTransaction();
		s.save(address);
		tx.commit();
		s.close();
		return "success";
	}
}
