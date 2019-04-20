
/**
*Activity 008
*Tyler Andrews-Comp1210-06.
*10/30/17
*/
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0;
/**
   *constructs everything.
   *@param customerNameIn - the list of data.
   *@param interestRateIn - the array list containing data.
   */ 
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
/**
   *constructs everything.
   *@param amount - yes
   *@return wasLoanMade - yes
   */ 
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
   /**
   *constructs everything.
   *@return getLoansCreated - yes
   */ 
   public static int getLoansCreated() {
      return loansCreated;
   }
   /**
   *constructs everything.
   */ 
   
   public static void resetLoansCreated() {
      loansCreated = 0;
   }

/**
   *constructs everything.
   *@param amountPaid - yes.
   *@return Math.abs(newBalance).
   */ 
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   /**
   *constructs everything.
   *@return balance - yes
   */ 
   
   public double getBalance() {
      return balance;
   }
   /**
   *constructs everything.
   *@param interestRateIn - yes
   *@return true
   */ 
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   /**
   *constructs everything.
   *@return interestRate - yes
   */ 
   
   public double getInterestRate() {
      return interestRate;
   }
   /**
   *constructs everything.
   */ 
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   /**
   *constructs everything.
   *@return output - yes
   */ 
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
   /**
   *constructs everything.
   *@param amount - yes
   *@return amount - yes
   */ 
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   }
   /**
   *constructs everything.
   *@param loan - yes
   *@return true - yes
   */ 
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true; }
      return false;
   }

}
