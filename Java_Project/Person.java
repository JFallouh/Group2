package Java_Project;
// Person.java

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;




/**
 * Person Class Account class that contains a name instance variable
 * and methods to set and get its value.
 * 
 * @version 1.02
 * @since 2024-01-04
 * @author James FALLOUH+Dang Huynh Minh+Fekribaygi SeyedehFatemeh
 * @Return firstName lastName DateOfBirth
 */

public abstract class Person implements AgeCalInt,TreatInterface {
    // Data members
    private String firstName; // instance variable
    private String lastName;
    private String phoneNumber;
    private String email;
    private Date dateOfBirth;
    private String placeOfBirth;
    

    public Person() {

    }

    // Constructor with parameters
    public Person(String firstName, String lastName,String phoneNumber,String email, Date dateOfBirth, String placeOfBirth) {
        this.firstName = firstName;// Store the name
        this.lastName = lastName;
        this.phoneNumber=phoneNumber;
        this.email=email;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
    } // end the constructor parameter

    // method to set the name
    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }// end method setName
     // method getFirstname()
    public void setPhoneNumer(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getFirstName() {
        return this.firstName;
    }

    // method getLastName()
    public String getLastName() {
        return this.lastName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public String getEmail(){
        return this.email;
    }
    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    public int getAge() {
        
        return ageCalculation(dateOfBirth);
    }

    @Override

    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return String.format("First Name: %s ,Last Name: %s, Phone Number: %s%n E-mail: %s,  Date of birth: %s, Place of birth: %s%n", getFirstName(),
                getLastName(),getPhoneNumber(),getEmail(), dateFormat.format(dateOfBirth), getPlaceOfBirth());
    }

   
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