package seven.lesson25;

public class Main {

	public static void main(String[] args) {
		
		/*
		//Multithreading with runnable interfaces
		MyRunnableThread firstThread = new MyRunnableThread("First Runnable Thread");
		MyRunnableThread secondThread = new MyRunnableThread("Second Runnable Thread", new Thread(firstThread));
		Thread thread1 = new Thread(secondThread);
		thread1.start();
		Thread thread2 = new Thread(firstThread);
		thread2.start();
		
		//Multithreading with Thread class
		new MyThread("My Thread").run();
		new MyThread(new Runnable() {
			
			@Override
			public void run() {
				
				int product = 1;
				for(int j = 1; j <= 10;) {
					product *= j++;
					System.out.println(product);
				}
				
				System.out.println("Product of first 10 numbers " + product);
				
			}
		}).start();
		*/
		
		Conversation conversation = new Conversation();
		MyRunnableThread qThread = new MyRunnableThread("Question Thread", conversation);
		MyThread aThread = new MyThread("Reply Thread", conversation);
		
		qThread.start();
		aThread.start();

	}

}
