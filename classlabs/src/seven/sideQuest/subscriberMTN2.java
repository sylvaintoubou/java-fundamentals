package seven.sideQuest;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class subscriberMTN2 {
	
	private int database[] = new int[3];
	

	public void generateNumber() {
		
		//int index = 8;
		database[0] = 6;
		database[1] = 7;
		
	
			
			
			for(int i = 9999999; i >= 1000000 ; i--) {
				database[2] = i;
				
				for(int el : database) System.out.print(el);
				System.out.println();
				
			}
			
			

		
		
	}
}
