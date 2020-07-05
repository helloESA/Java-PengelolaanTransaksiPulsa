/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Kategori;
import Model.Produk;
import Model.Provider;
import Model.Transaksi;
import View.Dialog.Transaksi.inputTransaksi;
import View.List.listProviderTransaksi;
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public interface DAO_Transaksi {
  public List<Transaksi> getALL();
  public List<Transaksi> getSearch(String data);
  public List<Produk> getSearchFromProvider(String data, String data1);
  public List<Provider> getSearchFromKategori(String kateg);
  
  public void add(Transaksi data);
  public void edit(Transaksi data);
  public void delete(String data);
}
