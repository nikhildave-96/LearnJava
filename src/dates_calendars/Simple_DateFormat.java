package dates_calendars;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Simple_DateFormat {

	//SDF provides customizable date formats 
	
	public static void main(String[] args) {
	
	Date d = new Date();	
	System.out.println(d.toString());    		//IST  24 hour time format with day
	System.out.println(d.toGMTString());   		//GMT time
	System.out.println(d.toLocaleString());		//IST  12 hour time format
	
/*	SimpleDateFormat sdf = new SimpleDateFormat("ddMMyy");  		//abfl_coe otp 
	System.out.println(sdf.format(d));
*/	
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");  
	System.out.println(sdf1.format(d));
	
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy , hh:mm:ss aa");  
	System.out.println("Timestamp for today is : "+sdf2.format(d));
	
	SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy , hh:mm:ss");  
	System.out.println(sdf3.format(d));
	
	SimpleDateFormat sdf4 = new SimpleDateFormat("E d/MMM/yy   hh:mm:ss aa");  
	System.out.println(sdf4.format(d));
	// Above all are 12 hour format. Hence AM or PM can be used but for 24 hour format writing aa/aaa makes no sense   
	
	
	
	SimpleDateFormat sdf5 = new SimpleDateFormat("dd/M/YYYY HH:mm:ss ");  // 24 HOUR FORMAT
	System.out.println(sdf5.format(d));
	
	SimpleDateFormat sdf6 = new SimpleDateFormat("dd/M/YYYY HH:mm:ss sss ");  // 24 HOUR FORMAT
	System.out.println(sdf6.format(d));
	
	SimpleDateFormat sdf7 = new SimpleDateFormat("dd/M/YYYY HH:mm:ss SSS ");  // 24 HOUR FORMAT
	System.out.println(sdf7.format(d));
	
	SimpleDateFormat sdf8 = new SimpleDateFormat(" d/M/YY H:m:s z_ ");  // 24 HOUR FORMAT
	System.out.println(sdf8.format(d));
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa_" );
	String timeStamp = sdf.format(d);
	System.out.println(timeStamp);
	
	SimpleDateFormat sdf9 = new SimpleDateFormat("dd-MMM-YYYY hh:mm:ss aa");  // 24 HOUR FORMAT
	System.out.println(sdf9.format(d));
  }
}
