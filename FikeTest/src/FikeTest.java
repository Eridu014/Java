//Created by Chad Fike on 10/05/2021.
//Object for LifeInsurancePolicy
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FikeTest {
    public static void main(String[] args) {
        //init Date values to null for later use
        Date insuredDOB = null, issueDate = null, expirationDate = null;
        String policyNumber, insuredId, insuredName, insuredAddress, insuredEmail, beneficiary_name;
        double deathBenefit;
        try ( //create scanner for user input
                Scanner stdin = new Scanner(System.in)) {
            //set Date values to null for later use
            System.out.println("Please Enter Your Policy Number");
            policyNumber = stdin.nextLine();
            System.out.println("Please Enter the Insured Person's ID");
            insuredId = stdin.nextLine();
            System.out.println("Please Enter The Insured Person's Name");
            insuredName = stdin.nextLine();
            System.out.println("Please Enter Date of Birth of " + insuredName+" in dd/mm/yyyy format");
            String insuredDOBPe = stdin.nextLine();
            //parse exception to allow input of Date type. Invalid if format is not entered correctly
            try {
                insuredDOB = new SimpleDateFormat("dd/MM/yyyy").parse(insuredDOBPe);
            } catch (ParseException pe) {
                System.out.println("Incorrect Date Format");
                
            }
            System.out.println("Please Enter Insured Person's Address");
            insuredAddress = stdin.nextLine();
            System.out.println("Please Enter the Insured Person's Email Address");
            insuredEmail = stdin.nextLine();
            System.out.println("Please Enter the Death Benefit Amount");
            deathBenefit = stdin.nextDouble();
            stdin.nextLine();
            System.out.println("Please Enter issueDate in dd/MM/yyyy Format");
            String issueDatePe = stdin.nextLine();
            //parse exception to allow input of Date type. Catch if wrong input is submitted.
            try {
                issueDate = new SimpleDateFormat("dd/MM/yyyy").parse(issueDatePe);
            } catch (ParseException pe) {
                System.out.println("Incorrect Date Format");
                stdin.close();
                return;
            }
            System.out.println("Please Enter the Expiration Date in dd/mm/yyyy Format");
            String expirationDatePe = stdin.nextLine();
            //parse exception to allow input of Date type. Invalid if format is not entered correctly
            try {
                expirationDate = new SimpleDateFormat("dd/MM/yyyy").parse(expirationDatePe);
            } catch (ParseException pe) {
                System.out.println("Incorrect Date Format");
                stdin.close();
                return;
            }
            System.out.println("Please Enter Beneficiary Name");
            beneficiary_name = stdin.nextLine();
        }
        //create objects
        //object names cannot be created dynamically at run time - left as 'LastName'
        InsuredPerson LastNameInsured = new InsuredPerson(insuredId, insuredName, insuredDOB, insuredAddress, insuredEmail);
        LifeInsurancePolicy LastNamePolicy = new LifeInsurancePolicy(policyNumber, LastNameInsured, deathBenefit, issueDate, expirationDate, beneficiary_name);
        //ouput to console
        System.out.println("Policy Number:" + LastNamePolicy.policyNumber.toString());
        System.out.println("Issuance Date:" + LastNamePolicy.issueDate.toString());
        System.out.println("Expiration Date:" + LastNamePolicy.expirationDate.toString());
        //toString() cannot be invoked on double so convert to String via String.valueOf()
        System.out.println("Death Benefit:$" + String.valueOf(LastNamePolicy.deathBenefit) + 0);
        System.out.println("Insured ID:" + LastNamePolicy.insured.insuredID.toString());
        System.out.println("Beneficiary:" + LastNamePolicy.beneficiaryName.toString());
        System.out.println("Insured Name:" + LastNamePolicy.insured.insuredName.toString());
        System.out.println("Insured DOB:" + LastNamePolicy.insured.insuredDOB.toString());
        System.out.println("Insured Address:" + LastNamePolicy.insured.insuredAddress.toString());
        System.out.println("Insured Email:" + LastNamePolicy.insured.insuredEmail.toString());
    }
}

