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
import TableModel.TM_Kategori;
import TableModel.TM_User;
import View.Panel.kategoriPanel;
import View.Panel.userPanel;
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public class Control_kategoriList {
  kategoriPanel v;
  DAO_Kategori impl;
  List<Kategori> li;
  
  public Control_kategoriList(kategoriPanel v){
    this.v = v;
    impl = new Implement_Kategori();
  }
  
  public void isiTable(){
    li = impl.getALL();
    TM_Kategori tabel = new TM_Kategori(li);
    v.getTabelDataKategori().setModel(tabel);
  }
  
  public void delete(String kode){
    impl.delete(kode);
  }
  
  public void isiTableCari(){
        li = impl.getSearch(v.getTxtCari().getText());
        TM_Kategori table = new TM_Kategori(li);
        v.getTabelDataKategori().setModel(table);
    }
    
    public void search(kategoriPanel data){
        if(!data.getTxtCari().getText().isEmpty()){
            impl.getSearch(v.getTxtCari().getText());
            isiTableCari();
        } else{
            isiTable();
        }
    }
}
