package com.niit.furnisets.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.furnisets.model.Products;
import com.niit.furnisets.model.Register;


@Controller
public class FrontController {

	@RequestMapping({"/" , "home"})
	public String home()
	{		
		return "index";
	}
	
	@RequestMapping("tel")
	public String contact()
	{		
		return "contact";
	}
	
	@RequestMapping("Signup")
	public String createuser(Model model)
	{		
		model.addAttribute("reg", new Register());
		return "createuser";
	}
	
	@RequestMapping("signin")
	public String signin()
	{		
		return "login";
	}
	
	@RequestMapping("createprod")
	public String createprod(Model model)
	{		
		model.addAttribute("prod", new Products());
		return "createproduct";
	}
	
}
