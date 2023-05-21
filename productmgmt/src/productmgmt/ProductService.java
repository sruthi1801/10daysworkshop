package productmgmt;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
	
	List<Product> product=new ArrayList<>();
	public void add(Product p) {
		product.add(p);
	}
	
	public List<Product> get(){
		return product;
	}
	public Product getproduct(String name)
	{
		for(Product p:product)
		{
			if(p.getName().equals(name))
			{
				return p;
				
				
			}
		}
		return null;
	}

	public List<Product> getbytext(String text) {
		// TODO Auto-generated method stub
		//return null;
		List<Product> pro=new ArrayList<>();
		for(Product p1:product)
		{
			if(p1.getName().contains(text)||p1.getPlace().contains(text)||p1.getType().contains(text)) {
				
				pro.add(p1);}
			
		}
		
		return pro;
	}

	public List<Product> getbyplace(String name) {
		// TODO Auto-generated method stub
		//return null;
		List<Product> place=new ArrayList<>();
		for(Product p1:product)
		{
			if(p1.getPlace().equals(name))
			{
				place.add(p1);
			}
		}
		return place;
	}

	public List<Product> getoutofwarranty() {
		// TODO Auto-generated method stub
		//return null;
		List<Product> warrenty=new ArrayList<>();
		for(Product p1:product)
		{
			if(p1.getWarranty()<2023)
			{
				warrenty.add(p1);
			}
			
		}
		return warrenty;
	}

}
