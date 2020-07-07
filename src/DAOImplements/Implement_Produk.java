/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplements;

import Config.DBUtilities;
import DAO.DAO_Kategori;
import DAO.DAO_Produk;
import DAO.DAO_User;
import Model.Kategori;
import Model.Produk;
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
public class Implement_Produk implements DAO_Produk{

  Connection con;
  
  public Implement_Produk(){}
  
  @Override
  public List<Produk> getALL() {
    con = DBUtilities.config();
    Statement sta = null;
    ResultSet res = null;
    List<Produk> li = null;
    
    try {
      String q = "SELECT * FROM `produk` ORDER BY id_produk DESC";
      
      li = new ArrayList<>();
      sta = con.createStatement();
      res = sta.executeQuery(q);
      
      while(res.next()){
        Produk m = new Produk();
        m.setId(res.getString("id_produk"));
        m.setKategori(res.getString("kategori"));
        m.setProvider(res.getString("provider"));
        m.setNama_produk(res.getString("nama_produk"));
        m.setKeterangan(res.getString("keterangan"));
        m.setHarga(res.getString("harga"));
        
        li.add(m);
      }
//      con.close();
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "[100]\nTabel Gagal Ditampilkan","Pesan Error",JOptionPane.ERROR_MESSAGE);
      System.err.println("[100] Pesan Error:\n"+e);
    } 
    return li;
  }

  @Override
  public List<Produk> getSearch(String data) {
    con = DBUtilities.config();
    Statement sta = null;
    ResultSet res = null;
    List<Produk> li = null;
    
    try {
      String q = "SELECT * FROM `produk` WHERE nama_produk LIKE '%"+data+"%'";
      
      li = new ArrayList<>();
      sta = con.createStatement();
      res = sta.executeQuery(q);
      
      while(res.next()){
        Produk m = new Produk();
        m.setId(res.getString("id_produk"));
        m.setKategori(res.getString("kategori"));
        m.setProvider(res.getString("provider"));
        m.setNama_produk(res.getString("nama_produk"));
        m.setKeterangan(res.getString("keterangan"));
        m.setHarga(res.getString("harga"));
        
        li.add(m);
      }
//      con.close();
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "[100]\nTabel Gagal Diproses","Pesan Error",JOptionPane.ERROR_MESSAGE);
      System.err.println("[100] Pesan Error:\n"+e);
    } 
    return li;
  }

  @Override
  public void add(Produk data) {
    con = DBUtilities.config();
    
    String  kategori = data.getKategori(),
            provider = data.getProvider(),
            nama = data.getNama_produk(),
            keterangan = data.getKeterangan(),
            harga = data.getHarga();
    
    
    PreparedStatement stat = null;
    
    try {
      String q = "INSERT INTO `produk`(`id_produk`, `kategori`, `provider`, `nama_produk`, `keterangan`, `harga`) VALUES (null,?,?,?,?,?)";
      
      stat = con.prepareStatement(q);
      stat.setString(1, kategori);
      stat.setString(2, provider);
      stat.setString(3, nama);
      stat.setString(4, keterangan);
      stat.setString(5, harga);
      stat.executeUpdate();
//      con.close();
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "[200]\nData Gagal Disimpan","Pesan Error", JOptionPane.ERROR_MESSAGE);      
      System.err.println("[200] Pesan Error:\n"+e);
    } 
  }

  @Override
  public void edit(Produk data) {
    con = DBUtilities.config();
    
    String id = data.getId();
    String  kategori = data.getKategori(),
            provider = data.getProvider(),
            nama = data.getNama_produk(),
            keterangan = data.getKeterangan(),
            harga = data.getHarga();
    
    
    PreparedStatement stat = null;
    
    try {
      String q = "UPDATE `produk` SET `kategori`=?,`provider`=?,`nama_produk`=?,`keterangan`=?,`harga`=? WHERE `id_produk`=?";
      stat = con.prepareStatement(q);
      stat.setString(1, kategori);
      stat.setString(2, provider);
      stat.setString(2, nama);
      stat.setString(3, keterangan);
      stat.setString(4, harga);
      stat.setString(5, id);
      
      stat.executeUpdate();
//      con.close();
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
      String q = "DELETE FROM produk WHERE id_produk='"+data+"'";
      stat = con.prepareStatement(q);
      stat.executeUpdate();
//      con.close();
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "[400]\nData Gagal Dihapus","Pesan Error", JOptionPane.ERROR_MESSAGE);      
      System.err.println("[400] Pesan Error:\n"+e);
    }
  }
}
