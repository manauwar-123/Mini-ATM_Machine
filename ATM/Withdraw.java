import java.util.Scanner;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter; 

public class Withdraw {
  public static final double MINIMUM_BALANCE = 50.0;

  public static void withdraw() {
    System.out.print("Enter withdrawal amount:");
         Scanner sc=new Scanner(System.in);
        double amount = sc.nextDouble();
    if (amount <= 0) {
      System.out.println("Invalid withdrawal amount.");
    } else if (Main.getBalance() - amount < MINIMUM_BALANCE) {
      System.out.println("Insufficient balance.");
    } else {
      Main.setBalance(Main.getBalance() - amount);
      System.out.println("Withdrawal successful. New balance: Rs" + Main.getBalance());
       // Add the transaction to the history
       TransactionHistory.addTransaction("Withdrawal of " +amount+ " on " +java.time.LocalDate.now()+ " with updated balance " +Main.getBalance());

    }
  }
}

