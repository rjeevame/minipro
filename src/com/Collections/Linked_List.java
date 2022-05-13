package com.Collections;

import java.util.LinkedList;
import java.util.List;

public class Linked_List {
	
public static void main(String[] args) {
	List<Object> L = new LinkedList<Object>();
	L.add("Welcome");
	L.add(100);
	L.add('e');
	L.add(36.55);
	L.add(100);
	
	System.out.println(L);
	int size = L.size();
	System.out.println(size);
	
	Object object = L.get(1);
	System.out.println(object);
	
	L.set(4, 50);
	System.out.println(L);
	
	L.remove(3);
	System.out.println(L);
	
	int indexOf = L.indexOf('e');
	System.out.println(indexOf);
	
	boolean contains = L.contains(70);
	System.out.println(contains);
	
	List<Object> M = new LinkedList<Object>();
	M.add("To");
	M.add(50);
	M.add('e');
	M.add(36.55);
	M.add(100);
	M.add("Greens");
	
	M.addAll(L);
	System.out.println(M);
	
	M.retainAll(L);
	System.out.println(M);
	
	M.removeAll(L);
	System.out.println(M);
	
}	

	
	

}
