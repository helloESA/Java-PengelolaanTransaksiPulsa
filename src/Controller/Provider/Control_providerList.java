/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Provider;

import DAO.DAO_Produk;
import DAO.DAO_Provider;
import DAOImplements.Implement_Produk;
import DAOImplements.Implement_Provider;
import Model.Produk;
import Model.Provider;
import TableModel.TM_Produk;
import TableModel.TM_Provider;
import View.Panel.produkPanel;
import View.Panel.providerPanel;
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public class Control_providerList {
  providerPanel v;
  DAO_Provider impl;
  List<Provider> li;
  
  public Control_providerList(providerPanel v){
    this.v = v;
    impl = new Implement_Provider();
  }
  
  public void isiTable(){
    li = impl.getALL();
    TM_Provider tabel = new TM_Provider(li);
    v.getTabelDataProvider().setModel(tabel);
  }
  
  public void delete(String kode){
    impl.delete(kode);
  }
  
  public void isiTableCari(){
        li = impl.getSearch(v.getTxtCari().getText());
        TM_Provider table = new TM_Provider(li);
        v.getTabelDataProvider().setModel(table);
    }
    
    public void search(providerPanel data){
        if(!data.getTxtCari().getText().isEmpty()){
            impl.getSearch(v.getTxtCari().getText());
            isiTableCari();
        } else{
            isiTable();
        }
    }
}
