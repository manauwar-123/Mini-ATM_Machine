import java.util.ArrayList;
import java.util.List;

public class TransactionHistory {
  private static List<String> transactions = new ArrayList<>();

  public static void addTransaction(String transaction) {
    transactions.add(transaction);
  }

  public static List<String> getTransactions() {
    return transactions;
  }
}
