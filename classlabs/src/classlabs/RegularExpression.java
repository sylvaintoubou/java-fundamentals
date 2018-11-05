package classlabs;

import java.util.Calendar;
import java.util.Formatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		String searchString = "This is my DT300 S flying car";
		String pattern = "(.*)([0-9]+ [a-zA-Z])(.*)";
		*/
		
		/*
		String searchString = "465465dasfasdfas@fadf.asd";
		String pattern = "([0-9]*[a-zA-Z]+[0-9]*)(@)([a-z]+)(.)([a-z])";
		
		// Create a pattern object
		Pattern p = Pattern.compile(pattern);
		
		// Create matcher to run pattern against
		Matcher m = p.matcher(searchString);
		
		
		if(m.lookingAt()) {
			System.out.println("Match Found!");
		}
		
		if(m.find(0)) {
			System.out.println("Start method: "+m.start());
			System.out.println("Start groups: "+m.start(1));
			System.out.println("End method: "+m.end());
			System.out.println("End groups: "+m.end(1));
			
			
		}else {
			System.out.println("Match not found ");
		}
		
		*/
		
		/*
		System.out.printf("%x and %d are the same number\n",15,15);
		System.out.printf("%E\n",0.314159265358);
		System.out.printf("%e\n",0.314159265358);
		System.out.printf("%G\n",0.314159265358);
		System.out.printf("%E\n",123456789.25);
		System.out.printf("%e\n",123456789.25);
		System.out.printf("%g\n",123456789.25);
		System.out.println("------------------------");
		System.out.printf("%c\n",'a');
		System.out.printf("%C\n",'a');
		System.out.println("------------------------");
		System.out.printf("%tc",0120122);
		*/
		
		Calendar calendar = Calendar.getInstance();
		System.out.printf("%tc\n",calendar);
		System.out.printf("%tF\n",calendar);
		System.out.printf("%tD\n",calendar);
		System.out.printf("%tr\n",calendar);
		System.out.printf("%tT\n",calendar);
		System.out.println("------------------------");
		
		// Full day month 
		System.out.printf("%1$tA,%1$tB,%1$td,%1$tY\n",calendar);
		// Full DAY MONTH
		System.out.printf("%1$TA,%1$TB,%1$Td,%1$TY\n",calendar);
		System.out.printf("%1$ta,%1$tb,%1$te,%1$ty\n",calendar);
		System.out.println("------------------------");
		System.out.printf("%1$tH:%1$tM:%1$tS\n",calendar);
		System.out.printf("%1$tZ %1$tl:%1$tM:%1$tS\n",calendar);
		
		float floatingPoint = 123.456439f;
		System.out.println("------------------------");
		System.out.printf("%2.3f\n",floatingPoint);
		System.out.println("------------------------");
		System.out.printf("%.10s\n","What is your name?");
		System.out.println("------------------------");
		System.out.printf("%s \t %+d \n",123,-123);
		System.out.printf("%#x\n",12345);
		System.out.printf("%#x\n",-12345);
		System.out.printf("%+09d\t",123);
		System.out.printf("%,d\n",1230000);
		System.out.printf("%,.2f\n",1230.9812);
		System.out.printf("%,.2f\n",123.4);
		System.out.printf("%(d\t",1230);
		System.out.printf("%(d\n",123);
		System.out.println("------------------------");
		System.out.println("His code name is \"John\"");
		System.out.println("\\Hello\\");
		
		Formatter formatter = new Formatter();
		formatter.format("%d = %#o = %#X", 7,7,8);
		System.out.println("------------------------");
		System.out.println(formatter.toString());
		System.out.println(String.format("%d = %#o = %#X",5,5,5));
	





		

	}

}
