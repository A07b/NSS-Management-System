import java.sql.*;
public class Slip3_1
{
            public static void main(String args[]){
                         
                        try{
                                    Class.forName("com.mysql.jdbc.Driver");
                                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Practical", "root", "password");                    
                                    if(con==null)
                                    {
                                                System.out.println("Connection Failed....");
                                                System.exit(1);
                                    }


                                    Statement stmt=con.createStatement();
                                    ResultSet rs=stmt.executeQuery("select * from Employee where dept = 'Computer Science';");
                                    System.out.println("eno\t"+"ename\t\t"+"department\t"+"sal");
                                    while(rs.next())
                                    {
                                                System.out.println("\n"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
                                    }
                                    con.close();
                                    rs.close();
                                    stmt.close();     
                        }          

                        catch(Exception e)
                        {
                                    System.out.println(e);
                        }
            }
}