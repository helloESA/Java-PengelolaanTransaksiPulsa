/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import Model.Kategori;
import Model.Produk;
import Model.Transaksi;
import Model.User;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MohamadEsa
 */
public class TM_Transaksi extends AbstractTableModel{

  List<Transaksi> li;
  
  public TM_Transaksi(List<Transaksi> li){
    this.li=li;
  }
  
  @Override
  public int getRowCount() {
    return li.size();
  }

  @Override
  public int getColumnCount() {
    return 12;
  }

  @Override
  public String getColumnName(int col) {
    switch(col){
      case 0 : return "ID";
      case 1 : return "Kategori";
      case 2 : return "Provider";
      case 3 : return "Produk";
      case 4 : return "Keterangan";
      case 5 : return "No Pelanggan";
      case 6 : return "Harga";
      case 7 : return "Waktu Pesan";
      case 8 : return "Status";
      case 9 : return "Pembayaran";
      case 10 : return "Tanggal Bayar";
      case 11 : return "SN/ID Voucher";
      default: return null;
    }
  }

  @Override
  public Object getValueAt(int row, int col) {
    switch(col){
      case 0 : return li.get(row).getId();
      case 1 : return li.get(row).getKategori();
      case 2 : return li.get(row).getProvider();
      case 3 : return li.get(row).getProduk();
      case 4 : return li.get(row).getKeterangan();
      case 5 : return li.get(row).getNo_pel();
      case 6 : return li.get(row).getHarga();
      case 7 : return li.get(row).getWkt_pesan();
      case 8 : return li.get(row).getStatus();
      case 9 : return li.get(row).getPembayaran();
      case 10 : return li.get(row).getTgl_bayar();
      case 11 : return li.get(row).getSn_id();
      default: return null;
    }
  }
}
