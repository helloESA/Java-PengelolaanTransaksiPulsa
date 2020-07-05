/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.List;

import DAO.DAO_Kategori;
import DAO.DAO_Provider;
import DAO.DAO_Transaksi;
import DAOImplements.Implement_Kategori;
import DAOImplements.Implement_Transaksi;
import Model.Kategori;
import Model.Provider;
import TableModel.TM_Kategori;
import TableModel.TM_Provider;
import View.List.listKategori;
import View.List.listKategoriProduk;
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public class Control_listKategoriProduk {
  listKategoriProduk v;
  DAO_Kategori impl;
  DAO_Transaksi impl2;
  List<Kategori> li;
  List<Provider> li2;
  
  public Control_listKategoriProduk(listKategoriProduk v){
    this.v=v;
    impl = new Implement_Kategori();
    impl2 = new Implement_Transaksi();
  }
  
  
  
   public void isiTable(){
    li = impl.getALL();
    TM_Kategori tabel = new TM_Kategori(li);
    v.getTabelListKategori().setModel(tabel);
  }
   
   public void isiTableCari(){
        li = impl.getSearch(v.getTxtCari().getText());
        TM_Kategori table = new TM_Kategori(li);
        v.getTabelListKategori().setModel(table);
    }
    
    public void search(listKategoriProduk data){
        if(!data.getTxtCari().getText().isEmpty()){
            impl.getSearch(v.getTxtCari().getText());
            isiTableCari();
        } else{
            isiTable();
        }
    }
    
    
}
