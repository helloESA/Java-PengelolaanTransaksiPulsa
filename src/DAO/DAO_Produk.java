/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Kategori;
import Model.Produk;
import Model.User;
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public interface DAO_Produk {
  
  public List<Produk> getALL();
  public List<Produk> getSearch(String data);
  
  public void add(Produk data);
  public void edit(Produk data);
  public void delete(String data);
}
