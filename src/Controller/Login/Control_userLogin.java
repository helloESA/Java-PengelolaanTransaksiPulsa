/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Login;

import DAO.DAO_User;
import DAOImplements.Implement_User;
import Model.User;
import Model.UserSession;
import View.Form.LoginFrame;
import View.Form.Dashboard;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author MohamadEsa
 */
public class Control_userLogin {
  LoginFrame form;
  Dashboard db;
  DAO_User impl;
  List<User> li;

  public Control_userLogin(LoginFrame form) {
    this.form = form;
    db = new Dashboard();
    impl = new Implement_User();
  }
  
  public void cek_login (LoginFrame data){
           
    String nama = data.getTxtUname().getText();
    String pass = data.getTxtPass().getText();
                
    li = impl.getLogin(nama, pass);
                
    if(li.size()==1){
      System.out.println("[01]"+UserSession.getId()+","+UserSession.getNama());
      User m = new User();
      System.out.println("[02]"+m.getId()+","+m.getNama());
      db.setVisible(true);
      form.setVisible(false);
    } else{
      JOptionPane.showMessageDialog(data, "Username atau Password Tidak Valid");
    }
           
    }
  
}
