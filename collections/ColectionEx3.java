package org.collection.app;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class ColectionEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate cal = LocalDate.of(2000, 12, 23);

           
        List<LocalDate> calendarList = new LinkedList<>();
        calendarList.add(cal);
        
        for (LocalDate c : calendarList)
        {
            String formattedDate = c.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            if (c.isLeapYear())
            {
                System.out.println("Your Date is "+formattedDate + " is a leap year");

            } else 
            {
                System.out.println(("Your Date is "+formattedDate + " is not a leap year");
            }
        }
}
}



	}

}
