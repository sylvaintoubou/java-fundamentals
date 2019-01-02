package thread;

public class MyThread implements Runnable, java.lang.Runnable {
	String threadName;
	Thread thread;
	MyThread otherThread;
	private Conversation converse;
	static String[]questions= {"hello","how are you doing","how old are you ?","do you write your code ?"};
	
	public MyThread(String threadName, Conversation converse) {
		super();
		this.threadName = threadName;
		this.converse = converse;
	}
	public MyThread(MyThread firstThread, String string) {
		this.threadName = string;
		this.thread = thread;
		
	}
	public MyThread(String threadName) {
		this.threadName = threadName;
	}
	
	private String getThreadName() {
		return threadName;
	}
	
	@Override
		public void run() {
		/*int sum=0;
		start();
		try {
			for(int i=0;i<10;sum+=i++) {
				System.out.printf("%s is adding the first %d numbers.waiting for 3 seconds \n",threadName,i);
				Thread.sleep(3000);
				if(i==5 && otherThread!=null) {
					otherThread.wait();
				}
			}
		}catch(InterruptedException|IllegalMonitorStateException ie){
			ie.printStackTrace();
		}finally {
			System.out.println(threadName+" Stopping of all 10 number is " + sum);
		}
		*/
		for(int i =0;i<questions.length-1;i++) {
			
			converse.ask(getThreadName(),questions[i]);
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void start() {
		System.out.println("Starting " + threadName);
		
	}
	

}
