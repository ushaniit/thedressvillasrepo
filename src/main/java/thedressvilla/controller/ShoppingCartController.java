package thedressvilla.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.webflow.engine.model.Model;

import thedressvilla.cartmodel.Item;
import thedressvilla.cartmodel.ShoppingCart;
import thedressvilla.service.ProductService;
import thedressvilla.usermodel.Address;

@Controller
@Component
public class ShoppingCartController {

	@Autowired
	private ProductService productService;
	ShoppingCart cart;
	
	@RequestMapping("/order/{pid}")
	public String ordernow(@PathVariable(value="pid") int pid, ModelMap mm, HttpSession session)
	{
		if(session.getAttribute("cart")==null)
		{
			List<Item> listcart=new ArrayList();
			cart=new ShoppingCart();
			listcart.add(new Item(this.productService.getProductById(pid),1));
			cart.setListitem(listcart);
			session.setAttribute("cart",cart);
		}
		else
		{
			cart=(ShoppingCart) session.getAttribute("cart");
			List<Item> listcart=cart.getListItem();
			int index= isExisting(pid,listcart);
			if (index == -1)
				listcart.add(new Item(this.productService.getProductById(pid), 1));
			else {
				int quantity = listcart.get(index).getQuantity() + 1;
				listcart.get(index).setQuantity(quantity);
			}
			cart.setListitem(listcart);
			session.setAttribute("cart", cart);
		}
		System.out.println("redirect");
		return "redirect:/orderShip";
		}
	
	
	@SuppressWarnings("unchecked")
	private int isExisting(int id, List<Item> pcart) {

		try
		{
			for (int i = 0; i < pcart.size(); i++)

				if (pcart.get(i).getP().getPid() == id)
					return i;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return -1;
	}
	
	public Address getAddress()
	{
		return new Address();
	}
	
	public ShoppingCart initFlow()
	{
		return cart;
	}
	
	@RequestMapping(value="/deletep/{pid}")
	public String delete(@PathVariable(value="pid") int pid, HttpSession session, ModelMap m)
	{
		cart=(ShoppingCart) session.getAttribute("cart");
		List<Item> listcart=(List<Item>) cart.getListItem();
		int index=isExisting(pid, listcart);
		listcart.remove(index);
		cart.setListitem(listcart);
		session.setAttribute("cart", cart);
		System.out.println("delete");
		
		return "redirect:http://localhost:8080/thedressvilla/orderShip";
	}
}
