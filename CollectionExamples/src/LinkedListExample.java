import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

    /**
     * Java LinkedList example
     * Adding/removing objects to the LinkedList and basic LinkedList methods 
     * 
     * ArrayList��LinkedList�Ĵ�������
     * 1.ArrayList��ʵ���˻��ڶ�̬��������ݽṹ��LinkedList������������ݽṹ��
     * 2.�����������get��set��ArrayList��������LinkedList����ΪLinkedListҪ�ƶ�ָ�롣
     * 3.����������ɾ������add��remove��LinedList�Ƚ�ռ���ƣ���ΪArrayListҪ�ƶ�����
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