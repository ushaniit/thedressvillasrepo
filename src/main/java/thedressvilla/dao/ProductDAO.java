package thedressvilla.dao;

import java.util.List;

import thedressvilla.model.Product;

public interface ProductDAO {

	public boolean addProduct(Product product);
	public boolean deleteProduct(Product product);
	public boolean update(Product product);
	public List<Product> getAllProducts();
	public Product getProductById(int id);
	public void removeProduct(int id);
	
	
}
