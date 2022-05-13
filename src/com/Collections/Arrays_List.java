package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class Arrays_List {
	
	public static void main(String[] args) {
		
		List<Object> a = new ArrayList<Object> ();
		
		a.add("Arun kumar");
		a.add('R');
		a.add(9602654788l);
		a.add(157.3);
		a.add('R');
		a.add("Kumar");
		
		int size = a.size();
		System.out.println(size);
		
		Object object = a.get(6);
		System.out.println(object);
		
		a.set(4, 'T');
		System.out.println(a);
		
		a.remove(5);
		System.out.println(a);
		
		int indexOf = a.indexOf('R');
		System.out.println(indexOf);
		
		boolean contains = a.contains(157.3);
		System.out.println(contains);
		
		List<Object> a1 = new ArrayList<Object> ();
		
		a1.add("kumar");
		a1.add('S');
		a1.add(954879);
		a1.add(157.3);
		a1.add('T');
		a1.add("Kumar");
		
		a1.addAll(a);
		System.out.println(a1);
		
		a1.retainAll(a);
		System.out.println(a1);
		
		a1.removeAll(a);
		System.out.println(a1);
	}

}
