/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.javafx;
import java.sql.*;

/**
 *
 * @author Gurtavrein Singh
 */
public class javaToDB_19BCE2101 {
    public static void main(String args[])throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String Db_url="jdbc:mysql://localhost:3306//javatraining";
        Connection DBCon=DriverManager.getConnection(Db_url,"root","" );
        Statement st1=DBCon.createStatement();
        ResultSet tuples=st1.executeQuery("select * from users");
        System.out.println(tuples);
        DBCon.close();
    }
    
}
