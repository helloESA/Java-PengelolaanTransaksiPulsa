/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplements;

import Config.DBUtilities;
import DAO.DAO_Kategori;
import DAO.DAO_Produk;
import DAO.DAO_Transaksi;
import DAO.DAO_User;
import Model.Kategori;
import Model.Produk;
import Model.Provider;
import Model.Transaksi;
import Model.User;
import View.Dialog.Transaksi.inputTransaksi;
import View.List.listProviderTransaksi;
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
public class Implement_Transaksi implements DAO_Transaksi{

  Connection con;
  
  public Implement_Transaksi(){}
  
  @Override
  public List<Transaksi> getALL() {
    con = DBUtilities.config();
    Statement sta = null;
    ResultSet res = null;
    List<Transaksi> li = null;
    try {
      String q = "SELECT * FROM `transaksi` ORDER BY id_transaksi DESC";
      
      li = new ArrayList<>();
      sta = con.createStatement();
      res = sta.executeQuery(q);
      
      while(res.next()){
        Transaksi m = new Transaksi();
        m.setId(res.getString("id_transaksi"));
        m.setKategori(res.getString("kategori"));
        m.setProvider(res.getString("provider"));
        m.setProduk(res.getString("produk"));
        m.setKeterangan(res.getString("keterangan_produk"));
        m.setNo_pel(res.getString("no_telepon"));
        m.setHarga(res.getString("harga"));
        m.setWkt_pesan(res.getString("waktu_pesan"));
        m.setStatus(res.getString("status_pembayaran"));
        m.setPembayaran(res.getString("tipe_pembayaran"));
        m.setTgl_bayar(res.getString("tanggal_bayar"));
        m.setSn_id(res.getString("kode_sn"));
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
  public List<Transaksi> getSearch(String data) {
    con = DBUtilities.config();
    Statement sta = null;
    ResultSet res = null;
    List<Transaksi> li = null;
    
    try {
      String q = "SELECT * FROM `transaksi` WHERE no_telepon LIKE '%"+data+"%'";
      
      li = new ArrayList<>();
      sta = con.createStatement();
      res = sta.executeQuery(q);
      
      while(res.next()){
        Transaksi m = new Transaksi();
        m.setId(res.getString("id_transaksi"));
        m.setKategori(res.getString("kategori"));
        m.setProvider(res.getString("provider"));
        m.setProduk(res.getString("produk"));
        m.setKeterangan(res.getString("keterangan_produk"));
        m.setNo_pel(res.getString("no_telepon"));
        m.setHarga(res.getString("harga"));
        m.setWkt_pesan(res.getString("waktu_pesan"));
        m.setStatus(res.getString("status_pembayaran"));
        m.setPembayaran(res.getString("tipe_pembayaran"));
        m.setTgl_bayar(res.getString("tanggal_bayar"));
        m.setSn_id(res.getString("kode_sn"));
        
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
  public List<Provider> getSearchFromKategori(String kateg) {
    con = DBUtilities.config();
    Statement sta = null;
    ResultSet res = null;
    List<Provider> li = null;
//    System.out.println("Nyebrang :"+kateg);
    try {
      String q = "SELECT * FROM `provider` WHERE kategori LIKE '%"+kateg+"%'";
      
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
      con.close();
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "[100]\nTabel Gagal Diproses","Pesan Error",JOptionPane.ERROR_MESSAGE);
      System.err.println("[100] Pesan Error:\n"+e);
    } 
    return li;
  }
  
  
  @Override
  public List<Produk> getSearchFromProvider(String data, String data1) {
    con = DBUtilities.config();
    Statement sta = null;
    ResultSet res = null;
    List<Produk> li = null;
    
    try {
      String q = "SELECT * FROM `produk` WHERE provider LIKE '%"+data+"%' AND kategori LIKE '%"+data1+"%'";
      
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
      con.close();
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "[100]\nTabel Gagal Diproses","Pesan Error",JOptionPane.ERROR_MESSAGE);
      System.err.println("[100] Pesan Error:\n"+e);
    }
    return li;
  }

  @Override
  public void add(Transaksi data) {
    con = DBUtilities.config();
    
    String  kategori = data.getKategori(),
            provider = data.getProvider(),
            produk = data.getProduk(),
            keterangan = data.getKeterangan(),
            no_pel = data.getNo_pel(),
            harga = data.getHarga(),
            wkt_pesan = data.getWkt_pesan(),
            status = data.getStatus(),
            pembayaran = data.getPembayaran(),
            tgl_bayar = data.getTgl_bayar(),
            sn_id = data.getSn_id();
    
    
    PreparedStatement stat = null;
    
    try {
      String q = "INSERT INTO `transaksi`(`id_transaksi`, `kategori`, `provider`, `produk`, `keterangan_produk`, `no_telepon`, `harga`, `waktu_pesan`, `status_pembayaran`, `tipe_pembayaran`, `tanggal_bayar`, `kode_sn`) VALUES (null,?,?,?,?,?,?,?,?,?,?,?)";
      
      stat = con.prepareStatement(q);
      stat.setString(1, kategori);
      stat.setString(2, provider);
      stat.setString(3, produk);
      stat.setString(4, keterangan);
      stat.setString(5, no_pel);
      stat.setString(6, harga);
      stat.setString(7, wkt_pesan);
      stat.setString(8, status);
      stat.setString(9, pembayaran);
      stat.setString(10, tgl_bayar);
      stat.setString(11, sn_id);
      stat.executeUpdate();
      con.close();
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "[200]\nData Gagal Disimpan","Pesan Error", JOptionPane.ERROR_MESSAGE);      
      System.err.println("[200] Pesan Error:\n"+e);
    } 
  }

  @Override
  public void edit(Transaksi data) {
    con = DBUtilities.config();
    
    String id = data.getId();
    String  kategori = data.getKategori(),
            provider = data.getProvider(),
            produk = data.getProduk(),
            keterangan = data.getKeterangan(),
            no_pel = data.getNo_pel(),
            harga = data.getHarga(),
            wkt_pesan = data.getWkt_pesan(),
            status = data.getStatus(),
            pembayaran = data.getPembayaran(),
            tgl_bayar = data.getTgl_bayar(),
            sn_id = data.getSn_id();
    
    
    PreparedStatement stat = null;
    
    try {
      String q = "UPDATE `transaksi` SET `kategori`=?,`provider`=?,`produk`=?,`keterangan_produk`=?,`no_telepon`=?,`harga`=?,`waktu_pesan`=?,`status_pembayaran`=?,`tipe_pembayaran`=?,`tanggal_bayar`=?,`kode_sn`=? WHERE `id_transaksi`=?";
      stat = con.prepareStatement(q);
      stat.setString(1, kategori);
      stat.setString(2, provider);
      stat.setString(3, produk);
      stat.setString(4, keterangan);
      stat.setString(5, no_pel);
      stat.setString(6, harga);
      stat.setString(7, wkt_pesan);
      stat.setString(8, status);
      stat.setString(9, pembayaran);
      stat.setString(10, tgl_bayar);
      stat.setString(11, sn_id);
      stat.setString(12, id);
      
      
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
      String q = "DELETE FROM transaksi WHERE id_transaksi='"+data+"'";
      stat = con.prepareStatement(q);
      stat.executeUpdate();
      con.close();
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "[400]\nData Gagal Dihapus","Pesan Error", JOptionPane.ERROR_MESSAGE);      
      System.err.println("[400] Pesan Error:\n"+e);
    }
  }
  
}
