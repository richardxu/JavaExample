import java.util.Arrays;


public class ArrayCopyExample {

	static long msStart;
	static long msEnd;
	
	public static void main(String[] args){
		//creating array of 10mil. Strings
		String[] sourceArr = new String[10000000];
		Arrays.fill(sourceArr, "Element");
		String[] destArr;
		
		System.out.println("========== sourceArr length is " + sourceArr.length);
		
		//Array copy using for-loop
		start();
		destArr = new String[sourceArr.length];
		for (int i = 0; i < sourceArr.length; i++) {
			destArr[i] = sourceArr[i];
		}
		end("For loop");
		
		//Array copy using clone() method 
		start();
		destArr = (String[]) sourceArr.clone();
		end("clone()");
		
		//Array copy using Arrays.copyOf method 
		start();
		destArr = (String[]) Arrays.copyOf(sourceArr, sourceArr.length);
		end("Arrays.copyOf()");
		
		//Array copy using System.arraycopy() method 
		start();
		System.arraycopy(sourceArr, 0, destArr, 0, sourceArr.length);
		end("System.arrayCopy()");
	}
	
	static void start() {
		msStart = System.currentTimeMillis();
	}
	
	static void end(String s){
		msEnd = System.currentTimeMillis();
		System.out.println(s + " time: " + (msEnd - msStart) + "ms");
	}
}
