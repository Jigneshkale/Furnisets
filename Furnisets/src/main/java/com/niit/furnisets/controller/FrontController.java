package com.niit.furnisets.controller;

import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.niit.furnisets.model.Products;
import com.niit.furnisets.model.Register;


@Controller
public class FrontController {

	@RequestMapping({"/" , "home"})
	public String home()
	{		
		return "index";
	}
	
	@RequestMapping("Mybag")
	public String mybag()
	{		
		return "cart";
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
	
	@RequestMapping("signout")
	public String signout(Model model, HttpSession session, RedirectAttributes pop4)
	{	
		session.invalidate();
		
		return "redirect:/home";
	}
	
	@RequestMapping("createprod")
	public String createprod(Model model)
	{		
		model.addAttribute("prod", new Products());
		return "createproduct";
	}
	
	@RequestMapping("validate")
	public String valid(Model model , HttpSession session , Principal principal)
	{		
		String name = principal.getName();
		model.addAttribute("logintext", "Loggedin Successfully!");
		session.setAttribute("logintext1", "Welcome");
		session.setAttribute("username", name);
		return "index";
	}
	
	@RequestMapping("invalidate")
	public String invalid(Model model)
	{		
		model.addAttribute("register0", "Unauthorised Access!");
		model.addAttribute("register1", "Check User-name or Password!");
		return "login";
	}
	
}
