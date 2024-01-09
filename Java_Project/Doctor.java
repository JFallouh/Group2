package Java_Project;
// Doctor.java



/**
 * Doctor Class Account class that extend person class and add doctor specialty to it 
 * @version 1.02
 * @since 2024-01-04
 * @author James FALLOUH +Dang Huynh Minh+Fekribaygi SeyedehFatemeh
 * @Return firstName lastName specialty
 */

import java.util.Date;

//import javax.print.Doc;


public abstract class Doctor extends Person {
//public abstract class Doctor extends Person{
    //data member
    private String medicalSchoolSpecialty;
    private static int DoctorID=0;
    
    //Default constructor
    public Doctor() {
        //calling the constructor from the super class
        super();
        
    }
    //setting constructor with parameters
    public Doctor(String firstName, String lastName,String phoneNumber,String email,Date dateOfBirth,String placeOfBirth,String medicalSchoolSpeciality){
        super(firstName, lastName, phoneNumber,email,dateOfBirth,placeOfBirth);
        this.medicalSchoolSpecialty=medicalSchoolSpeciality;
        DoctorID+=1;

    }
    // method to set the specialty
    public void setSpecialty(String medicalSchoolSpecialty){
        this.medicalSchoolSpecialty=medicalSchoolSpecialty;
    }
    public String getSpecialty(){
        return medicalSchoolSpecialty;
    }
    public int getDoctorID(){
        return DoctorID;
    }

    
    @Override 
public String toString(){
    return " Doctor ID: "+getDoctorID()+", "+super.toString()+ " Speciality: "+getSpecialty();
}
@Override
public int ageCalculation(Date dateOfBirth){
     return super.ageCalculation(dateOfBirth);
}
 
}
