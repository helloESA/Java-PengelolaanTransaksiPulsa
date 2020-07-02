/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Provider;

import Controller.User.*;
import DAO.DAO_Kategori;
import DAO.DAO_Produk;
import DAO.DAO_Provider;
import DAO.DAO_User;
import DAOImplements.Implement_Kategori;
import DAOImplements.Implement_Produk;
import DAOImplements.Implement_Provider;
import DAOImplements.Implement_User;
import Model.Kategori;
import Model.Produk;
import Model.Provider;
import Model.User;
import View.Dialog.Kategori.updateKategori;
import View.Dialog.Produk.updateProduk;
import View.Dialog.Provider.updateProvider;
import View.Dialog.User.updatePengguna;
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public class Control_providerUpdate {
  updateProvider v;
  DAO_Provider impl;
  List<Provider> li;
  
  public Control_providerUpdate(updateProvider v){
    this.v = v;
    impl = new Implement_Provider();
  }
  
  public void update(updateProvider d){
    Provider m = new Provider();
    m.setId(d.getjLabel1().getText());
    m.setKategori(d.getTxtKategori().getText());
    m.setNama_provider(d.getTxtNama().getText());
    impl.edit(m);
  }
}
