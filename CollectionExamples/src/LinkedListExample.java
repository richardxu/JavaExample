import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

    /**
     * Java LinkedList example
     * Adding/removing objects to the LinkedList and basic LinkedList methods 
     * 
     * ArrayList和LinkedList的大致区别：
     * 1.ArrayList是实现了基于动态数组的数据结构，LinkedList基于链表的数据结构。
     * 2.对于随机访问get和set，ArrayList觉得优于LinkedList，因为LinkedList要移动指针。
     * 3.对于新增和删除操作add和remove，LinedList比较占优势，因为ArrayList要移动数据
     */
	
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>(); 
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");
        System.out.println("List elements:");
        for(String s : list){
            System.out.println("-" + s);
        }
        
        
        //first element has index 0, second 1, ...
        System.out.println("Second element is:" + list.get(1));
        
        System.out.println("Index of object 'Second':" 
                                + list.indexOf("Second"));//1
        
        System.out.println("List size:" + list.size());
        System.out.println("Sublist from 3rd(inclusive) to 5th(exclusive) el:" 
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
        
        System.out.println("First element:" + list.getFirst());
        
        System.out.println("Last element:" + list.getLast());
        
        System.out.println("Adding element at first position...");
        list.addFirst("Zero");
        
        System.out.println("Adding element at last position...");
        list.addLast("Six");
        
        System.out.println("Iterating from last -> first element");
        Iterator<String> d = list.descendingIterator(); 
        while (d.hasNext()) {
            String s = d.next();
            System.out.println("-" + s);
        }
    }
}