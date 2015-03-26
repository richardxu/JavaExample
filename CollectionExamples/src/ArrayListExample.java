import java.util.ArrayList;
import java.util.ListIterator;


/**
 * ArrayList is an implementation of List, backed by an array. 
 * All optional operations including adding, removing, and replacing elements are supported.
 * @author Administrator
 * http://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
 */
 
//Java ArrayList example 
//Adding/removing objects to the ArrayList and basic ArrayList method
public class ArrayListExample {
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		list.add("Fifth");
		
		System.out.println("List elements");
		//Way one: for every loop£¬need JDK5 or after 
		for(String s: list){
			System.out.println("-" + s);
		}
		
		//Way two:
		for(int i = 0; i < list.size(); i++){
			System.out.println("---" + list.get(i));
		}
		
		
		//first element has index 0, second 1, ...
        System.out.println("Second element is:" + list.get(1));
        
        System.out.println("Index of object 'Second':" 
                                + list.indexOf("Second"));//1
        
        System.out.println("List size:" + list.size());
        
        System.out.println("Sublist from 3rd(inclusive) to 5th(exclusive) element:" 
                + list.subList(2, 4));
        
        System.out.println("Removing second element...");
        list.remove(1);
        System.out.println("List size:" + list.size());
        System.out.println("List elements:");
        
        
        //iterating by iterator
        ListIterator<String> i = list.listIterator(); 
        while (i.hasNext()) {
            String s = i.next();
            System.out.println("-" + s);
        }
        System.out.println("List contains object 'First'? " 
                + list.contains("First"));
    } 
}
