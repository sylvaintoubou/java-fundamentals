package thread;

public class mainTrhead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*MyThread firstThread = new MyThread("runnableThread Thread");
		MyThread secondThread = new MyThread(firstThread,"second runnable");
		Thread thread1=new Thread(secondThread);
		thread1.start();
		Thread thread2=new Thread(firstThread);
		thread2.start();*/
		/*new MyThread2("MyThread",null).start();;
		new MyThread2(null,new Runnable() {

			@Override
			public void run() {
				int product=0;
				for(int j=1;1<=10;) {
					product*=j++;
					System.out.println(product);
				}
				
			} } 
		).start();*/
		Conversation a=new Conversation();
		MyThread mthread1=new MyThread("question",a);
		MyThread2 mthread2=new MyThread2("answer",a);
		mthread1.start();
		mthread2.start();
		
		
	}
}
