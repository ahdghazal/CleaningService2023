package com.cleaning_service;



import java.util.ArrayList;
import java.util.List;
public class adminFunction {
	
	static List<Admin> admins=new ArrayList<Admin>();
	static List<Product> products=new ArrayList<Product>();
	
	 adminFunction() {
		
	}
	
	public  int search(String w) {
		for(int i=0; i < admins.size() ; i++) {
			if(w.equalsIgnoreCase(admins.get(i).getUsername())) {
				return i;
			}
		}
		
		return -1;
	}

	public  int searchproduct(String w) {
		for(int i=0; i < products.size() ; i++) {
		
			if(w.equalsIgnoreCase(products.get(i).getName())){
				return i;
			}
		}
			return -1;
	}
		
		
		public  Product searchproductindex(int w) {
		
		return products.get(w) ;
	}
	public static  Boolean CheckIfProductCanAdd(String name) {
		for(int i=0; i < workerFunction.products.size() ; i++) {
			
			if(products.get(i).getName().equalsIgnoreCase(name))
			{
				return false;
			}
		}
		
		return true;
		
	}

public   List<Product> findProductsByName(String name) {
	ArrayList<Product> foundProducts = new ArrayList<Product>();
    for (Product product : products) {
        if (product.getName().equalsIgnoreCase(name)) {
            foundProducts.add(product);
        }
    }
    return foundProducts;
}



	public  void AddProduct(Product p) {
		products.add(p);
	}
}


