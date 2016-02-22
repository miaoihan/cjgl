
import cjgl_1.pkg0.TeachAdd;
import java.sql.*;
import javax.swing.JOptionPane;



/**
 *    数据库的查询
 * @author Administrator
 */
public class TestDatebases {   
    public static void main(String[] args) {
        String strMysqlURL="jdbc:mysql://localhost:3306/student?user=root&password=root"; 
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection(strMysqlURL);
            System.out.println("******数据库已连接******");
            Statement stmt = con.createStatement();
         
            ResultSet rs=stmt.executeQuery("select * from usertb");
            
           while(rs.next()){
                System.out.println("帐号： "+rs.getString("username"));
                System.out.println("密码:  "+rs.getString(3));
            }
           rs.close(); con.close();stmt.close();
             }catch(Exception e){
            e.printStackTrace();
            
        }
    }
}

 
 