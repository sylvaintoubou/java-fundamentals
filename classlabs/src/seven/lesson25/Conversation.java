package seven.lesson25;

public class Conversation {

	boolean state = false;

	public Conversation() {
		
	}
	
	
	
	public synchronized void ask(String author, String message) {
		
		if(!state) {
			
			try {
				wait(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		
		System.out.printf("\n%s : %s\n", author, message);
		state = true;
		notify();
	}
	
	public synchronized void reply(String author, String message) {
		
		if(state) {
			
			try {
				wait(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		
		System.out.printf("\n%s : %s\n", author, message);
		state = false;
		notify();
	}
	
	
}
