package oops.inherit;

public class CheckingAccount extends Account{
	public  double transCharge = 0.0005; 
    public  double withdrawableAmount = 50000;

    public boolean withdraw(double amount) {
        double totalAmount = amount;
        if (amount > withdrawableAmount) {
            totalAmount += (amount - withdrawableAmount) * transCharge;
        }
          if (balance >= totalAmount) {
            balance = balance-totalAmount;
            return true;
        } else {
            return false;
        }
}

}
 