import java.sql.*;
import javax.swing.JOptionPane;
public class JdbcDemo2 {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306";

            String databaseName = "d_b";
            String username = "root";
            String password = "Anime@234987";

            Connection con = DriverManager.getConnection(url, username, password);

            String sql = "CREATE DATABASE " + databaseName;

            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
            JOptionPane.showMessageDialog(null, "Database created successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}