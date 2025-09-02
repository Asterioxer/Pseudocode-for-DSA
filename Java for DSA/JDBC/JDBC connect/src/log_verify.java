import java.sql.*;
import java.util.*;
public class log_verify {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("TO login enter id and password:");
            int uid;
            String pswd;
            System.out.println("Enter id:");
            uid=sc.nextInt();
            System.out.println("Enter password:");
            pswd=sc.next();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/log", "root", "Anime@234987");
            String query3="select * from loginfo where uid=? and pswd=?";
            PreparedStatement pstmt3 = con.prepareStatement(query3);
            pstmt3.setInt(1, uid);
            pstmt3.setString(2, pswd);
            ResultSet rs = pstmt3.executeQuery();
            if(rs.next()){
                System.out.println("You are a registered user.\n");
            }
            else{
                System.out.println("Invalid login credentials !\n" );
            }
            con.close();
            
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
