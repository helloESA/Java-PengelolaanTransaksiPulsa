/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Produk;

import DAO.DAO_Kategori;
import DAO.DAO_Produk;
import DAOImplements.Implement_Kategori;
import DAOImplements.Implement_Produk;
import Model.Kategori;
import Model.Produk;
import View.Dialog.Kategori.inputKategori;
import View.Dialog.Produk.inputProduk;
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public class Control_produkAdd {
  inputProduk v;
  DAO_Produk impl;
  List<Produk> li;
  
  public Control_produkAdd(inputProduk v){
    this.v = v;
    impl = new Implement_Produk();
  }
  
  public void insert(inputProduk d){
    Produk m = new Produk();
    m.setKategori(d.getTxtKategori().getText());
    m.setProvider(d.getTxtProvider().getText());
    m.setNama_produk(d.getTxtNama().getText());
    m.setKeterangan(d.getTxtKeterangan().getText());
    m.setHarga(d.getTxtHarga().getText());
    impl.add(m);
  }
}
