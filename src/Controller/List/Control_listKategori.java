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
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public class Control_listKategori {
  listKategori v;
  DAO_Kategori impl;
  DAO_Transaksi impl2;
  List<Kategori> li;
  List<Provider> li2;
  
  public Control_listKategori(listKategori v){
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
    
    public void search(listKategori data){
        if(!data.getTxtCari().getText().isEmpty()){
            impl.getSearch(v.getTxtCari().getText());
            isiTableCari();
        } else{
            isiTable();
        }
    }
    
    public void isiTableFromKategori(String data){
     
//     System.out.println("Cek "+data);
        li2 = impl2.getSearchFromKategori(data);
        TM_Provider table = new TM_Provider(li2);
        v.getTabelListKategori().setModel(table);
    }
    
    public void search2(listKategori data, String get){
        if(!data.getTxtCari().getText().isEmpty()){
            impl.getSearch(v.getTxtCari().getText());
            isiTableFromKategori(get);
        } else{
            isiTable();
        }
    }
}
