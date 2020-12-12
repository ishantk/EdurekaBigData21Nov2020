package co.edureka.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetAPI {

	public static void main(String[] args) {
		
		//Set<String> hashSet = new HashSet<String>();
		
		HashSet<String> hashSet = new HashSet<String>();
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		
		TreeSet<String> treeSet = new TreeSet<String>();
		
		/*
		Set<String> set = new HashSet<String>();
		set = new LinkedHashSet<String>();
		set = new TreeSet<String>();
		*/
		
		hashSet.add("John");
		hashSet.add("Ana");
		hashSet.add("Kim");
		hashSet.add("Dave");
		hashSet.add("Celia");
		hashSet.add("Ana");
		hashSet.add("Kim");
		
		linkedHashSet.add("John");
		linkedHashSet.add("Ana");
		linkedHashSet.add("Kim");
		linkedHashSet.add("Dave");
		linkedHashSet.add("Celia");
		linkedHashSet.add("Ana");
		linkedHashSet.add("Kim");
		
		treeSet.add("John");
		treeSet.add("Ana");
		treeSet.add("Kim");
		treeSet.add("Dave");
		treeSet.add("Celia");
		treeSet.add("Ana");
		treeSet.add("Kim");
		
		
		System.out.println("HashSet:");
		System.out.println(hashSet);
		System.out.println();
		
		System.out.println("LinkedHashSet:");
		System.out.println(linkedHashSet);
		System.out.println();
		
		System.out.println("TreeSet:");
		System.out.println(treeSet);
		System.out.println();
		
		
		System.out.println("Iterating HashSet:"+hashSet.size());
		Iterator<String> itr = hashSet.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		
		System.out.println();
		
		System.out.println("Iterating LinkedHashSet:"+linkedHashSet.size());
		itr = linkedHashSet.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		
		System.out.println();
		
		System.out.println("Iterating TreeSet:"+treeSet.size());
		itr = treeSet.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		
	}

}
