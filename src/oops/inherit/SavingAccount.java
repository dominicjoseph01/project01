package oops.inherit;

public class SavingAccount extends Account {
	  public void calculateInterest() {
	        double interest = balance * 0.07;
	        balance = balance+interest;
	    }
}

