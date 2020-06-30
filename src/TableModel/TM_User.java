/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import Model.User;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MohamadEsa
 */
public class TM_User extends AbstractTableModel{

  List<User> li;
  
  public TM_User(List<User> li){
    this.li=li;
  }
  
  @Override
  public int getRowCount() {
    return li.size();
  }

  @Override
  public int getColumnCount() {
    return 4;
  }

  @Override
  public String getColumnName(int col) {
    switch(col){
      case 0 : return "ID";
      case 1 : return "Nama Lengkap";
      case 2 : return "Username";
      case 3 : return "Password";
      default: return null;
    }
  }

  @Override
  public Object getValueAt(int row, int col) {
    switch(col){
      case 0 : return li.get(row).getId();
      case 1 : return li.get(row).getNama();
      case 2 : return li.get(row).getUsername();
      case 3 : return li.get(row).getPassword();
      default: return null;
    }
  }
}
