/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.List;

import DAO.DAO_Provider;
import DAOImplements.Implement_Provider;
import Model.Provider;
import TableModel.TM_Provider;
import View.List.listProvider;
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public class Control_listProvider {
  listProvider v;
  DAO_Provider impl;
  List<Provider> li;
  
  public Control_listProvider(listProvider v){
    this.v=v;
    impl = new Implement_Provider();
  }
  
  public void isiTable(){
    li = impl.getALL();
    TM_Provider tabel = new TM_Provider(li);
    v.getTabelListProvider().setModel(tabel);
  }
   
   public void isiTableCari(){
        li = impl.getSearch(v.getTxtCari().getText());
        TM_Provider table = new TM_Provider(li);
        v.getTabelListProvider().setModel(table);
    }
    
    public void search(listProvider data){
        if(!data.getTxtCari().getText().isEmpty()){
            impl.getSearch(v.getTxtCari().getText());
            isiTableCari();
        } else{
            isiTable();
        }
    }
}
