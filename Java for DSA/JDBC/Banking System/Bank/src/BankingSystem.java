
import java.sql.*;
import java.util.*;

public class BankingSystem {

    private static final String url = "jdbc:mysql://localhost:3306/Bank";
    private static final String user = "root";
    private static final String pswd = "Anime@234987";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(url, user, pswd); Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.println("\nBanking System Menu");
                System.out.println("1. Create an Account");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Check Account Balance");
                System.out.println("5. Transfer Money");
                System.out.println("6. Transaction History");
                System.out.println("7. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        createAccount(conn, scanner);
                        break;
                    case 2:
                        System.out.print("Enter account number: ");
                        int accNo = scanner.nextInt();
                        System.out.print("Enter amount to withdraw: ");
                        double amount = scanner.nextDouble();
                        withdrawMoney(conn, accNo, amount);
                        break;
                    
                    case 3:
                        accNo = scanner.nextInt();
                        amount = scanner.nextDouble();
                        depositMoney(conn, accNo, amount);
                        break;
                    case 4:
                        checkBalance(conn, scanner);
                        break;

                    case 5:
                        transferMoney(conn, scanner);
                        break;
                    case 6:
                        viewTransactions(conn, scanner);
                        break;
                    case 7:
                        System.out.println("Thank you for using the banking system!");
                        return;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createAccount(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter your name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Enter initial deposit amount: ");
        double balance = scanner.nextDouble();

        System.out.println("Generating account number...");
        int accountNumber = (int) (Math.random() * 1000000);

        String query = "INSERT INTO accounts (account_no,name, balance) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, accountNumber);
            stmt.setString(2, name);
            stmt.setDouble(3, balance);
            stmt.executeUpdate();
            System.out.println("Account created successfully!");
        }
    }

    private static void depositMoney(Connection conn, int accNo, double amount) throws
            SQLException {
        String updateQuery = "UPDATE accounts SET balance = balance + ? WHERE account_no = ?";
        try (PreparedStatement stmt = conn.prepareStatement(updateQuery)) {
            stmt.setDouble(1, amount);
            stmt.setInt(2, accNo);
            stmt.executeUpdate();
            logTransaction(conn, accNo, "DEPOSIT", amount);
            System.out.println("Deposit successful!");
        }
    }

    private static void withdrawMoney(Connection conn, int accNo, double amount) throws
            SQLException {
        String checkBalanceQuery = "SELECT balance FROM accounts WHERE account_no = ?";
        try (PreparedStatement checkStmt = conn.prepareStatement(checkBalanceQuery)) {
            checkStmt.setInt(1, accNo);
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next() && rs.getDouble("balance") >= amount) {
                String updateQuery = "UPDATE accounts SET balance = balance - ? WHERE account_no = ?";
                try (PreparedStatement stmt = conn.prepareStatement(updateQuery)) {
                    stmt.setDouble(1, amount);
                    stmt.setInt(2, accNo);
                    stmt.executeUpdate();
                    logTransaction(conn, accNo, "WITHDRAW", amount);
                }
            } else {
                throw new SQLException("Insufficient balance!");
            }
        }
    }

    private static void checkBalance(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter account number: ");
        int accNo = scanner.nextInt();

        String query = "SELECT balance FROM accounts WHERE account_no = ?";

        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, accNo);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                System.out.println("Current Balance: " + rs.getDouble("balance"));
            } else {
                System.out.println("Account not found!");
            }
        }
    }

    private static void transferMoney(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter sender account number: ");
        int sender = scanner.nextInt();
        System.out.print("Enter receiver account number: ");
        int receiver = scanner.nextInt();
        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();
    
        conn.setAutoCommit(false);
        try {
            withdrawMoney(conn, sender, amount);
            depositMoney(conn, receiver, amount);
            logTransaction(conn, sender, "TRANSFER", amount);
            conn.commit();
            System.out.println("Transfer successful!");
        } catch (SQLException e) {
            conn.rollback();
            System.out.println("Transfer failed!");
        } finally {
            conn.setAutoCommit(true);
        }
    }

    private static void viewTransactions(Connection conn, Scanner scanner) throws
            SQLException {
        System.out.print("Enter account number: ");
        int accNo = scanner.nextInt();

        String query = "SELECT * FROM transactions WHERE account_no = ? ORDER BY timestamp DESC";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, accNo);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("transaction_id") + " | " + rs.getString("type") + " | "
                        + rs.getDouble("amount") + " | " + rs.getTimestamp("timestamp"));
            }
        }
    }

    private static void logTransaction(Connection conn, int accNo, String type, double amount) throws SQLException {
        String query = "INSERT INTO transactions (account_no, type, amount) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, accNo);
            stmt.setString(2, type);
            stmt.setDouble(3, amount);
            stmt.executeUpdate();
        }
    }
}
