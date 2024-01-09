package Java_Project;



import java.text.SimpleDateFormat;

/**
 * Patient Class Account class that extend person class and add age date of birth
 * @version 1.02
 * @since 2023-11-30
 * @author James FALLOUH +Dang Huynh Minh+Fekribaygi SeyedehFatemeh 
 * @Return firstName lastName specialty
 */
//import packages
import java.util.Date;





public class Patient  extends Person {
    // data member
    
    
    private Doctor attendingPysician;
    private Date dateAdmitted;
    private Date dateDischarged;
    private String insuranceCarrier;
    private static int PatientID=0;
   
    
    
    // default contructor
    public Patient(){
        super();
    }
    //contructor with parameter
    public Patient(String fistName,String lastName,String phoneNumber,String email,Date dateOfbirth,String placeOfBirth,String insuranceCarrier,Doctor attendingPysician,Date admissionDate,Date dischargedDate ){
        super(fistName, lastName,phoneNumber,email,dateOfbirth,placeOfBirth);
        
        Patient.PatientID+=1;
        this.attendingPysician=attendingPysician;
        this.dateAdmitted=admissionDate;
        this.dateDischarged=dischargedDate;
        this.insuranceCarrier=insuranceCarrier;
        
    }
    
    public void setInsuranceCarrier(String insuranceCarrier){
        this.insuranceCarrier=insuranceCarrier;
    }
    public String getInsuranceCarrier(){
        return insuranceCarrier;
    }
    

    
    public void setAttendingPysician (Doctor aPhysicain){
        this.attendingPysician=aPhysicain;
    }

    public void setDateDischarged(Date dischargedDate){
       this.dateDischarged=dischargedDate;
    }
        public void setDateAdmitted(Date admittedDate){
        this.dateAdmitted=admittedDate;
    }

    public int getPatientID(){
        return Patient.PatientID;
    }

    

    public Doctor getAttendingPhysician(){
        
        return this.attendingPysician;
    }

    
    public Date getDateAdmitted(){
        return dateAdmitted;
    }
        public Date getDateDischarged(){
        return dateDischarged;
    }
    

@Override 
public String toString(){
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    return " PatientID: "+getPatientID()+", "+ super.toString()+" Insurance Carrier: "+getInsuranceCarrier()+", Age: "+super.getAge()+"\n"+" Date of admission: "+dateFormat.format(dateAdmitted)+", Discharged Date: "+dateFormat.format(dateDischarged)
+ "\n--------------------------------- \n"+ " Attending Physicain information: \n"+ "--------------------------------- \n"+" Doctor ID: "+this.attendingPysician.getDoctorID()+",Last Name: "+this.attendingPysician.getLastName()+",phone number: "+attendingPysician.getPhoneNumber()+", Email: "+attendingPysician.getEmail();}


@Override
public int ageCalculation(Date dateOfBirth){
     return super.ageCalculation(dateOfBirth);
}


}
