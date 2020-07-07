/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author MohamadEsa
 */
public class DBUtilities implements Config{
  private static Connection con;
    
    public static Connection config(){
      
      if(con==null){
        MysqlDataSource data = new MysqlDataSource();
        data.setDatabaseName(db_name);
        data.setUser(user);
        data.setPort(3306);
        data.setPassword(pass);
        
        try {
          con = data.getConnection();
        } catch (SQLException e) {
          System.err.println("Kode Akses Error : "+e);
            JOptionPane.showMessageDialog(null, "Database Tidak Terhubung","Error",JOptionPane.ERROR_MESSAGE);
        }
      }
      
//        try {
//            Class.forName(driver).newInstance();
//            con = DriverManager.getConnection(link, user, pass);
//            if(con==null){
//                System.err.println("Koneksi Hilang/Tidak Ada");
//            } else{
//                System.out.println("Berhasil Tersambung");
//            }
//        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
//            System.err.println("Kode Akses Error : "+e);
//            JOptionPane.showMessageDialog(null, "Database Tidak Terhubung","Error",JOptionPane.ERROR_MESSAGE);
//        }
        return con;
    }
    
}
