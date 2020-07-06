/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplements;

import Config.DBUtilities;
import DAO.DAO_Kategori;
import DAO.DAO_User;
import Model.Kategori;
import Model.User;
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
public class Implement_Kategori implements DAO_Kategori{

  Connection con;
  
  public Implement_Kategori(){}
  
  @Override
  public List<Kategori> getALL() {
    con = DBUtilities.config();
    Statement sta = null;
    ResultSet res = null;
    List<Kategori> li = null;
    
    try {
      String q = "SELECT * FROM `kategori` ORDER BY id_kategori DESC";
      
      li = new ArrayList<>();
      sta = con.createStatement();
      res = sta.executeQuery(q);
      
      while(res.next()){
        Kategori m = new Kategori();
        m.setId(res.getString("id_kategori"));
        m.setKategori(res.getString("nama_kategori"));
        
        li.add(m);
      }
      con.close();
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "[100]\nTabel Gagal Ditampilkan","Pesan Error",JOptionPane.ERROR_MESSAGE);
      System.err.println("[100] Pesan Error:\n"+e);
    } 
    return li;
  }

  @Override
  public List<Kategori> getSearch(String data) {
    con = DBUtilities.config();
    Statement sta = null;
    ResultSet res = null;
    List<Kategori> li = null;
    
    try {
      String q = "SELECT * FROM `kategori` WHERE nama_kategori LIKE '%"+data+"%'";
      
      li = new ArrayList<>();
      sta = con.createStatement();
      res = sta.executeQuery(q);
      
      while(res.next()){
        Kategori m = new Kategori();
        m.setId(res.getString("id_kategori"));
        m.setKategori(res.getString("nama_kategori"));
        
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
  public void add(Kategori data) {
    con = DBUtilities.config();
    
    String nama = data.getKategori();
    
    PreparedStatement stat = null;
    
    try {
      String q = "INSERT INTO `kategori`(`id_kategori`, `nama_kategori`) VALUES (null, ?)";
      
      stat = con.prepareStatement(q);
      stat.setString(1, nama);
      stat.executeUpdate();
      con.close();
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "[200]\nData Gagal Disimpan","Pesan Error", JOptionPane.ERROR_MESSAGE);      
      System.err.println("[200] Pesan Error:\n"+e);
    } 
  }

  @Override
  public void edit(Kategori data) {
    con = DBUtilities.config();
    
    String id = data.getId();
    String nama = data.getKategori();
    
    PreparedStatement stat = null;
    
    try {
      String q = "UPDATE `kategori` SET `nama_kategori`=? WHERE `id_kategori`=?";
      
      stat = con.prepareStatement(q);
      stat.setString(1, nama);
      stat.setString(2, id);
      stat.executeUpdate();
      con.close();
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "[300]\nData Gagal Diperbarui","Pesan Error", JOptionPane.ERROR_MESSAGE);
      System.err.println("[300] Pesan Error:\n"+e);
    } 
  }

  @Override
  public void delete(String data) {
    con = DBUtilities.config();
    PreparedStatement stat = null;
    
    try {
      String q = "DELETE FROM kategori WHERE id_kategori='"+data+"'";
      stat = con.prepareStatement(q);
      stat.executeUpdate();
      con.close();
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "[400]\nData Gagal Dihapus","Pesan Error", JOptionPane.ERROR_MESSAGE);      
      System.err.println("[400] Pesan Error:\n"+e);
    }
  }
}
