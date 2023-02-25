import java.util.Scanner;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter; 

public class Transfer {
  public static void transfer() {
        System.out.print("Enter recipient user ID: ");
        Scanner sc=new Scanner(System.in);
        double recipientId =sc.nextDouble();
        System.out.print("Enter amount to transfer: ");
        double amount = sc.nextDouble();
        if (amount <= Main.getBalance()) {
            Main.setBalance(Main.getBalance() - amount);
            System.out.println("Transfer successful. New balance: Rs" + Main.getBalance());
            TransactionHistory.addTransaction("Transfer of " +amount+ " on " +java.time.LocalDate.now()+ " with updated balance " +Main.getBalance());
        } else {
            System.out.println("Insufficient balance");
        }
 }
}
