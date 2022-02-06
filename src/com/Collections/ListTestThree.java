package com.Collections;

import java.util.*;

public class ListTestThree {
	
	/*
	 * List Interface
	 * ArrayList, LinkedList, Vector, Stack
	 */
	public void getList(){
		List arrayList = new ArrayList();
		List linkedList = new LinkedList();
		List vector = new Vector();
		List stack = new Stack();
		
		arrayList.add(6);
		arrayList.add(1);
		arrayList.add(5);
		arrayList.add(0);
		
		Collections.sort(arrayList);
		
		System.out.println("List");
		for(int i=0; i<arrayList.size(); i++){
			System.out.print(arrayList.get(i) +" ");
		}
	}
	
	/*
	 * Set Interface
	 * HashSet, LinkedHashSet and TreeSet
	 */
	public void getSet(){
		Set hashSet = new HashSet();
		Set linkedHashSet = new LinkedHashSet();
		Set treeSet = new TreeSet();
		
		hashSet.add("C");
		hashSet.add("A");
		hashSet.add("D");
		hashSet.add("B");
		
		System.out.println("\nSet");
		for(Object object: hashSet){
			System.out.print(object +" ");
		}
	}
	
	/*
	 *  Map Interface
	 *  HashMap, HashTable, TreeMap
	 */
	public void getMap(){
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map hashTable = new Hashtable();
		Map treeMap = new TreeMap();
		
		hashMap.put(3, "D");
		hashMap.put(4, "C");
		hashMap.put(1, "A");
		hashMap.put(2, "B");
		
		System.out.println("\nMap");
		System.out.println(hashMap);
		
		System.out.println("----------HashMap-----------");
		for(Map.Entry<Integer, String> m:hashMap.entrySet()){
			System.out.println(m.getKey() + " " +m.getValue());
		}
		
		System.out.println("----------HashTree to TreeMap-------");
		Map<Integer, String> treeMapNew = new TreeMap<Integer, String>(hashMap);
		for(Map.Entry<Integer, String> m:treeMapNew.entrySet()){
			System.out.println(m.getKey() + " " +m.getValue());
		}
		
		System.out.println("---------Sorting Ascending Order Key------");
		hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		System.out.println("---------Sorting Descending Order key-----");
		hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		
		System.out.println("---------Sorting Ascending Order Value----");
		hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		System.out.println("---------Sorting Descending Order Value----");
		hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
		
	}
	
	
	public static void main(String[] args){
		
		ListTestThree ltt = new ListTestThree();
		ltt.getList();
		ltt.getSet();
		ltt.getMap();
	}

}
