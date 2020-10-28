public class BankAccount{
  private double balance;
  private int accountID;
  private String password;

  public BankAccount (int a, String p){
    accountID = a;
    password = p;
    balance = 0;
  }

  public String toString(){
    return ("Balance:" + balance + "\n" + "AccountID:" + accountID);
  }
}
