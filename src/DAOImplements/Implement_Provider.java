/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplements;

import Config.DBUtilities;
import DAO.DAO_Provider;
import Model.Provider;
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
public class Implement_Provider implements DAO_Provider{

  Connection con;
  
  public Implement_Provider(){}
  
  @Override
  public List<Provider> getALL() {
    con = DBUtilities.config();
    Statement sta = null;
    ResultSet res = null;
    List<Provider> li = null;
    
    try {
      String q = "SELECT * FROM `provider` ORDER BY id_provider DESC";
      
      li = new ArrayList<>();
      sta = con.createStatement();
      res = sta.executeQuery(q);
      
      while(res.next()){
        Provider m = new Provider();
        m.setId(res.getString("id_provider"));
        m.setKategori(res.getString("kategori"));
        m.setNama_provider(res.getString("nama_provider"));
        li.add(m);
      }
      
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "[100]\nTabel Gagal Ditampilkan","Pesan Error",JOptionPane.ERROR_MESSAGE);
      System.err.println("[100] Pesan Error:\n"+e);
    } finally{
      try {
        con.close();
        sta.close();
        res.close();
      } catch (SQLException e) {
      }
    }
    return li;
  }

  @Override
  public List<Provider> getSearch(String data) {
    con = DBUtilities.config();
    Statement sta = null;
    ResultSet res = null;
    List<Provider> li = null;
    
    try {
      String q = "SELECT * FROM `provider` WHERE nama_provider LIKE '%"+data+"%'";
      
      li = new ArrayList<>();
      sta = con.createStatement();
      res = sta.executeQuery(q);
      
      while(res.next()){
        Provider m = new Provider();
        m.setId(res.getString("id_provider"));
        m.setKategori(res.getString("kategori"));
        m.setNama_provider(res.getString("nama_provider"));
        
        li.add(m);
      }
      
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "[100]\nTabel Gagal Diproses","Pesan Error",JOptionPane.ERROR_MESSAGE);
      System.err.println("[100] Pesan Error:\n"+e);
    } finally{
      try {
        con.close();
        sta.close();
        res.close();
      } catch (SQLException e) {
      }
    }
    return li;
  }

  @Override
  public void add(Provider data) {
    con = DBUtilities.config();
    
    String  kategori = data.getKategori(), nama = data.getNama_provider();
    
    
    PreparedStatement stat = null;
    
    try {
      String q = "INSERT INTO `provider`(`id_provider`, `kategori`, `nama_provider`) VALUES (null,?,?)";
      
      stat = con.prepareStatement(q);
      stat.setString(1, kategori);
      stat.setString(2, nama);
      stat.executeUpdate();
      
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "[200]\nData Gagal Disimpan","Pesan Error", JOptionPane.ERROR_MESSAGE);      
      System.err.println("[200] Pesan Error:\n"+e);
    } finally{
      try {
        con.close();
//        stat.close();
      } catch (SQLException e) {
      }
    }
  }

  @Override
  public void edit(Provider data) {
    con = DBUtilities.config();
    
    String id = data.getId();
    String  kategori = data.getKategori(), nama = data.getNama_provider();
    
    
    PreparedStatement stat = null;
    
    try {
      String q = "UPDATE `provider` SET `kategori`=?,`nama_provider`=? WHERE `id_provider`=?";
      stat = con.prepareStatement(q);
      stat.setString(1, kategori);
      stat.setString(2, nama);
      stat.setString(3, id);
      
      stat.executeUpdate();
      
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "[300]\nData Gagal Diperbarui","Pesan Error", JOptionPane.ERROR_MESSAGE);
      System.err.println("[300] Pesan Error:\n"+e);
    } finally{
      try {
        con.close();
        stat.close();
      } catch (SQLException e) {
      }
    }
  }

  @Override
  public void delete(String data) {
    con = DBUtilities.config();
    PreparedStatement stat = null;
    
    try {
      String q = "DELETE FROM provider WHERE id_provider='"+data+"'";
      stat = con.prepareStatement(q);
      stat.executeUpdate();
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "[400]\nData Gagal Dihapus","Pesan Error", JOptionPane.ERROR_MESSAGE);      
      System.err.println("[400] Pesan Error:\n"+e);
    }
  }
  
}
