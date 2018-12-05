package com.scp.java.sorting;

import java.util.Comparator;
 class NameSort implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getpName().compareTo(o2.getpName());
		
	   }
	}