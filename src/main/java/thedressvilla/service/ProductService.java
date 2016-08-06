package thedressvilla.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import thedressvilla.dao.ProductDAOImpl;
import thedressvilla.model.Product;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	ProductDAOImpl productDAOImpl;
public boolean addProduct(Product product) {
		
		return productDAOImpl.addProduct(product);
	}

	public boolean deleteProduct(Product product) {

		return productDAOImpl.deleteProduct(product);
	}

	public boolean update(Product product) {
		
		return productDAOImpl.update(product);
	}

	public List<Product> getAllProducts() {
		
		return productDAOImpl.getAllProducts();
	}
	
	public Product getProductById(int id) {
        return productDAOImpl.getProductById(id);
    }
	public void removeProduct(int id)
	{
		this.productDAOImpl.removeProduct(id);
	}
	
	

}
