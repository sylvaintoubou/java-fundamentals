package seven.sideQuest;

public class BaseConverter {
	
	public BaseConverter() {
		
	}

	public int toBaseTen(int numberToConvert) {
		
		String temp = Integer.toString(numberToConvert);
		String reverse = "";
		int result =  0;
		
		for(int i = temp.length() - 1; i >= 0; i--)
        {
            reverse = reverse + temp.charAt(i);
        }
		
		for (int i = 0; i < reverse.length(); i++) {
			result += Math.pow(Integer.parseInt(reverse, reverse.charAt(i++)),i++);
		}
	
		return result;
	}
	
	public void toBaseTwo() {
		
	}
	
	public void toBaseSixteen() {
		
	}
}
