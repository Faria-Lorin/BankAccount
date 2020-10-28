public class BankAccount{
  private double balance;
  private int accountID;
  private String password;

  public BankAccount (int a, String p){
    accountID = a;
    password = p;
    balance = 0;
  }

  public double getBalance(){
    return (balance);
  }

  public int getAccountID(){
    return (accountID);
  }

  public boolean deposit(double amount){
    boolean success = true;
    if (amount >= 0){
      balance += amount;
    }
    else {
      success = false;
  }
  return success;
  }

  public boolean withdraw(double amount){
    boolean success = true;
    if (amount < 0){
      success = false;
    }
    else if (balance < amount){
      success = false;
    }
    else {
      balance = balance - amount;
    }
    return success;
  }
}
