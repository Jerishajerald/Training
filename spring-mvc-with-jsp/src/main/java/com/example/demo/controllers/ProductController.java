package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;
//for user to give input
@Controller
public class ProductController {
	@Autowired
	private Product entity;
	@Autowired
	private ProductRepository repo;

	@RequestMapping(value="/product",method=RequestMethod.GET)
	public String initForm(Model model)
	{
		model.addAttribute("title", "Add Products");
		model.addAttribute("command", entity);
		return "addProduct";
		
	}
	
	@RequestMapping(value="/product",method=RequestMethod.POST)
	public String submitForm(@ModelAttribute("command") Product entity)
	{
		int rowAdded;
	try {
		rowAdded = this.repo.add(entity);
		return"success";
	} catch (Exception e) {
		// TODO Auto-generated catch block
		
		e.printStackTrace();
		return "failure";
	}
	
	
	}

//	@RequestMapping(value="/products",method=RequestMethod.GET)
//	public String findById(Model model)
//	{
//		model.addAttribute("search",entity);
//		return "searchProduct";
//		
//	}
//	
//	@RequestMapping(value="/products",method=RequestMethod.POST)
//	public String getId(@RequestParam("id")int id,Model model)
//	{
//		Product id1= repo.findById(id);
//		model.addAttribute("found",id1);
//		return "showProduct";
//	}
	
	@RequestMapping(value="/product/srch",method=RequestMethod.GET)
public String idsearch(Model model) 
{
   model.addAttribute("serching","search");
   return "searchProduct";

}
	

@RequestMapping(value= "/product/srch", method = RequestMethod.POST)

public String searchProduct(@RequestParam("id") int id,Model model) {

     Product entity = repo.findById(id);
     model.addAttribute("found",entity);
     return "showProduct";
}


@RequestMapping(value="/product/del",method=RequestMethod.GET)
public String deleteid(Model model) {
	model.addAttribute("title", "delete");
	return "removeId";
	
}
@RequestMapping(value= "/product/del", method = RequestMethod.POST)

public String deleteProduct(@RequestParam("id") int id,Model model) {
	
	int entity = repo.remove(id);
    model.addAttribute("found",entity);
	return "deleting";
}
@RequestMapping(value="/",method=RequestMethod.GET)
public String indexUsing(Model model) {
	model.addAttribute("title","options");
	return "index";
}
			

	
}



	

