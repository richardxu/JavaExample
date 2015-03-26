//Java thread sleep time example 
//The thread sleep duration wont be same as gived time
//Specified time is more approximate than exact time
public class ThreadSleepTimeExample {
	
	public static void main(String [] args){
		long start;
		long end;
		
		for (int i = 0 ; i < 5; i++){
			start = System.nanoTime();
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println("Thread was interrupted!");
			}
			end = System.nanoTime();
			System.out.println("Sleep duration " + ((double)(end-start)/1000000) +  " ms ");
		}
	}

}
