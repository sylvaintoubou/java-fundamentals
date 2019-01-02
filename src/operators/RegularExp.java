package operators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {

	public static void main(String[] args) {
		String src = "123d@abc123.xyz";// _12re@gmail.com
		String patternString = "([0-9]*[a-zA-Z]+[0-9]*)(@)([a-z]+)(.)([a-z])";
		
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(src);
		
		if(matcher.lookingAt())
			System.out.println("Match found");
		
		if(matcher.find(0)) {
			System.out.println("Start method: "+matcher.start());
			System.out.println("Start group: "+matcher.start(1));
			System.out.println("Start method: "+matcher.end());

		}else {
			System.out.println("Match not found");
		}
	}

}
