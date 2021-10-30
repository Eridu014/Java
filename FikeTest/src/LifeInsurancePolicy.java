//Created by Chad Fike on 10/05/2021.
//Object for LifeInsurancePolicy
import java.util.Date;
import java.util.Scanner;

public class LifeInsurancePolicy {
    Scanner stdin = new Scanner(System.in);
    //variables
    String policyNumber;
    InsuredPerson insured;
    double deathBenefit;
    Date issueDate;
    Date expirationDate;
    String beneficiaryName;
    //Constructor
    public LifeInsurancePolicy(String policyNumber, InsuredPerson insured, double deathBenefit, Date issueDate, Date expirationDate, String beneficiaryName) {
        this.policyNumber = policyNumber;
        this.insured = insured;
        this.deathBenefit = deathBenefit;
        this.issueDate = issueDate;
        this.expirationDate = expirationDate;
        this.beneficiaryName = beneficiaryName;
    }
    //methods for LifeInsurancePolicy class
    //setters
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber; 
    }
    public void setInsured(InsuredPerson insured) {
        this.insured = insured;
    }
    public void setDeathBenefit(double deathBenefit) {
        this.deathBenefit = deathBenefit;
    }
    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
        //issueDate = stdin.next();
    }
    public void setExpirationDate(Date expirationDate) {
        //expirationDate = stdin.next();
    }
    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
        //beneficiaryName = stdin.next();
    }
    //getters
    public String getPolicyNumber() {
        return this.policyNumber;
    }
    public InsuredPerson getPolicyName() {
        return this.insured;
    }
    public double getDeathBenefit() {
        return this.deathBenefit;
    }
    public Date getIssueDate() {
        return this.issueDate;
    }
    public Date getExpirationDate() {
        return this.expirationDate;
    }
    public String getBeneficiaryName() {
        return this.beneficiaryName;
    }
    //toString : creates a textual respresentation of an object
    @Override
    public String toString() {
        return super.toString();
    }
}