package Java_Project;
// Specialist.java
/**
 * A class to create Specialist objects
 * @version 1.02
 * @since 2024-01-06
 * @author James FALLOUH+ Dang Huynh Minh+Fekribaygi SeyedehFatemeh
 */
import java.util.Date;

public class Specialist extends Doctor {
    public Specialist(String firstName, String lastName,String phoneNumber,String email,Date dateOfBirth,String placeOfBirth,String medicalSchoolSpeciality){
        super(firstName,lastName,phoneNumber,email,dateOfBirth,placeOfBirth,medicalSchoolSpeciality);
    }
    @Override
    public String toString(){
      return  String.format("%s %s",super.toString(),"Specialist Doctor");
    }
    @Override
public int ageCalculation(Date dateOfBirth){
     return super.ageCalculation(dateOfBirth);
}
}
