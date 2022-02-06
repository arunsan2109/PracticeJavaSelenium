package com.Collections;

import java.util.*;

public class ListTestTwo {

	/*
	 * List<---- ArrayListClass, <----LinkedListClass, <----VectorClass and <----Extends StackClass
	 */
	public void getList() {
		List arrayList = new ArrayList();
		List linkedList = new LinkedList();
		List vector = new Vector();
		List stack = new Stack();    // LIFO > Last In First Out

		arrayList.add(345);
		arrayList.add("C");
		arrayList.add(345);
		arrayList.add("A");

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}
	}
	
	/*
	 * Set<----HashSet, <----LinkedHashSet, <----SortedSet(Implements)<----TreeSet
	 */
	public void getSet(){
		Set hashSet = new HashSet();
		Set linkedHashSet = new LinkedHashSet();
		Set treeSet = new TreeSet(hashSet);
		
		hashSet.add("D");
		hashSet.add("C");
		hashSet.add("E");
		hashSet.add("A");
		hashSet.add(null);
		
		System.out.println();
		for(Object object : hashSet){
			System.out.print(object +" ");
		}
	}
	
	/*
	 * Map<----HashMap, <----HashTable, <----SortedMap(Implements)<----TreeMap
	 */
	
	public void getMap(){
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> hashTable = new Hashtable<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		hashMap.put(3, "D");
		hashMap.put(4, "A");
		hashMap.put(2, "C");
		hashMap.put(1, "B");
		
		System.out.println();
		for(Map.Entry<Integer, String> m:hashMap.entrySet()){
			System.out.println(m.getKey() +" " +m.getValue());
		}
		System.out.println("---------------------------------------------------------------------");
		TreeMap<Integer, String> treeMapNew = new TreeMap<Integer, String>(hashMap);
		System.out.println(treeMapNew);
		
		System.out.println("----------------------------------------------------------------------");
		hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		System.out.println("----------------------------------------------------------------------");
		hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		System.out.println("----------------------------------------------------------------------");
		hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		
		System.out.println("----------------------------------------------------------------------");
		hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
	}

	public static void main(String args[]) {

		ListTestTwo ltt = new ListTestTwo();
		ltt.getList();
		ltt.getSet();
		ltt.getMap();
	}
}
