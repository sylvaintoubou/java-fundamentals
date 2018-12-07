package seven.lesson25;

public class MyRunnableThread implements Runnable{
	
	String threadName;
	Thread thread;
	MyRunnableThread otherThread;
	private Conversation converse;
	static String[] questions = {"Hello!", "How are you doing?", "How old are you?", "Do you experience the Almighty?"};

	
	
	public MyRunnableThread(String threadName, Conversation converse) {
		this.threadName = threadName;
		this.converse = converse;
	}

	public MyRunnableThread(String name) {
		this.threadName = name;
	}

	public MyRunnableThread(String name, Thread threadName) {
		this.threadName = name;
		this.thread = threadName;
	}

	
	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		// Thread running code here
		
		/*
		int sum = 0;
		
		try {
			
			for(int i = 0; i < 10; sum += i++) {
				System.out.printf("%s is adding the first %d numbers. Waiting for 3 seconds,\n", threadName, i);
				Thread.sleep(3000);
				
				if(i == 5 && otherThread != null) otherThread.wait(); //Set thread in waiting state
			}
			
		} catch (InterruptedException | IllegalMonitorStateException ie) {
			ie.printStackTrace();
		} finally {
			System.out.println(threadName + " Stopping. Sum of all the numbers is " + sum);
		}
		*/
		
		for(int i = 0; i < questions.length; i++) {
			
			converse.ask(getThreadName(), questions[i]);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		
	}
	
	public void start() {
		System.out.println("Starting " + threadName);
		
		if(thread == null) {
			thread = new Thread(this, threadName);
			thread.start();
		}
	}
	
	
}
