
package com.niit.furnisets.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
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
	public Products initProduct() {
		return new Products();
	}

	@RequestMapping("/add")
	public String addProduct(@ModelAttribute Products prod, RedirectAttributes popup3) {

		if (!prod.getImage().isEmpty()) {
			productsDAO.addProduct(prod);
			try {
				File dir = new File(
						"C:/Users/rajes/Desktop/DT/Diginext/dir_main/Furnisets/src/main/webapp/WEB-INF/source/images/products");
				byte[] bytes = prod.getImage().getBytes();
				if (!dir.exists())
					dir.mkdir();

				File serverFile = new File(dir, prod.getProductName() + prod.getId() + ".jpg");
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();
				System.out.println("Successful" + prod.getProductName());
			} catch (Exception e) {
				System.out.println("Unsuccessful" + prod.getProductName() + "  " + e.getMessage());
			}
		} else {
			System.out.println("Failed to upload" + prod.getProductName() + "Problem with Format");
		}

		popup3.addFlashAttribute("product0", "Product Created");
		popup3.addFlashAttribute("product1", "Successfully");
		return "redirect:createprod";

	}

	@RequestMapping("/retrive")
	public ModelAndView products() {
		List<Products> prod = productsDAO.getAllProducts();
		ModelAndView model = new ModelAndView("rudproduct");
		model.addObject("productList", prod);

		return model;

	}


	@RequestMapping("/delete")
	public String deleteProduct(@RequestParam("id") int id) {
		productsDAO.deleteProduct(id);

		return "redirect:retrive";

	}

	@RequestMapping(value = "/editprod", method = RequestMethod.GET)
	public String editProduct(@RequestParam("id") int id, Model model) {
		Products prod = productsDAO.getProductById(id);
		model.addAttribute("product", prod);

		return "editproduct";

	}

	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public String detailProduct(@RequestParam("id") int id, Model model) {
		Products prod = productsDAO.getProductById(id);
		model.addAttribute("product", prod);

		return "detail";

	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateProduct(@ModelAttribute("prod") Products prod1, @RequestParam("id") int id) {
		productsDAO.updateProduct(prod1, id);
		;

		return "redirect:retrive";

	}
	
	
	@RequestMapping("/all")
	public ModelAndView products1() {
		List<Products> prod = productsDAO.getAllProducts();
		ModelAndView model = new ModelAndView("view");
		model.addObject("product1", prod);

		return model;

	}
	
	@RequestMapping(value = "/living", method = RequestMethod.GET)
	public ModelAndView livingProduct(@RequestParam("catagory") String category){
		List<Products> prod = productsDAO.getProductByCatagory(category);
		ModelAndView model = new ModelAndView("view");
		model.addObject("product1", prod);
		return model;
		
		
	}

	
	@RequestMapping(value = "/bed", method = RequestMethod.GET)
	public ModelAndView bedProduct(@RequestParam("catagory") String category){
		List<Products> prod = productsDAO.getProductByCatagory(category);
		ModelAndView model = new ModelAndView("view");
		model.addObject("product1", prod);
		return model;
		
		
	}
	
	@RequestMapping(value = "/k&d", method = RequestMethod.GET)
	public ModelAndView kdProduct(@RequestParam("catagory") String category){
		List<Products> prod = productsDAO.getProductByCatagory(category);
		ModelAndView model = new ModelAndView("view");
		model.addObject("product1", prod);
		return model;
		
		
	}
	
	@RequestMapping(value = "/study", method = RequestMethod.GET)
	public ModelAndView studProduct(@RequestParam("catagory") String category){
		List<Products> prod = productsDAO.getProductByCatagory(category);
		ModelAndView model = new ModelAndView("view");
		model.addObject("product1", prod);
		return model;
		
		
	}
}