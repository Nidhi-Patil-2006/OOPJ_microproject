/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nidhi
 */
public class DBCONNECT {
     public static Connection connect() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/monthlyexp", 
                "root",
                "" 
            );
            System.out.println("Database Connected Successfully!");
        } 
        catch (Exception e) {
            System.err.println("Error establishing connection!! ");
        }
        return con;
 }
    public static void main(String[] args) {
        DBCONNECT.connect();
    }
}
