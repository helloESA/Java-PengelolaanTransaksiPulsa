/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Kategori;

import Controller.User.*;
import DAO.DAO_Kategori;
import DAO.DAO_User;
import DAOImplements.Implement_Kategori;
import DAOImplements.Implement_User;
import Model.Kategori;
import Model.User;
import View.Dialog.Kategori.updateKategori;
import View.Dialog.User.updatePengguna;
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public class Control_kategoriUpdate {
  updateKategori v;
  DAO_Kategori impl;
  List<Kategori> li;
  
  public Control_kategoriUpdate(updateKategori v){
    this.v = v;
    impl = new Implement_Kategori();
  }
  
  public void update(updatePengguna d){
    Kategori m = new Kategori();
    m.setId(d.getTxtID().getText());
    m.setKategori(d.getTxtNama().getText());
    impl.edit(m);
  }
}
