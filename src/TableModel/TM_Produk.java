/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import Model.Kategori;
import Model.Produk;
import Model.User;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MohamadEsa
 */
public class TM_Produk extends AbstractTableModel{

  List<Produk> li;
  
  public TM_Produk(List<Produk> li){
    this.li=li;
  }
  
  @Override
  public int getRowCount() {
    return li.size();
  }

  @Override
  public int getColumnCount() {
    return 6;
  }

  @Override
  public String getColumnName(int col) {
    switch(col){
      case 0 : return "ID";
      case 1 : return "Kategori";
      case 2 : return "Provider";
      case 3 : return "Nama Produk";
      case 4 : return "Keterangan";
      case 5 : return "Harga";
      default: return null;
    }
  }

  @Override
  public Object getValueAt(int row, int col) {
    switch(col){
      case 0 : return li.get(row).getId();
      case 1 : return li.get(row).getKategori();
      case 2 : return li.get(row).getProvider();
      case 3 : return li.get(row).getNama_produk();
      case 4 : return li.get(row).getKeterangan();
      case 5 : return li.get(row).getHarga();
      default: return null;
    }
  }
}
