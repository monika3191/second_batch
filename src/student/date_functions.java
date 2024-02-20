package student;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;


public class date_functions {
	void DisplayCurrentDate() {
		LocalDate currentDate=LocalDate.now();
		System.out.println("CurrentDate:"+currentDate);
		LocalDate pastDate=currentDate.minusDays(1);
	    System.out.println("PastDate:"+pastDate);
	    LocalDate futureDate=currentDate.plusDays(1);
	    System.out.println("pastDate:"+futureDate);
	    LocalDate givenDate=LocalDate.of(2021, 01,1 );
	    System.out.println("GivenDate:"+givenDate);
	    LocalDateTime dateWithTime=LocalDateTime.now();
	    System.out.println("sfsd Date:"+dateWithTime);
	    
	    
	    }
	

	public static void main(String[] args) {
		date_functions df=new date_functions();
		df.DisplayCurrentDate();
		
		// TODO Auto-generated method stub

	}

}
