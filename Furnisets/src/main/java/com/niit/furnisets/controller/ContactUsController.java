package com.niit.furnisets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.niit.furnisets.dao.ContactUsDAO;
import com.niit.furnisets.model.ContactUs;

@Controller
public class ContactUsController {

		
		@Autowired
		ContactUsDAO contactusDAOImpl;
		
		@RequestMapping("/sendcontact")
			public String submitForm(
				@RequestParam("c_name") 
				String userName,
				@RequestParam("c_number")
				String number,
				@RequestParam("c_email")
				String email,
				@RequestParam("c_sugg")
				String suggestion,
				RedirectAttributes popup1)
				{
					ContactUs cnt=new ContactUs();
					cnt.setUserName(userName);
					cnt.setNumber(number);
					cnt.setEmail(email);
					cnt.setSuggestion(suggestion);
					contactusDAOImpl.createUser(cnt);
					popup1.addFlashAttribute("success", "Thank You! Your Contact is Safe With Us");
					popup1.addFlashAttribute("success1", "Continue Shopping To Experience");
					popup1.addFlashAttribute("success2", "Our World Of Furniture");
					return "redirect:tel";
				}
}
