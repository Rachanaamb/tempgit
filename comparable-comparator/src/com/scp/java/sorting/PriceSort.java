package com.scp.java.sorting;

import java.util.Comparator;

public class PriceSort implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		int i=((Product)o1).getpName().compareTo(o2.getpName());
		if(i==0)
			return o1.getPrice()-o2.getPrice();
		return i;
		
		
	
	}
}
