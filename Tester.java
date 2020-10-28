public class Tester{
  public static void main(String[] args){
    BankAccount nimh = new BankAccount(172674837, "anemone");

    //just looking at overall change in money/properties of an account
    System.out.println("Starting Balance:");
    System.out.println(nimh.getBalance());
    System.out.println("\nAccountID:");
    System.out.println(nimh.getAccountID());
    System.out.println("\nOriginal Password:");
    System.out.println(nimh.getPassword());
    nimh.setPassword("snailFairy");
    System.out.println("\nNew Password:");
    System.out.println(nimh.getPassword());
    nimh.deposit(100000.59);
    System.out.println("\nACCOUNT:        CURRENT BALANCE:");
    System.out.println(nimh.toString());
    nimh.withdraw(7657.98);
    System.out.println("\nACCOUNT:        CURRENT BALANCE:");
    System.out.println(nimh.toString());

    /* test differnt true/false values of deposit
    System.out.println("\n"+nimh.deposit(-100));
    System.out.println("ACCOUNT:        CURRENT BALANCE:");
    System.out.println(nimh.toString());
    System.out.println("\n"+nimh.deposit(0));
    System.out.println("ACCOUNT:        CURRENT BALANCE:");
    System.out.println(nimh.toString());
    System.out.println("\n"+nimh.deposit(106));
    System.out.println("ACCOUNT:        CURRENT BALANCE:");
    System.out.println(nimh.toString());
    System.out.println("\n"+nimh.deposit(72.817));
    System.out.println("ACCOUNT:        CURRENT BALANCE:");
    System.out.println(nimh.toString());
    */

    /* test differnt true/false values of withdraw
    System.out.println("\n"+nimh.withdraw(-17));
    System.out.println("ACCOUNT:        CURRENT BALANCE:");
    System.out.println(nimh.toString());
    System.out.println("\n"+nimh.withdraw(0));
    System.out.println("ACCOUNT:        CURRENT BALANCE:");
    System.out.println(nimh.toString());
    System.out.println("\n"+nimh.withdraw(23));
    System.out.println("ACCOUNT:        CURRENT BALANCE:");
    System.out.println(nimh.toString());
    System.out.println("\n"+nimh.withdraw(57.89));
    System.out.println("ACCOUNT:        CURRENT BALANCE:");
    System.out.println(nimh.toString());
    */

  }
}
