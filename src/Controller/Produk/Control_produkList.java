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
import TableModel.TM_Kategori;
import TableModel.TM_Produk;
import TableModel.TM_User;
import View.Panel.kategoriPanel;
import View.Panel.produkPanel;
import View.Panel.userPanel;
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public class Control_produkList {
  produkPanel v;
  DAO_Produk impl;
  List<Produk> li;
  
  public Control_produkList(produkPanel v){
    this.v = v;
    impl = new Implement_Produk();
  }
  
  public void isiTable(){
    li = impl.getALL();
    TM_Produk tabel = new TM_Produk(li);
    v.getTabelDataProduk().setModel(tabel);
  }
  
  public void delete(String kode){
    impl.delete(kode);
  }
  
  public void isiTableCari(){
        li = impl.getSearch(v.getTxtCari().getText());
        TM_Produk table = new TM_Produk(li);
        v.getTabelDataProduk().setModel(table);
    }
    
    public void search(produkPanel data){
        if(!data.getTxtCari().getText().isEmpty()){
            impl.getSearch(v.getTxtCari().getText());
            isiTableCari();
        } else{
            isiTable();
        }
    }
}
