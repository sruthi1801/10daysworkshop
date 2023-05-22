package com.example.demo;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;







@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
ProductDb p;
	
	Product p1;
	List<Product> li=new ArrayList<>();
	
@GetMapping("/get")


public List<Product> getall(){
	/*li=p.findAll();
	for(Product p:li)
	{
		System.out.println(p.getName());
	}*/
	return p.findAll();
	
}



@GetMapping("/get/{place}")
public List<Product> getbyplace(@PathVariable String place){
	
	List<Product> p2=new ArrayList<>();
	List<Product> p3=new ArrayList<>();
	p2=p.findAll();
	for(Product p:p2)
	{
		if(p.getPlace().equals(place))
		{
			p3.add(p);
	
		}
	}
	return p3;
}

@GetMapping("/name")
public List<Product> getbyname(@RequestParam("name") String name){
	List<Product> p2=p.findAll();
	List<Product> p3=new ArrayList<>();

	for(Product p:p2)
	{
		if(p.getName().equalsIgnoreCase(name))
		{
			p3.add(p);
	
		}
	}
	return p3;

}
@GetMapping("/warranty")
public List<Product> getwarrantyless(){
	List<Product> p2=p.findAll();
	List<Product> p3=new ArrayList<>();

	for(Product p:p2)
	{
		if(p.getWarranty()<2024)
		{
			p3.add(p);
	
		}
	}
	return p3;

}


}
