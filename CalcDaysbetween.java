package org;
import java.time.*;

public class CalcDaysbetween {

	 static void findDifference(LocalDate start_date, LocalDate end_date) 
	    { 
	  
	        Period diff = Period .between(start_date, end_date); 
	        System.out.print( "Difference between two dates is: "); 
	        System.out.printf( "%d years, %d months and %d days ", diff.getYears(), diff.getMonths(), diff.getDays()); 
	    } 
	    
	    public static void main(String[] args) 
	    {  
	        LocalDate start_date = LocalDate.of(2012, 12, 06); 
	        LocalDate now  = LocalDate.now(); 
	        findDifference(start_date, now); 
	    } 
	}