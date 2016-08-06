package thedressvilla.controller;


import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import thedressvilla.model.Product;
import thedressvilla.service.ProductService;




@Controller
public class AdminController {
	private ProductService productService;
	
	@Autowired(required=true)
	@Qualifier(value="productService")
	public void setProductService(ProductService ps){
	    this.productService = ps;
	}
	
	 @RequestMapping(value = "/admin")
	    public String listProducts(Model model) {
	        model.addAttribute("product", new Product());
	        model.addAttribute("listProducts", this.productService.getAllProducts());
	        return "admin";
	    }
	     
	    //For add and update person both
	    @RequestMapping(value= "/admin/add" , method=RequestMethod.POST)
	    public String addProducts(@Valid @ModelAttribute("product") Product p, BindingResult result, Model model, HttpServletRequest request){
	         boolean x;
	         if(result.hasErrors())
	         {
	        	 System.out.println("Errors called");
	        	 model.addAttribute("listProducts",this.productService.getAllProducts());
	        	 return "admin";
	         }
	        if(p.getPid() == 0){
	            //new product, add it
	      x=      this.productService.addProduct(p);
	      MultipartFile file=p.getImg();
	      String fileloc=request.getSession().getServletContext().getRealPath("/resources/images/");
	       System.out.println(fileloc);
	       String filename=fileloc+"\\"+p.getPid()+".jpg";
	       System.out.println(filename);
	       try
	       {
	    	   byte b[]=file.getBytes();
	    	   FileOutputStream fos=new FileOutputStream(filename);
	    	   fos.write(b);
	    	   fos.close();
	       }
	       catch(IOException ex){}
	       catch(Exception e){}
	        }
	        else {
	            //existing product, call update
	           x= this.productService.update(p);
	        }
	        return "redirect:/admin";
	        }
	 
	    @RequestMapping("/remove/{id}")
	    public String removeProduct(@PathVariable("id") int id){
	         
	        this.productService.removeProduct(id);
	        return "redirect:/admin";
	    }
	  
	    @RequestMapping("/edit/{id}")
	    public String editProduct(@PathVariable("id") int id, Model model){
	        model.addAttribute("product", this.productService.getProductById(id));
	        model.addAttribute("listProducts", this.productService.getAllProducts());
	        return "admin";
	    }
	   
}
	