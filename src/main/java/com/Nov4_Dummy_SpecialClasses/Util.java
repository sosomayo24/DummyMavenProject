package com.Nov4_Dummy_SpecialClasses;

import java.util.Date;

public class Util {

	public static String emailWithDateTimeStamp() {
		//Date changes everytime you run
		Date date = new Date();
		System.out.println(date);
		
		String emailTimeStamp = date.toString().replace(" ", "_").replace(":", "_");
		System.out.println(emailTimeStamp);
		return "sofianabassi" + emailTimeStamp + "@gmail.com";
	}

}
