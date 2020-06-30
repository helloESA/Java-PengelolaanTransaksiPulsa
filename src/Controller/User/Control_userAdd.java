/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.User;

import DAO.DAO_User;
import DAOImplements.Implement_User;
import Model.User;
import View.Dialog.User.inputPengguna;
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public class Control_userAdd {
  inputPengguna v;
  DAO_User impl;
  List<User> li;
  
  public Control_userAdd(inputPengguna v){
    this.v = v;
    impl = new Implement_User();
  }
  
  public void insert(inputPengguna d){
    User m = new User();
    m.setNama(d.getTxtNama().getText());
    m.setUsername(d.getTxtUname().getText());
    m.setPassword(d.getTxtPass().getText().trim());
    impl.add(m);
  }
}
