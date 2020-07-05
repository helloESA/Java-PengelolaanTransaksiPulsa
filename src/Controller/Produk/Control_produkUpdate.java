/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Produk;

import Controller.User.*;
import DAO.DAO_Kategori;
import DAO.DAO_Produk;
import DAO.DAO_User;
import DAOImplements.Implement_Kategori;
import DAOImplements.Implement_Produk;
import DAOImplements.Implement_User;
import Model.Kategori;
import Model.Produk;
import Model.User;
import View.Dialog.Kategori.updateKategori;
import View.Dialog.Produk.updateProduk;
import View.Dialog.User.updatePengguna;
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public class Control_produkUpdate {
  updateProduk v;
  DAO_Produk impl;
  List<Produk> li;
  
  public Control_produkUpdate(updateProduk v){
    this.v = v;
    impl = new Implement_Produk();
  }
  
  public void update(updateProduk d){
    Produk m = new Produk();
    m.setId(d.getTxtID().getText());
    m.setKategori(d.getTxtKategori().getText());
    m.setProvider(d.getTxtProvider().getText());
    m.setNama_produk(d.getTxtNama().getText());
    m.setKeterangan(d.getTxtKeterangan().getText());
    m.setHarga(d.getTxtHarga().getText());
    impl.edit(m);
  }
}
