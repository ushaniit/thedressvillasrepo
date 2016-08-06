package thedressvilla.cartmodel;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import thedressvilla.model.Product;

@Entity
public class Item implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int itemid;
	
	@OneToOne
	@JoinColumn(name="pid")
	private Product p;
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name="cartid",insertable=false)
	ShoppingCart cart;
	
	public Item(){
		
	}
	
	public Item(Product p,int quantity)
	{
		this.p=p;
		this.quantity=quantity;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public ShoppingCart getCart() {
		return cart;
	}

	public void setCart(ShoppingCart cart) {
		this.cart = cart;
	}
	
	
	
}
