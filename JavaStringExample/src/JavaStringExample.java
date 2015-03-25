// Java String class example shows how to use 
//  some of the most used methods of the String class 
 
public class JavaStringExample {
	
	public static void main(String[] args) {
        String s = "Java";
        
        System.out.println(s);
        
        System.out.println("Length: " + s.length());
        
        System.out.println("Lowercase: " + s.toLowerCase());
        
        System.out.println("Uppercase: " + s.toUpperCase());
        
        System.out.println("'a' replaced with '*': " + s.replace('a', '*'));
        
        System.out.println("Substring (2-4):" + s.subSequence(1, 3));
        
        System.out.println("Equals ignore case to 'JAVA': " + s.equalsIgnoreCase("JAVA"));
        
        System.out.println("Character at 3rd position: " + s.charAt(2));
    } 
}
