package productmgmt;

import java.util.List;

public class Main {
 

public static void main(String args[])
 {
	
	 
	 ProductService p=new ProductService();
	 //System.out.print(p);
	
	p.add(new Product("sruthi", "type1", "p1", 2024));
	p.add(new Product("anu", "type2", "p2",2020));
	p.add(new Product("Bindu", "type3", "p3",2018));

	List<Product> pro=p.get();
	/*for(Product pr:pro)
	{
		System.out.println(pr);
	}*/
	
	
	List<Product> pro1=p.getbytext("nu");
	/*for(Product pr:pro1)
	{
		System.out.println(pr);
	}*/
	
	//Search by place
	System.out.println();
	System.out.println("Get details By Place");
	List<Product> pro2=p.getbyplace("p1");
	for(Product pr:pro2)
	{
		System.out.println(pr);
	}
	System.out.println();
	
	//display product out of warrenty(before 2023)
	System.out.println();
	System.out.println("Get products out of warranty");
	List<Product> pro3=p.getoutofwarranty();
	//System.out.println(pro3);
	for(Product pr:pro3)
	{
		System.out.println(pr);
	}
	System.out.println();
	//to implement stream API 
	System.out.println("Get method Stream API");
	
	pro.stream().forEach(s-> System.out.println(s));
	
	System.out.println();
	System.out.println("Get by text Stream API");
	pro.stream().filter(q->q.getName().contains("nu")).forEach(a->System.out.println(a));
	
	System.out.println();
	
	System.out.println("Get by place stream API");
	pro.stream().filter(q->q.getPlace().equals("p3")).forEach(a->System.out.println(a));
	
	System.out.println();
	System.out.println("Products out of warrenty stream API");
	pro.stream().filter(q->q.getWarranty()<2023).forEach(a->System.out.println(a));
	
	
 }
}
