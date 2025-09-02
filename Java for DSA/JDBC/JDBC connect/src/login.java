import java.sql.*;
import java.util.*;

public class login {
    public static void main(String[] args) 
{
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("To Login Enter ID and Password");
    int uid;
    String pswd;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter ID: ");
    uid = sc.nextInt();
    System.out.println("Enter Password: ");
    pswd = sc.next();
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/log","root","Anime@234987"); 
    String queryx = "insert into loginfo(uid, pswd) values(?, ?)";
    PreparedStatement pst = con.prepareStatement(queryx);
    pst.setInt(1, uid);
    pst.setString(2, pswd);
    
    int rowsaffect = pst.executeUpdate();
    System.out.println("Rows Affected: " + rowsaffect);
    
    con.close();
} catch(Exception e) {
    System.out.println(e);
 }
}
}
