/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Login;

import DAO.DAO_User;
import DAOImplements.Implement_User;
import Model.User;
import View.Dialog.Login.Login;
import View.Form.Dashboard;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author MohamadEsa
 */
public class Control_userLogin {
  Login form;
  Dashboard db;
  DAO_User impl;
  List<User> li;

  public Control_userLogin(Login form) {
    this.form = form;
    db = new Dashboard();
    impl = new Implement_User();
  }
  
  public void cek_login (Login data){
           
    String nama = data.getTxtUname().getText();
    String pass = data.getTxtPass().getText();
                
    li = impl.getLogin(nama, pass);
                
    if(li.size()==1){
      db.setVisible(true);
      form.setVisible(false);
    } else{
      JOptionPane.showMessageDialog(data, "Username atau Password Tidak Valid");
    }
           
    }
  
}
