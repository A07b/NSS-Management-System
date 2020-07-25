import java.sql.*;
import java.util.*;

public class TeachersTable 
{
    
    

    public static void main(String[] args) 
    {
        int t_no,t_sal;
        String name,desig;
        Scanner sc = new Scanner(System.in);
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Practical", "root", "password");
            Statement st = con.createStatement();
            System.out.println("Creating Table In Database.....");
            st.executeUpdate("Create table Teachers(T_No int primary key, T_Name varchar(25), T_Desig varchar(20),Sal numeric(10));");
            System.out.println("Successfully Created Table In Database.....");
            System.out.println("Enter Number Of Teacher-:");
            t_no = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Name Of Teacher-:");
            name = sc.nextLine();
            System.out.println("Enter Designation Of Teacher-:");
            desig = sc.nextLine();
            System.out.println("Enter Salary Of Teacher-:");
            t_sal = sc.nextInt();
            
            PreparedStatement ps = con.prepareStatement("insert into Teachers values(?,?,?,?)");
            ps.setInt(1, t_no);
            ps.setString(2, name);
            ps.setString(3, desig);
            ps.setInt(4, t_sal);
            ps.executeUpdate();
            System.out.println("Successfully Inserted Into Table...");
            con.close();
        } 
        catch (Exception ex) 
        {
            System.out.println("Cannot Connect To Database-"+ex);
        }

    }
    
}
