/*
  This program calulcates the monthly payment
  of a car loan given a certain amount of 
  variables
  */
  public class CarLoan {
	public static void main(String[] args) {
    int carLoan = 5000;
    int loanLength = 3;
    int downPayment =  2000;
    int interestRate = 5;

    if (interestRate <= 0 || loanLength <= 0) {
      System.out.println("Error! You must take out a valid car loan");
    } else if (downPayment > carLoan) {
      System.out.println("The car can be paid in full");
    } else {
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months;
       int interest = (monthlyBalance * interestRate) / 100;
      int monthlyPayment = monthlyBalance + interest;
      System.out.print(monthlyPayment);
    }
	}
}