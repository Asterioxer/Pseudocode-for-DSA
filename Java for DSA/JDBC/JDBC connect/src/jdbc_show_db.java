import java.sql.*;
public class jdbc_show_db
{
public static void main(String[] args) 
{
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studs","root","Anime@234987");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("select * from studentinfo");
while(rs.next())
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
con.close();
}
catch(Exception e) {
System.out.println(e);
 }
}
}
