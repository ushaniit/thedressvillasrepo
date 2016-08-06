package thedressvilla.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import thedressvilla.model.Product;
import thedressvilla.service.ProductService;
import thedressvilla.usermodel.User;

@Component
@Controller
public class HomeController {

	Product product;

	private ProductService productService;
	
	@Autowired(required=true)
	@Qualifier(value="productService")
	public void setProductService(ProductService ps){
	    this.productService = ps;
	}
	
	
	@RequestMapping("/")
	public ModelAndView getFirstPage(HttpServletResponse res)
	{
		return new ModelAndView("index");
	}
	
	@RequestMapping("/index")
	public ModelAndView index(HttpServletResponse res)
	{
		return new ModelAndView("index");
	}
	
	@RequestMapping("home")
	public ModelAndView getFirstPagep()
	{
		return new ModelAndView("index");
	}
	
	@RequestMapping("/Login") 
    public ModelAndView LoginP()
		{
			return new ModelAndView("Login");
		}
	
	@RequestMapping("/contactus") 
    public ModelAndView contactP()
		{
			return new ModelAndView("contactus");
		}
	
	@RequestMapping("/aboutus") 
    public ModelAndView aboutP()
		{
			return new ModelAndView("aboutus");
		}
	
	@RequestMapping("/rangmanch") 
    public ModelAndView rangmanchP()
		{
			return new ModelAndView("rangmanch");
		}
	
	@RequestMapping("/memberShip") 
    public String OrderP()
		{
			return "redirect:/Order";
		}
	
	@RequestMapping("/trisha") 
    public ModelAndView trishaP()
		{
			return new ModelAndView("trisha");
		}
	
	@RequestMapping("/ajil") 
    public ModelAndView ajilP()
		{
			return new ModelAndView("ajil");
		}
	
	@RequestMapping("/Register") 
    public ModelAndView RegisterP(Model model)
		{
		User u=new User();
		model.addAttribute("user",u);
			return new ModelAndView("Register");
		}
	
	@RequestMapping("/product") 
    public ModelAndView ProductsP()
		{
	
		List<Product> res=	productService.getAllProducts();
		Gson gson=new Gson();
		String json= gson.toJson(res);
		System.out.println(json);
		ModelAndView obj=new ModelAndView();
		obj.addObject("list", json);
		return obj;
		}
	@RequestMapping("/productdetail")
	public ModelAndView ProductDetailP(@ModelAttribute("product") Product product,BindingResult res)
	{
		ModelAndView obj1=new ModelAndView("productdetail");
		
		System.out.println(product.getPrice());
		
		this.product=product;
		return obj1;
		
		//ModelAndView obj1=new ModelAndView();
		//obj1.addObject("items",product);
		
			//return obj1;
	}
	
	public Product initFlow()
	{
		System.out.println(product.getName());
		return product;
	}
	
	@RequestMapping("/order")
	public String Order()
	{
		return "redirect:/orderShip";
	}
}
