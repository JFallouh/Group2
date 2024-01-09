package Java_Project;
// CalculaionOfAge.java
/**
 * A class to create calculate Age
 * @version 1.02
 * @since 2024-01-06
 * @author James FALLOUH+ Dang Huynh Minh+Fekribaygi SeyedehFatemeh
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
//import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public  class CalculationOfAge implements AgeCalInt{
      
    @Override
    public   int ageCalculation(Date dateOfBirth) {
      
        int thisYear, thisMonth, thisDay;
        GregorianCalendar today = new GregorianCalendar();
        thisYear = today.get(Calendar.YEAR);
        thisMonth = today.get(Calendar.MONTH) + 1; // Months are zero based
        thisDay = today.get(Calendar.DAY_OF_MONTH);

        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
        SimpleDateFormat dayFormat = new SimpleDateFormat("dd");
        int birthYear = Integer.parseInt(yearFormat.format(dateOfBirth));
        int birthMonth = Integer.parseInt(monthFormat.format(dateOfBirth));
        int birthDay = Integer.parseInt(dayFormat.format(dateOfBirth));
       
        
        if (birthMonth > thisMonth) {
            return thisYear - birthYear - 1;
        } else if (birthMonth == thisMonth) {
            if (birthDay > thisDay) {
                return thisYear - birthYear - 1;
            } /* end of nested if */ else/* nested else */ {
                return thisYear - birthYear;
            } // end of nested else

        } // end of else if
        else {
            return thisYear - birthYear;
        }
}
    

    


}
