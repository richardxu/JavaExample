import java.util.Iterator;
import java.util.LinkedHashMap;

//Java LinkedHashMap is an ordered version of HashMap, does not allow keys duplicates,
// but allows null value.
//
//Elements are linked, which allows you to iterate through the map in the order
//in which elements were inserted.
//
//Faster iteration through the Map, but slower adding and removing elements than HashMap.

public class LinkedHashMapExample {

	 public static void main(String[] args) {
		    LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>(); 
		    map.put(new Integer(1), "Green");
		    map.put(2, "Yellow"); //you can use int instead Integer object
		    map.put(new Integer(3), "Blue");
		    map.put(new Integer(4), "Red");
		    
		    System.out.println("Map elements:");
		    //ordered by insertion order
		    for(Integer key : map.keySet()){
		             System.out.println("Key/Value: " + key + "/" + map.get(key));
		    }
		    
		    System.out.println("Map size:" + map.size());
		    System.out.println("Removing element 'Blue'...");
		    map.remove(3);
		    System.out.println("Map size:" + map.size());
		    System.out.println("Map elements:");
		    //iterating by iterator
		    Iterator<Integer> i = map.keySet().iterator(); 
		    while (i.hasNext()) {
		         Integer key = i.next();
		         System.out.println("Key/Value: " + key + "/" + map.get(key));
		    }
		    
		    System.out.println("Map contains key '2'? " + map.containsKey(2));
		    System.out.println("Map contains object 'Red'? " + map.containsValue("Red"));
		    System.out.println("Removing all elements...");
		    map.clear();
		    System.out.println("Map is empty now? " + map.isEmpty());
		    map.put(null, "NullTest"); //allows null value!
		   } 
}
