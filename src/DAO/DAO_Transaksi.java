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
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public interface DAO_Transaksi {
  public List<Transaksi> getALL();
  public List<Transaksi> getSearch(String data);
//  public List<Provider> getSearchProduk(String data);
//  public List<Kategori> getSearchKategori(String data);
  
  public void add(Transaksi data);
  public void edit(Transaksi data);
  public void delete(String data);
}
