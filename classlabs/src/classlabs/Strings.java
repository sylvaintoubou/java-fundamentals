package classlabs;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String greetings = "Welcome, Sir ";
		String name1 = "Larry";
		String name2 = new String("larry");
		int compare1 = name1.compareTo(name2) ;
		char a = name1.charAt(3);
		String name3 = "name", name4 = "abcd";
		int compare2 = name4.compareTo(name3);
		int compare3 = name1.compareToIgnoreCase(name2);
		String name5 = new String("SevenAcademy");
		String name6 = "SevenAcademy";
		boolean result1 = name5.contentEquals(name6);
		char[] open = {'o','p','e','n'};
		String openCopy = String.copyValueOf(open,0,2);
		boolean result2 = name5.endsWith("emy");
		byte[] result3 = name5.getBytes();
		char[] result4 = new char[7];
		name6.getChars(5, 12, result4, 0);
		String sentence1 = "The only-way to learn-code is to-code at-seven";
		
		
		String intro = greetings.concat(name1);
		System.out.println(greetings.length());
		System.out.println(intro);
		System.out.println(a);
		System.out.println(compare1);
		System.out.println(compare2);
		System.out.println(compare3);
		System.out.println(result1);
		System.out.println(openCopy);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(name6.indexOf("ade"));
		System.out.println(name6.lastIndexOf('e'));
		System.out.println(name6.replace("Academy"," Academy"));
		System.out.println(name6);
		
		for(String split : sentence1.split("-",2))
			System.out.println(split);
		
		System.out.println(sentence1.subSequence(4,8));
		System.out.println(sentence1.substring(4));
		System.out.println(sentence1.substring(4,8));
		
		char[] chars = name3.toCharArray();
		for(char c : chars)
			System.out.println(c);
		
		String sentence2 = "The skinny %s became a fat %s of %d kg";
		System.out.println(String.format(sentence2,"woman","man",120));
	}

}
