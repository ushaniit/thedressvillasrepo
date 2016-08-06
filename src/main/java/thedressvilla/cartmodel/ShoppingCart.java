package thedressvilla.cartmodel;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import thedressvilla.usermodel.User;

@Entity
public class ShoppingCart implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cartid;
	
	@OneToOne
	private User user;
	
	@OneToMany(mappedBy="cart",cascade=CascadeType.ALL)
	private List<Item> listItem;

	public int getCartid() {
		return cartid;
	}

	public void setCartid(int cartid) {
		this.cartid = cartid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Item> getListItem() {
		return listItem;
	}

	public void setListitem(List<Item> listItem) {
		this.listItem = listItem;
	}

	

}
