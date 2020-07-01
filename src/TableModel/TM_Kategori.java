/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import Model.Kategori;
import Model.User;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MohamadEsa
 */
public class TM_Kategori extends AbstractTableModel{

  List<Kategori> li;
  
  public TM_Kategori(List<Kategori> li){
    this.li=li;
  }
  
  @Override
  public int getRowCount() {
    return li.size();
  }

  @Override
  public int getColumnCount() {
    return 2;
  }

  @Override
  public String getColumnName(int col) {
    switch(col){
      case 0 : return "ID";
      case 1 : return "Kategori";
      default: return null;
    }
  }

  @Override
  public Object getValueAt(int row, int col) {
    switch(col){
      case 0 : return li.get(row).getId();
      case 1 : return li.get(row).getKategori();
      default: return null;
    }
  }
}
