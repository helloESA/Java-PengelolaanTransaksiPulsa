/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplements;

import Config.DBUtilities;
import DAO.DAO_Count;
import Model.Transaksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author MohamadEsa
 */
public class Implement_Count implements DAO_Count{

  Connection koneksi;
  
  public Implement_Count() {
  }
  
  @Override
  public String getCountSukses() {
    koneksi = DBUtilities.config();
    PreparedStatement stat = null;
    ResultSet res = null;
    String size = null;
    try {
      String query = "SELECT SUM(harga) harga FROM transaksi WHERE status_pembayaran LIKE '%Telah Membayar%'";
      
      stat = koneksi.prepareStatement(query);
      res = stat.executeQuery();
      if(res.next()){
        size = res.getString("harga");
      }
      koneksi.close();
//      System.out.println("--> "+size);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Data Tidak Dapat Dimunculkan","Perhatian", JOptionPane.WARNING_MESSAGE);
    } 
    return size;
  }

  @Override
  public String getCountGagal() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public String getCountBelumBayar() {
    koneksi = DBUtilities.config();
    PreparedStatement stat = null;
    ResultSet res = null;
    String size = null;
    try {
      String query = "SELECT SUM(harga) harga FROM transaksi WHERE status_pembayaran LIKE '%Belum Membayar%'";
      
      stat = koneksi.prepareStatement(query);
      res = stat.executeQuery();
      if(res.next()){
        size = res.getString("harga");
      }
      koneksi.close();
//      System.out.println("--> "+size);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Data Tidak Dapat Dimunculkan","Perhatian", JOptionPane.WARNING_MESSAGE);
    } 
    return size;
  }

  @Override
  public int getCountJumlahTransaksi() {
    koneksi = DBUtilities.config();
    PreparedStatement stat = null;
    ResultSet res = null;
    int size = 0;
    try {
      String query = "SELECT COUNT(*) FROM transaksi";
      
      stat = koneksi.prepareStatement(query);
      res = stat.executeQuery();
      if(res.next()){
        size = res.getInt(1);  
      }
      koneksi.close();
//      System.out.println("-> "+size);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Data Tidak Dapat Dimunculkan","Perhatian", JOptionPane.WARNING_MESSAGE);
      System.out.println(e);
    } 
    return size;
  }
  
}
