package dates_calendars;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar_class {

	public static void main(String[] args) {
	
	// Calendar class provides many advanced methods when compared with Date class 

	Calendar c = Calendar.getInstance();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");  //abfl_coe otp 
	System.out.println("Today's date is : "+sdf.format(c.getTime()));
		
	System.out.println(c.get(Calendar.DAY_OF_MONTH));  //1
	
	System.out.println(c.get(Calendar.AM_PM));
	
	System.out.println(c.get(Calendar.DAY_OF_YEAR));
	
	System.out.println(c.get(Calendar.HOUR));  //2
	
	System.out.println(c.get(Calendar.DAY_OF_WEEK));
	
	System.out.println(c.get(Calendar.HOUR_OF_DAY));  //2
	
	System.out.println(c.get(Calendar.DATE));  //1
	
	System.out.println(c.get(Calendar.MINUTE));
	
	System.out.println(c.get(Calendar.WEEK_OF_MONTH));
	
	System.out.println(c.get(Calendar.WEEK_OF_YEAR));
	}
}
