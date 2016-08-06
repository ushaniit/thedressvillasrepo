package thedressvilla.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import thedressvilla.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public Session getSession()
	{
		return sessionFactory.openSession();		
	}
	
	public boolean addProduct(Product product) {
		Session s=getSession();
		Transaction	tx=s.beginTransaction();
		s.save(product);
		tx.commit();
		s.close();
		return true;
	}

	public boolean deleteProduct(Product product) {
		Session s=getSession();
		Transaction	tx=s.beginTransaction();
		s.delete(product);
		tx.commit();
		s.close();
		return true;
	}

	public boolean update(Product product) {
		Session s=getSession();
		Transaction	tx=s.beginTransaction();
		s.update(product);
		tx.commit();
		s.close();
		return true;
	}
	
	public Product getProductById(int id)
	{
		Session s=getSession();
		Transaction	tx=s.beginTransaction();
		Product p=s.load(Product.class, new Integer(id));
		tx.commit();
		s.close();
		return p;
	}
	public void removeProduct(int id)
	{
		Session s=getSession();
		Transaction	tx=s.beginTransaction();
		Product p=s.load(Product.class, new Integer(id));
		 if(null != p){
	            s.delete(p);
	        }
		 tx.commit();
			s.close(); 
		
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		Session s=getSession();
		Transaction tx=s.beginTransaction();
		List<Product> l=(List<Product>)s.createQuery("From Product").list();
		tx.commit();
		s.close();
		return l;
	}

}
