/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Kategori;

import DAO.DAO_Kategori;
import DAOImplements.Implement_Kategori;
import Model.Kategori;
import View.Dialog.Kategori.inputKategori;
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public class Control_kategoriAdd {
  inputKategori v;
  DAO_Kategori impl;
  List<Kategori> li;
  
  public Control_kategoriAdd(inputKategori v){
    this.v = v;
    impl = new Implement_Kategori();
  }
  
  public void insert(inputKategori d){
    Kategori m = new Kategori();
    m.setKategori(d.getTxtKategori().getText());
    impl.add(m);
  }
}
