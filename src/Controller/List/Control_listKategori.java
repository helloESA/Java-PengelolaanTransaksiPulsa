/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.List;

import DAO.DAO_Kategori;
import DAOImplements.Implement_Kategori;
import Model.Kategori;
import TableModel.TM_Kategori;
import View.List.listKategori;
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public class Control_listKategori {
  listKategori v;
  DAO_Kategori impl;
  List<Kategori> li;
  
  public Control_listKategori(listKategori v){
    this.v=v;
    impl = new Implement_Kategori();
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
}
