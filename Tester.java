public class Tester{
  public static void main(String[] args){
    BankAccount Joe = new BankAccount(172674837, "anemone");
    System.out.println("Starting Balance:");
    System.out.println(Joe.getBalance());
    System.out.println("\nAccountID:");
    System.out.println(Joe.getAccountID());
    System.out.println("\nOriginal Password:");
    System.out.println(Joe.getPassword());
    Joe.setPassword("snailFairy");
    System.out.println("\nNew Password:");
    System.out.println(Joe.getPassword());
    Joe.deposit(100000.59);
    System.out.println("\nACCOUNT/BALANCE");
    System.out.println(Joe.toString());
    Joe.withdraw(7657.98);
    System.out.println("\nACCOUNT/BALANCE");
    System.out.println(Joe.toString());
  }
}
