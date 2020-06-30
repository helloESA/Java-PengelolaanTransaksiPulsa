/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.User;
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public interface DAO_User {
  
  public List<User> getALL();
  public List<User> getLogin(String username, String password);
  public List<User> getSearch(String data);
  
  public void add(User data);
  public void edit(User data);
  public void delete(String data);
}
