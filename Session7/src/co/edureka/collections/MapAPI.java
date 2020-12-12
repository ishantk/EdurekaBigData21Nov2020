package co.edureka.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapAPI {
	
	static void iterateInMap(Map<String, Integer> map) {
		for(Entry<String, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
	}

	public static void main(String[] args) {
		
		/*
		Map<String, Integer> map = new HashMap<String, Integer>();
		map = new LinkedHashMap<String, Integer>();
		map = new TreeMap<String, Integer>();*/
		
		// Key is String and Value in Integer
		
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		
		hashMap.put("Maharashtra", 3000);
		hashMap.put("Punjab", 2000);
		hashMap.put("Karnataka", 5000);
		hashMap.put("UttarPradesh", 1000);
		hashMap.put("HimachalPradesh", 500);
		
		linkedHashMap.put("Maharashtra", 3000);
		linkedHashMap.put("Punjab", 2000);
		linkedHashMap.put("Karnataka", 5000);
		linkedHashMap.put("UttarPradesh", 1000);
		linkedHashMap.put("HimachalPradesh", 500);
		
		treeMap.put("Maharashtra", 3000);
		treeMap.put("Punjab", 2000);
		treeMap.put("Karnataka", 5000);
		treeMap.put("UttarPradesh", 1000);
		treeMap.put("HimachalPradesh", 500);
		
		hashMap.put("Karnataka", 5500);	// update the value if key is already existing
		
		System.out.println(hashMap);
		System.out.println(linkedHashMap);
		System.out.println(treeMap);

		System.out.println("All keys:");
		System.out.println(hashMap.keySet());
		System.out.println("All values:");
		System.out.println(hashMap.values());
		
		Integer cases = hashMap.get("Maharashtra");
		System.out.println("cases are: "+cases);
		
		if(hashMap.containsKey("Delhi")) {
			System.out.println("Delhi is exesiting as a key");
		}else {
			System.out.println("We dont have a Key Delhi");
		}
		
		MapAPI.iterateInMap(hashMap);
		System.out.println();
		MapAPI.iterateInMap(linkedHashMap);
		System.out.println();
		MapAPI.iterateInMap(treeMap);
		
	}

}
