package thedressvilla.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import thedressvilla.usermodel.Address;
import thedressvilla.usermodel.User;
import thedressvilla.userservice.UserService;

@Component
@Controller
public class UserController {
	
	private UserService userService;
	Address uaddress;
	
	@Autowired
	@Qualifier(value="userService")
	public void setUserService(UserService us)
	{
		this.userService=us;
	}
	
	@RequestMapping(value="/register")
	String addUser(@Valid @ModelAttribute("user") User u,BindingResult result)
	{
		if(result.hasErrors())
		{
			return "Register";
		}
		else
		{
			userService.addUser(u);
			return "redirect:/index";
		}
	}
	
	public String insertAddress(Address uaddress,MessageContext messageContext)
	{
		this.uaddress=uaddress;
		return this.userService.insertAddress(uaddress);
	}
	
	public Address getAdd()
	{
		return uaddress;
	}

	
}
