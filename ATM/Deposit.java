import java.util.Scanner;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter; 

public class Deposit {
   public static void deposit() {

        System.out.print("Enter amount to deposit: ");
        Scanner sc=new Scanner(System.in);
        double amount = sc.nextDouble();
        if(amount<0)
        System.out.println("Invalid deposit amount.");
        else
        {
         Main.setBalance(Main.getBalance() + amount);
        System.out.println("Deposit successful. New balance:Rs " + Main.getBalance());
        TransactionHistory.addTransaction("Deposit of " +amount+ " on " +java.time.LocalDate.now()+ " with updated balance " +Main.getBalance());
        }
    }
}