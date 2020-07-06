/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplements;

import Config.DBUtilities;
import DAO.DAO_User;
import Model.User;
import Model.UserSession;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author MohamadEsa
 */
public class Implement_User implements DAO_User{

  Connection con = DBUtilities.config();
  
  public Implement_User(){}
  
  @Override
  public List<User> getALL() {
    
    
    List<User> li = null;
    
    try {
      String q = "SELECT * FROM `user` ORDER BY id_user DESC";
      
      li = new ArrayList<>();
      
      Statement sta = con.createStatement();
      ResultSet res = sta.executeQuery(q);
      
      while(res.next()){
        User m = new User();
        m.setId(res.getString("id_user"));
        m.setNama(res.getString("nama_user"));
        m.setUsername(res.getString("username"));
        m.setPassword(res.getString("password"));
        li.add(m);
        
        UserSession.setId(res.getString("id_user"));
        UserSession.setNama(res.getString("nama_user"));
        UserSession.setUsername(res.getString("username"));
        UserSession.setPassword(res.getString("password"));
      }
     
        
      con.close();
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "[100]\nTabel Gagal Ditampilkan","Pesan Error",JOptionPane.ERROR_MESSAGE);
      System.err.println("[100] Pesan Error:\n"+e);
    }
    return li;
  }

  @Override
  public List<User> getLogin(String username, String password) {
    
    List<User> li = null;
    User m = null;
    try {
      String q = "SELECT * FROM `user` WHERE username='"+username+"' AND password = MD5('"+password+"')";
      
      li = new ArrayList<>();
      Statement sta = con.createStatement();
      ResultSet res = sta.executeQuery(q);
      
      while(res.next()){
        m = new User();
        m.setId(res.getString("id_user"));
        m.setNama(res.getString("nama_user"));
        m.setUsername(res.getString("username"));
        m.setPassword(res.getString("password"));
        li.add(m);
        
        UserSession.setId(res.getString("id_user"));
        UserSession.setNama(res.getString("nama_user"));
        UserSession.setUsername(res.getString("username"));
        UserSession.setPassword(res.getString("password"));
      }
      
      System.out.println(UserSession.getNama());
      con.close();
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "[101]\nLogin Gagal Diproses","Pesan Error",JOptionPane.ERROR_MESSAGE);
      System.err.println("[101] Pesan Error:\n"+e);
    } 
    return li;
  }

  @Override
  public List<User> getSearch(String data) {
    
    Statement sta = null;
    ResultSet res = null;
    List<User> li = null;
    
    try {
      String q = "SELECT * FROM `user` WHERE nama_user LIKE '%"+data+"%'";
      
      li = new ArrayList<>();
      sta = con.createStatement();
      res = sta.executeQuery(q);
      
      while(res.next()){
        User m = new User();
        m.setId(res.getString("id_user"));
        m.setNama(res.getString("nama_user"));
        m.setUsername(res.getString("username"));
        m.setPassword(res.getString("password"));
        
        li.add(m);
      }
      con.close();
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "[100]\nTabel Gagal Diproses","Pesan Error",JOptionPane.ERROR_MESSAGE);
      System.err.println("[100] Pesan Error:\n"+e);
    }
    return li;
  }

  @Override
  public void add(User data) {
    con = DBUtilities.config();
    
    String nama = data.getNama();
    String uname = data.getUsername();
    String pass = data.getPassword();
    
    PreparedStatement stat = null;
    
    try {
      String q = "INSERT INTO `user`(`id_user`, `nama_user`, `username`, `password`) VALUES (null, ?, ?, MD5(?))";
      
      stat = con.prepareStatement(q);
      stat.setString(1, nama);
      stat.setString(2, uname);
      stat.setString(3, pass);
      stat.executeUpdate();
      con.close();
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "[200]\nData Gagal Disimpan","Pesan Error", JOptionPane.ERROR_MESSAGE);      System.err.println("[200] Pesan Error:\n"+e);
    } 
  }

  @Override
  public void edit(User data) {
    
    
    String id = data.getId();
    String nama = data.getNama();
    String uname = data.getUsername();
    String pass = data.getPassword();
    
    PreparedStatement stat = null;
    
    try {
      String q = "UPDATE `user` SET `nama_user`=?,`username`=?,`password`= MD5(?) WHERE `id_user`=?";
      
      stat = con.prepareStatement(q);
      stat.setString(1, nama);
      stat.setString(2, uname);
      stat.setString(3, pass);
      stat.setString(4, id);
      stat.executeUpdate();
      con.close();
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "[300]\nData Gagal Diperbarui","Pesan Error", JOptionPane.ERROR_MESSAGE);      System.err.println("[300] Pesan Error:\n"+e);
    } 
  }

  @Override
  public void delete(String data) {
    con = DBUtilities.config();
    PreparedStatement stat = null;
    
    try {
      String q = "DELETE FROM user WHERE id_user='"+data+"'";
      stat = con.prepareStatement(q);
      stat.executeUpdate();
      con.close();
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "[400]\nData Gagal Dihapus","Pesan Error", JOptionPane.ERROR_MESSAGE);      System.err.println("[400] Pesan Error:\n"+e);
    }
  }
}
