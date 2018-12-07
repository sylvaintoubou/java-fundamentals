package seven.lesson25;

public class MyThread extends Thread {

	String name;
	Runnable runnable;
	private Conversation converse;
	static String[] answers = {"Hi!", "I am doing fine. Thank you!", "I am 13", "No, I live in the Almighty."};
	
	
	
	public MyThread(String name, Conversation converse) {
		this.name = name;
		this.converse = converse;
	}

	public MyThread(String name) {
		this.name = name;
	}

	public MyThread(Runnable runnable) {
		this.runnable = runnable;
		this.name  = "Runnable";
	}

	public String getThreadName() {
		return name;
	}

	public void setThreadName(String threadName) {
		this.name = threadName;
	}
	
	@Override
	public void run() {
		
		if(runnable != null)
			runnable.run();
		
		int sum = 0;
		synchronized(this) {
			
			/*
			for(int i = 0; i <= 10; sum += i++ ) {
				System.out.printf("%s is adding %d to the sum\n", name, i++);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}				
			}
			*/
			for(int i = 0; i < answers.length; i++) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
				
				converse.reply(getThreadName(), answers[i]);
			}
			
		}
			
		//System.out.println("Sum of all the 10 numbers is "+ sum);
		
		
		
	}
	
	
	
}
