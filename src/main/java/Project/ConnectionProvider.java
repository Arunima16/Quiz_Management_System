/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
/**
 *
 * @author Hp
 */
public class ConnectionProvider {
    public static Connection getCon() throws ClassNotFoundException, SQLException
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Quiz?zeroDateTimeBehavior=CONVERT_TO_NULL","root","Aru@123*");
            return con;
        }
        catch(SQLException e)
        {
            throw new RuntimeException("Cannot connect to database",e);
        }
    }
}
