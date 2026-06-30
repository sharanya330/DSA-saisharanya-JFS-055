package j8;

import java.time.*;

public class DateAndTime {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        LocalDate d=LocalDate.now();
        System.out.println(d);
        d.getDayOfMonth();
        d.getDayOfWeek();
        d.getDayOfYear();
        
        
        LocalTime l=LocalTime.now();
        System.out.println(l);
        l.getHour();
        l.getMinute();
        l.getSecond();
        
        
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);                                                                                                                                                                                                                                                                                                                                                                                                   
        
        LocalDateTime ldt=LocalDateTime.of(1999,11,11,11,11);
        System.out.println(ldt);
        
	}

}
