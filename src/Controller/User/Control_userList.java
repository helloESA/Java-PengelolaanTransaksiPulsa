/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.User;

import DAO.DAO_User;
import DAOImplements.Implement_User;
import Model.User;
import TableModel.TM_User;
import View.Panel.userPanel;
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public class Control_userList {
  userPanel v;
  DAO_User impl;
  List<User> li;
  
  public Control_userList(userPanel v){
    this.v = v;
    impl = new Implement_User();
  }
  
  public void isiTable(){
    li = impl.getALL();
    TM_User tabel = new TM_User(li);
    v.getTabelData().setModel(tabel);
  }
  
  public void delete(String kode){
    impl.delete(kode);
  }
}
