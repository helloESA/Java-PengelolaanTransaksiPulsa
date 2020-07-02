/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Kategori;
import Model.Produk;
import Model.Provider;
import Model.User;
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public interface DAO_Provider {
  
  public List<Provider> getALL();
  public List<Provider> getSearch(String data);
  
  public void add(Provider data);
  public void edit(Provider data);
  public void delete(String data);
}
