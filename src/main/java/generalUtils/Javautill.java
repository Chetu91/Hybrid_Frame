package generalUtils;

import java.util.Date;
import java.util.Random;

public class Javautill {

	public static int genrateRandomNum() {
		Random num=new Random();
		int value = num.nextInt(100);
		return value;
	}
	
	public int getmonth() {
		Date d=new Date();
		int month=d.getMonth();
		return month;
	}
	
	public int getday() {
		Date d=new Date();
		int day=d.getDay();
		return day;
	}
	
	public int getdate() {
		Date d=new Date();
		int date = d.getDate();
		return date;	
	}
	
	public int getYear() {
		Date d=new Date();
		int year=d.getYear();
		return year;
	}
	
	public long systemTime() {
		Date d=new Date();
		long time = d.getTime();
		return time;
	}
	
	public static String currentSystem() {
		Date date=new Date();
		String dte = date.toString().replace(" ", "_");
		return dte;
	}
	
}
