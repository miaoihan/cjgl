
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  数据库的增加
 * @author Administrator
 */
public class TestAdd {
    public static void main(String[] args) {
         String strMysqlURL="jdbc:mysql://localhost:3306/student?user=root&password=root"; 
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn=DriverManager.getConnection(strMysqlURL);
            System.out.println("******数据库已连接******");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("insert into usertb value(6,'zz',123)");
            System.out.println("数据添加成功！");
            conn.close();stmt.close();
    }catch(Exception e){
            e.printStackTrace();
            System.out.println("数据添加失败！！");
        }
    
}
}
