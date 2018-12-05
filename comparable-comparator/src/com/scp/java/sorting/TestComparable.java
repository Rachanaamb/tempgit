package com.scp.java.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparable {
public static void main(String[] args) {

  Product s1 = new Product(101, "Mobile", 20000);
  Product s2 = new Product(102, "Laptop", 50000);
  Product s3 = new Product(103, "TV", 35000);
  Product s4 = new Product(104, "Radio", 5000);
  Product s5 = new Product(105, "Laptop", 300);
  Product s6 = new Product(106, "Charger", 500);

  
  ArrayList<Product> listOfPro = new ArrayList<>();	
  listOfPro.add(s1);
  listOfPro.add(s2); 
  listOfPro.add(s3);
  listOfPro.add(s4);
  listOfPro.add(s5);
  listOfPro.add(s6);
  
  System.out.println("unsorted list:");
  for (int i = 0; i < listOfPro.size(); i++) {
	System.out.println(listOfPro.get(i));
}
  
Collections.sort(listOfPro,new NameSort());
System.out.println("\nsorted by name:");
for (int i = 0; i < listOfPro.size(); i++) {
	System.out.println(listOfPro.get(i));
}
 
  
  Collections.sort(listOfPro,new PriceSort());
  System.out.println("\nsorted by price :");
  for (int i = 0; i < listOfPro.size(); i++) {
  	System.out.println(listOfPro.get(i));
  }
  
  
  
  
}
}



