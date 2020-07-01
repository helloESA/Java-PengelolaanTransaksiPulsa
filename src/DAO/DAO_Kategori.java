/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Kategori;
import Model.User;
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public interface DAO_Kategori {
  
  public List<Kategori> getALL();
  public List<Kategori> getSearch(String data);
  
  public void add(Kategori data);
  public void edit(Kategori data);
  public void delete(String data);
}
