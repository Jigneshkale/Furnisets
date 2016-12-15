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

import com.niit.furnisets.dao.ProductsDAO;
import com.niit.furnisets.model.Products;

@Controller
public class ProductsController {

	@Autowired
	ProductsDAO productsDAO;
	
	@ModelAttribute
	public Products initProduct(){
		return new Products();
	}
	
	@RequestMapping("/add")
	public String addProduct
	(@ModelAttribute Products prod, RedirectAttributes popup3)
		{		
		productsDAO.addProduct(prod);
		
		popup3.addFlashAttribute("product0", "Product Created");
		popup3.addFlashAttribute("product1", "Successfully");
		return "redirect:createprod";
		
	}

	@RequestMapping("/retrive")
	public ModelAndView products()
	{
		List<Products> products=productsDAO.getAllProducts();
		ModelAndView model=new ModelAndView("rudproduct");
		model.addObject("productList", products);
		
		return model;
		
	}
	
	
	@RequestMapping("/delete")
	public String deleteProduct(@RequestParam("id") int id)
	{
		productsDAO.deleteProduct(id);
		
		return "redirect:retrive";
		
	}
	
	
	@RequestMapping(value="/editprod" ,  method = RequestMethod.GET)
	public String editProduct(@RequestParam("id") int id,Model model)
	{
		Products prod=productsDAO.getProductById(id);
        model.addAttribute("product", prod);	
		
		return "editproduct";
		
	}
	
	@RequestMapping(value = "/update" ,  method = RequestMethod.POST)
	public String updateProduct(@ModelAttribute("prod") Products prod1, @RequestParam("id") int id)
	{
		productsDAO.updateProduct(prod1, id);;
		
		return "redirect:retrive";
		
	}
	
}