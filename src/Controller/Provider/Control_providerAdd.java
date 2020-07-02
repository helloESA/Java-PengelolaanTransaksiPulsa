/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Provider;

import DAO.DAO_Kategori;
import DAO.DAO_Produk;
import DAO.DAO_Provider;
import DAOImplements.Implement_Kategori;
import DAOImplements.Implement_Produk;
import DAOImplements.Implement_Provider;
import Model.Kategori;
import Model.Produk;
import Model.Provider;
import View.Dialog.Kategori.inputKategori;
import View.Dialog.Produk.inputProduk;
import View.Dialog.Provider.inputProvider;
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public class Control_providerAdd {
  inputProvider v;
  DAO_Provider impl;
  List<Provider> li;
  
  public Control_providerAdd(inputProvider v){
    this.v = v;
    impl = new Implement_Provider();
  }
  
  public void insert(inputProvider d){
    Provider m = new Provider();
    m.setKategori(d.getTxtKategori().getText());
    m.setNama_provider(d.getTxtNama().getText());
    impl.add(m);
  }
}
