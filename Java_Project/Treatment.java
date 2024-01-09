package Java_Project;
import java.text.SimpleDateFormat;
// Treatment.java
/**
 * A class to create treatment objects
 * @version 1.02
 * @since 2024-01-06
 * @author James FALLOUH+ Dang Huynh Minh+Fekribaygi SeyedehFatemeh
 */
import java.util.Date;
public class Treatment implements TreatInterface{
//data members
private Date treatmentDate;
private Date startTime;
private Date endTime;
private Doctor doctor;
private Patient patient;
                    
public Treatment(Date treatmentDate,Date startTime,Date endTime, Doctor doctor,Patient patient ){
    this.treatmentDate=treatmentDate;
    this.startTime=startTime;
    this.endTime=endTime;
    this.doctor=doctor;
    this.patient=patient;
}
public void setTreatmentDate(Date treatmentDate){
    this.treatmentDate=treatmentDate;
}
public void setStartTime(Date startTime){
    this.startTime=startTime;
}
public void setEndTime(Date endTime){
    this.endTime=endTime;
}
public void setTreatmentDoctor(Doctor doctor){
    this.doctor=doctor;
}
public void setTreatmentpatient(Patient patient){
    this.patient=patient;
}
    public Date getStartTime(){
        return startTime;
    }
    public Date getEndTime(){
        return endTime;
    }
    public Doctor getDoctor(){
        return doctor;
    }
    public Patient getPatient(){
        return patient;
    }
    public Date getTreatmentDate(){
        return treatmentDate;
    }

    @Override
    public String toString(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        return "Treatment Date: "+dateFormat.format(treatmentDate)+" "+"Start time: "+timeFormat.format(startTime)+" "+"End time: "+timeFormat.format(endTime)+"\n------------------------------------------------------------"+"\nPatient details: "+"\n----------------\n"+getPatient()+"\n------------------------------------------------------------"+"\nDoctor details: "+"\n---------------\n"+getDoctor();
    }
}
