import java.util.Scanner; 

public class Main {
  public static Scanner input = new Scanner(System.in);
  private static int userId;
  private static int pin;
   public static double balance = 10000.0;

  public static void main(String[] args) {
    System.out.print("Enter user ID: ");
    userId = input.nextInt();
    System.out.print("Enter PIN: ");
    pin = input.nextInt();

    // Authenticate the user
    if (!authenticate(userId, pin)) {
      System.out.println("Invalid user ID or PIN. Exiting...");
      return;
    }

    // Show the main menu
    showMainMenu();
  }

  private static boolean authenticate(int userId, int pin) {
    return userId == 12345 && pin == 1234;
  }

  private static void showMainMenu() {
    System.out.println("Access granted");
    int choice;
    do {
      System.out.println("Main Menu:");
      System.out.println("1. Transactions History");
      System.out.println("2. Withdraw");
      System.out.println("3. Deposit");
      System.out.println("4. Transfer");
      System.out.println("5. Quit");
      System.out.print("Enter your choice: ");
      choice = input.nextInt();

      switch (choice) {
        case 1:
          showTransactionsHistory();
          break;
        case 2:
          withdraw();
          break;
        case 3:
          deposit();
          break;
        case 4:
          transfer();
          break;
        case 5:
          System.out.println("Exiting...");
          break;
        default:
          System.out.println("Invalid choice. Try again.");
      }
    } while (choice != 5);
  }

   private static void showTransactionsHistory() {
  System.out.println("Transaction History:");
  for (String transaction : TransactionHistory.getTransactions()) {
    System.out.println(transaction);
  }
}

  private static void withdraw() {
   Withdraw withdraw = new Withdraw();  
  Withdraw.withdraw();
}


  private static void deposit() {
    Deposit deposit = new Deposit();
   deposit.deposit();
  }

  private static void transfer() {
    Transfer transfer = new Transfer();
        transfer.transfer();
  }

   public static double getBalance() {
    return balance;
  }

  public static void setBalance(double balance) {
    Main.balance = balance;
  }
}
