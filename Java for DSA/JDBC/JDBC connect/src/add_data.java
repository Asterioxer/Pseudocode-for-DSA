import java.sql.*;
import javax.swing.JOptionPane;
public class add_data {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studs", "root", "Anime@234987");
            int sd1 = "123";
            
            String query = "Insert into studentinfo(sd1, name, mark) values(?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, sd1);
            pst.setString(2, name);
            pst.setInt(3, mark);
            int j = pst.executeUpdate();
            // Statement stmt = con.createStatement();
            // stmt.executeUpdate("insert into studentinfo values(1,'Raj',23)");
            // stmt.executeUpdate("insert into studentinfo values(2,'Rahul',22)");
            // stmt.executeUpdate("insert into studentinfo values(3,'Rohan',24)");
            // stmt.executeUpdate("insert into studentinfo values(4,'Ramesh',25)");
            // stmt.executeUpdate("insert into studentinfo values(5,'Rajesh',26)");
            // stmt.executeUpdate("insert into studentinfo values(6,'Subhash',98)");
            // stmt.executeUpdate("insert into studentinfo values(7,'Santosh',68)");
            // stmt.executeUpdate("insert into studentinfo values(8,'Sravan',56)");
            // stmt.executeUpdate("insert into studentinfo values(9,'Brajesh',79)");
            // stmt.executeUpdate("insert into studentinfo values(10,'Prakash',90)");
            // stmt.executeUpdate("insert into studentinfo values(11,'Manas',92)");
            // stmt.executeUpdate("insert into studentinfo values(12,'Amlan',28)");
            // stmt.executeUpdate("insert into studentinfo values(13,'Sovan',65)");
            // stmt.executeUpdate("insert into studentinfo values(14,'Vijay',94)");
            // stmt.executeUpdate("insert into studentinfo values(15,'Soyam',52)");
            // stmt.executeUpdate("insert into studentinfo values(16,'Harsh',93)");
            // stmt.executeUpdate("insert into studentinfo values(17,'Jyoti',32)");
            // stmt.executeUpdate("insert into studentinfo values(18,'Sneha',40)");
            // stmt.executeUpdate("insert into studentinfo values(19,'Kavya',99)");
            // stmt.executeUpdate("insert into studentinfo values(20,'Puja',67)");
            // stmt.executeUpdate("insert into studentinfo values(21,'Utkarsh',59)");
            // stmt.executeUpdate("insert into studentinfo values(22,'Rishi',49)");
            // stmt.executeUpdate("insert into studentinfo values(23,'Rounak',19)");
            // stmt.executeUpdate("insert into studentinfo values(24,'Soham',100)");
            // stmt.executeUpdate("insert into studentinfo values(25,'Gaurav',98)");
            // stmt.executeUpdate("insert into studentinfo values(26,'Rupa',28)");
            // stmt.executeUpdate("insert into studentinfo values(27,'Iranna',72)");
            // stmt.executeUpdate("insert into studentinfo values(28,'Pratyush',28)");
            // stmt.executeUpdate("insert into studentinfo values(29,'Pratik',89)");
            // stmt.executeUpdate("insert into studentinfo values(30,'Jeevan',29)");
            // stmt.executeUpdate("insert into studentinfo values(31,'Basak',37)");
            // stmt.executeUpdate("insert into studentinfo values(32,'Rohan',59)");
            // stmt.executeUpdate("insert into studentinfo values(33,'Swastik',30)");
            // stmt.executeUpdate("insert into studentinfo values(34,'Swagnik',97)");
            // stmt.executeUpdate("insert into studentinfo values(35,'Rohit',39)");
            // stmt.executeUpdate("delete from studentinfo where sd1 = 122");
            // stmt.executeUpdate("delete from studentinfo where sd1 = 5");
            JOptionPane.showMessageDialog(null, "Inserted successfully");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}