/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

/**
 *
 * @author MohamadEsa
 */
public interface DBConfig {
    String user = "root";
    String pass = "";
    String driver = "com.mysql.jdbc.Driver";
    String link = "jdbc:mysql://localhost:3306/mpt_pulsa";
}
