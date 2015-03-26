import java.util.HashMap;
import java.util.Iterator;

/**
 * 	HashMap is an implementation of Map. All optional operations are supported. 
 * 	Java HashMap example 
 * Java HashMap is unordered and unsorted Map.
 * Like all Map interface implementations, HashMap must have unique keys.
 * 
 * Uses hashcode for the keys being inserted and the more efficient hashcode implementation,
 * the better performances you will get.
 * 
 * 	Allows one null key and multiple null values.
 * 	
 * - See more at: http://www.javacodeexamples.com/hashmap/#sthash.zsgMfVdT.dpuf
 */


public class HashMapExample {

	public static void main(String[] args){
		//HashMap :packages/apps/Settings/src/com/android/settings/UsageStats.java 
		//private HashMap<String, CharSequence> mAppLabelMap;
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(new Integer(1), "Car");
		map.put(2, "Bus");  //you can use number instead of integer object
		map.put(new Integer(3), "Truck");
//		map.put(3, "motor");  // if use the same key, the previous value is overrided. 
		
		System.out.println("Map elements:");
		for(Integer key : map.keySet()){
			System.out.println("Key/Value: " + key + "/" + map.get(key));
		}
		
		System.out.println("Map size:" + map.size());
		
		System.out.print("Removing element 'Truck'");
		map.remove(3);
		
		/*
		 * remove(Object key) 
		 * Removes the mapping with the specified key from this map.
		 */
		//map.remove("Car");	//remove() function --- must be key not use value 		 
			
		System.out.println("Map size:" + map.size());
		System.out.println("Map elements after removing Truck:");
		
		//iterating by iterator
		Iterator<Integer> i = map.keySet().iterator();
		while(i.hasNext()){
			Integer key = i.next();
			System.out.println("Key/Value: " + key + "/" + map.get(key));
		}
		
		System.out.println("Map contains key '2'?" + map.containsKey(2));
		System.out.println("Map contains key '4'?" + map.containsKey(4));
		System.out.println("Map contains object 'Car'?" + map.containsValue("Car"));
		
		System.out.println("Removing all elements...");
		map.clear();
		System.out.println("Map is empty now? " + map.isEmpty());
		
		map.put(null, "NULLTest"); //allows null value;
		
	}
	
}
