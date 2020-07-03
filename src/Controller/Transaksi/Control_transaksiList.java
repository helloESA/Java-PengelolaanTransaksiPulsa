/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Provider;

import DAO.DAO_Transaksi;
import DAOImplements.Implement_Transaksi;
import Model.Transaksi;
import TableModel.TM_Transaksi;
import View.Panel.providerPanel;
import View.Panel.transaksiPanel;
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public class Control_transaksiList {
  transaksiPanel v;
  DAO_Transaksi impl;
  List<Transaksi> li;
  
  public Control_transaksiList(transaksiPanel v){
    this.v = v;
    impl = new Implement_Transaksi();
  }
  
  public void isiTable(){
    li = impl.getALL();
    TM_Transaksi tabel = new TM_Transaksi(li);
    v.getTabelDataTransaksi().setModel(tabel);
  }
  
  public void delete(String kode){
    impl.delete(kode);
  }
  
  public void isiTableCari(){
        li = impl.getSearch(v.getTxtCari().getText());
        TM_Transaksi table = new TM_Transaksi(li);
        v.getTabelDataTransaksi().setModel(table);
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
