package com.yuva.logic.practice;
import java.util.*;

public class Lab857 {
public static void main(String[] args) {
	Calendar cal=Calendar.getInstance();
	System.out.println(cal);
	Date dt=cal.getTime();
	System.out.println(dt);
	System.out.println("DaY:\t"+cal.get(Calendar.DATE));
	System.out.println("DAY:\t"+cal.get(Calendar.DAY_OF_MONTH));
	System.out.println("MON:\t"+cal.get(Calendar.MONTH));
	System.out.println("MON+1:\t"+cal.get((Calendar.MONTH)+1));
	System.out.println("YEAR:\t"+cal.get(Calendar.YEAR));
	System.out.println("Hours\t"+cal.get(Calendar.HOUR));
	System.out.println("Hours\t"+cal.get(Calendar.HOUR_OF_DAY));
	System.out.println("****ADDING 7 DAYS****");
	cal.add(Calendar.DATE, 7);
	System.out.println(cal.getTime());
	System.out.println("****SET MONTH AS MARCH****");
	cal.set(Calendar.MONTH, Calendar.MARCH);
	System.out.println(cal.getTime());
	
}
}
