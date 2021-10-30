//Created by Chad Fike on 10/05/2021.
//Object for InsuredPerson
import java.util.*;


public class InsuredPerson {
      //variables
      String insuredID;
      String insuredName;
      Date insuredDOB;
      String insuredAddress;
      String insuredEmail;

    //Constructor

    public InsuredPerson(String insuredID, String insuredName, Date insuredDOB, String insuredAddress, String insuredEmail) {
        this.insuredID = insuredID;
        this.insuredName = insuredName;
        this.insuredDOB = insuredDOB;
        this.insuredAddress = insuredAddress;
        this.insuredEmail = insuredEmail;
    }
    
    //methods for InsuredPerson class
    //setters
    public void setInsuredID(String insuredID) {
        this.insuredID = insuredID; 
    }
    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }
    public void setInsuredDOB(Date insuredDOB) {
        this.insuredDOB = insuredDOB; 
    }
    public void setInsuredAddress(String insuredAddress) {
        this.insuredAddress = insuredAddress;
    }
    public void setInsuredEmail(String insuredEmail) {
        this.insuredEmail = insuredEmail;
    }

    //getters
    public String getInsuredID() {
        return insuredID;
    }
    public String getInsuredName() {
        return insuredName;
    }
    public Date getInsuredDOB() {
        return insuredDOB;
    }
    public String getInsuredAddress() {
        return insuredAddress;
    }
    public String getInsuredEmail() {
        return insuredEmail;
    }
    //toString : creates a textual respresentation of an object
      @Override
    public String toString() {
        return super.toString();
    }
}