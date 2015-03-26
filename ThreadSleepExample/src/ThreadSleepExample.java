//Java thread sleep example 
//Suspending the execution of the current thread
// Creating the thread class by implementing Runnable interface 

class Task implements Runnable {
	String name;
	int pause;
	
	public Task(String name, int pause){
		this.name = name;
		this.pause = pause;
	}
	
	//thread's code is always inside public void run() method
	public void run() {
		System.out.println(name + " started");
		for (int i = 1; i <= 5; i++){
			try {
				//pausing the current thread for pause seconds
				Thread.sleep(pause);
				//print the counter after the pause
				System.out.println(name + "-" + i);
			}catch (InterruptedException e){
				System.out.println("Thread pause interrupted!");
			}
		}
		System.out.println(name + "finished");
	}
}


public class ThreadSleepExample {

	public static void main(String[] args){
		Task shortTask = new Task("Short", 1000); //pause  1s
		Task longTask = new Task("Long", 2200); //pause 2.2s
		
		Thread shortTaskThread = new Thread(shortTask);
		Thread longTaskThread = new Thread(longTask);
		
		shortTaskThread.start();
		longTaskThread.start();
	}
}
