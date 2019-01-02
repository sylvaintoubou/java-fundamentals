package thread;

public class MyThread2 extends Thread{
	String name;
	Runnable runnable;
	private Conversation converse;
	static String[]answers= {"hi!","i am doing fine.Thank you!","i am 13","NO,i live in code"};
	
	public MyThread2(String name, Conversation converse) {
		super();
		this.name = name;
		this.converse = converse;
	}
	public MyThread2(String name, Runnable runnable) {
		super();
		this.name = name;
		this.runnable = runnable;
	}
	private String getThreadName() {
		return name;
	}
	
	public void run() {
		// for answer
		for(int i =0;i<answers.length-1;i++) {
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			converse.reply(getThreadName(),answers[i]);
		}
		//end for answer
	}
	
	

	public Runnable getRunnable() {
		return runnable;
	}

	public void setRunnable(Runnable runnable) {
		this.runnable = runnable;
	}

	public Conversation getConverse() {
		return converse;
	}

	public void setConverse(Conversation converse) {
		this.converse = converse;
	}

	public static String[] getAnswers() {
		return answers;
	}

	public static void setAnswers(String[] answers) {
		MyThread2.answers = answers;
	}
	
	
}
