package seven.sideQuest;

public class subscriberMTN {
	
	private int database[] = new int[9];
	

	public void generateNumber() {
		
		//int index = 8;
		database[0] = 6;
		database[1] = 7;
		
		for(int index = 8; index > 1 ; index--) {
			
			
			for(int i = 0; i <= 9; i++) {
				database[index] = i;
				
				for(int el : database) 
					System.out.print(el);
				System.out.println();
				
			}
			
			
			
		}
		
		
	}
}
