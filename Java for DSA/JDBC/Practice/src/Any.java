import java.sql.*;
public class Any {
  public static void main(String[] args) {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","Anime@234987");
        Statement st = cn.createStatement();
        String query = "Select * from Students";
        ResultSet rst = st.executeQuery(query);
        // String quer2 = ;
        // st.executeUpdate("insert into Students values(123, 'Daksh', 'Mech'),(231, 'Yash', 'EEE'),(89, 'Ram', 'Civil')");
        while(rst.next()) {
            int roll = rst.getInt(1);
            String name = rst.getString(2);
            String course = rst.getString(3);
            System.out.println(roll + " " +name+ " " +course);
        }
    } catch (Exception e) {
        System.out.println(e);
    }
  }  
}