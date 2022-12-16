package Practice;

import java.util.*;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	double Price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.Price = price;
	}
}

public class JavaStreamExample {
	public static void main(String args[]) {
		List<Product> productList=new ArrayList<Product>();
		productList.add(new Product(1,"HP",60000));
		productList.add(new Product(2,"Lenovo",75000));
	    productList.add(new Product(3,"acer",45000));
	    productList.add(new Product(4,"Dell",80000));
	    productList.add(new Product(5,"Apple",90000));
	    productList.add(new Product(6,"Sony",65000));
	    
	  
		List<Double> productPriceList=productList.stream().filter(p->p.Price>70000).map(p->p.Price)
	    		.collect(Collectors.toList());
	    System.out.println(productPriceList);
		
	}

}
