package oops.inherit;

public   class Account {
	double balance=0.0;
	  
   public double getBalance()
   {
	   return balance;
   }
    public void deposit(double amount) {
        balance =balance+amount;
    }
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance =balance-amount;
            return true;
        }
        return false;
    }

 }

