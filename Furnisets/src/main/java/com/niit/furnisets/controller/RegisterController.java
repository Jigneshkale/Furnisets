package com.niit.furnisets.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.niit.furnisets.dao.RegisterDAO;
import com.niit.furnisets.model.Register;

@Controller
public class RegisterController {

	@Autowired
	RegisterDAO registerDAO;
	
	@ModelAttribute
	public Register initRegister(){
		return new Register();
	}
	
	@RequestMapping("/add_u")
	public String addUser
	(@ModelAttribute Register reg, RedirectAttributes popup4)
		{		
		registerDAO.addUser(reg);
		
		popup4.addFlashAttribute("register0", "Registered Successfully");
		popup4.addFlashAttribute("register1", "Login to Continue!!!");
		return "redirect:Signup";
		
	}

	@RequestMapping("/retrive_u")
	public ModelAndView register()
	{
		List<Register> register=registerDAO.getAllUsers();
		ModelAndView model=new ModelAndView("rudusers");
		model.addObject("registerList", register);
		
		return model;
		
	}
	
	
	@RequestMapping("/delete_u")
	public String deleteUser(@RequestParam("id") int id)
	{
		registerDAO.deleteUser(id);
		
		return "redirect:retrive_u";
		
	}
	
	
	@RequestMapping(value="/edituser" ,  method = RequestMethod.GET)
	public String editUser(@RequestParam("id") int id,Model model)
	{
		Register reg=registerDAO.getUserById(id);
        model.addAttribute("register", reg);	
		
		return "edituser";
		
	}
	
	@RequestMapping(value = "/update_u" ,  method = RequestMethod.POST)
	public String updateUser(@ModelAttribute("reg") Register reg1, @RequestParam("id") int id)
	{
		registerDAO.updateUser(reg1, id);;
		
		return "redirect:retrive_u";
		
	}
	
}