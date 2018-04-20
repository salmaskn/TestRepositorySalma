package test;

import java.util.Date;
import java.util.TimeZone;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;



public class dasd {

	public dasd() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	/*	System.out.println(">>>"+System.currentTimeMillis());
     Date test= new Date(System.currentTimeMillis());
     System.out.println("datePPPPPPPPP>>>>>>>"+test);
     DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
   System.out.println(dateFormat.format(test));
 
   String pattern = "yyyy-MM-dd HH:mm:ss";
   SimpleDateFormat format = new SimpleDateFormat(pattern);
   String strDate = format.format(new java.util.Date());
   System.out.println("ijjhg"+strDate);
*/
		DateFormat utcFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		utcFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

		Date date;
		try {
			date = utcFormat.parse("2012-08-15T22:56:02.038Z");
			DateFormat pstFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
			pstFormat.setTimeZone(TimeZone.getTimeZone("PST"));

			System.out.println(pstFormat.format(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
