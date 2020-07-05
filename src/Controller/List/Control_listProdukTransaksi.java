/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.List;

import DAO.DAO_Produk;
import DAO.DAO_Transaksi;
import DAOImplements.Implement_Produk;
import DAOImplements.Implement_Transaksi;
import Model.Produk;
import TableModel.TM_Produk;
import View.List.listProdukTransaksi;
import View.List.listProviderTransaksi;
import View.Panel.transaksiPanel;
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public class Control_listProdukTransaksi {
  listProdukTransaksi v;
  transaksiPanel view;
  DAO_Produk impl;
  DAO_Transaksi impl2;
  List<Produk> li;

  public Control_listProdukTransaksi(listProdukTransaksi v) {
    this.v = v;
    impl = new Implement_Produk();
    impl2 = new Implement_Transaksi();
  }
  
  public void isiTableCari(){
        li = impl.getSearch(v.getTxtCari().getText());
        TM_Produk table = new TM_Produk(li);
        v.getTabelListProduk().setModel(table);
    }
   
   public void isiTableFromProvider(String data, String data1){
     
//     System.out.println("Cek "+data);
        li = impl2.getSearchFromProvider(data, data1);
        TM_Produk table = new TM_Produk(li);
        v.getTabelListProduk().setModel(table);
    }
    
    public void search(listProdukTransaksi data, String data2, String data3){
        if(!data.getTxtCari().getText().isEmpty()){
            impl.getSearch(v.getTxtCari().getText());
            isiTableCari();
        } else{
            isiTableFromProvider(data2, data3);
        }
    }
  
}
