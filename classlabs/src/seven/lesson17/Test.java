package seven.lesson17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.time.*;

public class Test {


	public static void main(String[] args) {
		
		Date date1 = new Date();
		Date date2 = new Date(1_520_000_000_000l);
		
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date1.after(date2));
		System.out.println((date1.getTime()/1000)+" seconds\n"
		+((date1.getTime())/(1000*60))+" minutes\n"
		+((date1.getTime()/(1000*60*60))+" hours\n"
		+((date1.getTime()/(1000*60*60*24))+" days\n"
		+((date1.getTime()/(1000*60*60*24*365)+" years\n")))));
		
		/*
		System.out.println(new SimpleDateFormat("hh:mm:ss a").format(date1));
		System.out.println(new SimpleDateFormat("HH:mm:ss:SS").format(date1));
		System.out.println(new SimpleDateFormat("G").format(date1));
		System.out.println(new SimpleDateFormat("d M y").format(date1));
		System.out.println(new SimpleDateFormat("E").format(date1));
		System.out.println(new SimpleDateFormat("D").format(date1));
		System.out.println(new SimpleDateFormat("w").format(date1));
		System.out.println(new SimpleDateFormat("W").format(date1));
		System.out.println(new SimpleDateFormat());
		*/
		
		SimpleDateFormat sFormat = new SimpleDateFormat("yyyy/m/d HH:mm:ss");
		String egDate = "2018/11/19 12:11:10";
		try {
			Date convDate = sFormat.parse(egDate);
			System.out.printf("parse as: %s\n", convDate.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\n************************************");
		try {
			System.out.println("Now: "+ date1);
			
			for (int i = 1; i >= 0; i--) {
				Thread.sleep(1000);
				System.out.println(i);
			}
			
			System.out.println("New now: " + date1);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("*************************************");
		
		
		GregorianCalendar gCalendar = (GregorianCalendar) Calendar.getInstance();
		GregorianCalendar futureTime = new GregorianCalendar(2019,11,19);
		futureTime.set(GregorianCalendar.HOUR, 10);
		
		System.out.println("\n*************************************");
		System.out.println(gCalendar.getTime());
		System.out.println(futureTime.getTime());
		System.out.printf("ERA %s \nYear %s \nMonth %s \nDay %s \nTime Zone %s\n\n", 
				futureTime.get(GregorianCalendar.ERA), 
				futureTime.get(GregorianCalendar.YEAR), 
				futureTime.get(GregorianCalendar.MONTH), 
				futureTime.get(GregorianCalendar.DAY_OF_MONTH), 
				futureTime.getTimeZone().getDisplayName());
		
		gCalendar.roll(GregorianCalendar.YEAR, false);
		System.out.println(gCalendar.getTime());
		
		Clock clock = Clock.systemDefaultZone();
		LocalDateTime ldt = LocalDateTime.now();
		LocalTime lt = LocalTime.now();
		LocalDate ld = LocalDate.now();
		
		System.out.println("\n*************************************");
		System.out.println(ldt);
		System.out.println(ld);
		System.out.println(lt);
		System.out.println(ld.getMonthValue());
		
		//Instant instant = Instant.now();
		//System.out.println(instant.plus(13, instant.DAYS));
		
		Period period = Period.ofDays(10); 
		

	}

}
