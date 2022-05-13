package com.Collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Map_Treemap {
	
	public static void main(String[] args) {
		
		Map<Integer, Object> a = new TreeMap<Integer, Object>();
		
		a.put(0, "Jeeva");
		a.put(1, 'R');
		a.put(2, 31);
		a.put(3, 9600.44);
		a.put(3, 0.6975);
		a.put(4, null);
		a.put(5, 'J');
		
		int size = a.size();
		System.out.println(size);
		
		Object object = a.get(4);
		System.out.println(object);
		
		Set<Integer> keySet = a.keySet();
		System.out.println(keySet);
		
		a.remove(4);
		System.out.println(a);
		
		Collection<Object> values = a.values();
		System.out.println(values);
		
		boolean containsKey = a.containsKey(4);
		System.out.println(containsKey);
		
		Set<Entry<Integer, Object>> entrySet = a.entrySet();
		System.out.println(entrySet);
		
	}

}
