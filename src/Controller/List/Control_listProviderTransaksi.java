/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.List;

import DAO.DAO_Provider;
import DAO.DAO_Transaksi;
import DAOImplements.Implement_Provider;
import DAOImplements.Implement_Transaksi;
import Model.Provider;
import TableModel.TM_Provider;
import View.Dialog.Transaksi.inputTransaksi;
import View.List.listProvider;
import View.List.listProviderTransaksi;
import View.Panel.transaksiPanel;
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public class Control_listProviderTransaksi {
  listProviderTransaksi v;
  transaksiPanel view;
  DAO_Provider impl;
  DAO_Transaksi impl2;
  List<Provider> li;
  
  public Control_listProviderTransaksi(listProviderTransaksi v){
    this.v=v;
    impl = new Implement_Provider();
    impl2 = new Implement_Transaksi();
  }
   
   public void isiTableCari(){
        li = impl.getSearch(v.getTxtCari().getText());
        TM_Provider table = new TM_Provider(li);
        v.getTabelListProvider().setModel(table);
    }
   
   public void isiTableFromKategori(String data){
     
//     System.out.println("Cek "+data);
        li = impl2.getSearchFromKategori(data);
        TM_Provider table = new TM_Provider(li);
        v.getTabelListProvider().setModel(table);
    }
    
    public void search(listProviderTransaksi data, String data2){
        if(!data.getTxtCari().getText().isEmpty()){
            impl.getSearch(v.getTxtCari().getText());
            isiTableCari();
        } else{
            isiTableFromKategori(data2);
        }
    }
    
    
}
