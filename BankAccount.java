public class BankAccount{

  private double balance;
  private int accountID;
  private String password;

  private boolean authenticate(String password){
    return this.password.equals(password);
  }

  public boolean transferTo(BankAccount other, double amount, String password){
    if (authenticate(password) && withdraw(amount)){
    if (other.deposit(amount)){
      System.out.println("Transfer Successful!");
      return true;
      }
    }
    System.out.println("Transfer Failed!");
    return false;
  }

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

  public String getPassword(){
    return (password);
  }

  public void setPassword(String newPass){
    password = newPass;
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

  public String toString(){
    return (accountID + "\t" + balance);
  }
}
