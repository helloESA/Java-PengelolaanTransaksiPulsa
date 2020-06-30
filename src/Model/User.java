/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author MohamadEsa
 */
public class User {
  private static String id, nama, username, password;

  public static String getId() {
    return id;
  }

  public static void setId(String id) {
    User.id = id;
  }

  public static String getNama() {
    return nama;
  }

  public static void setNama(String nama) {
    User.nama = nama;
  }

  public static String getUsername() {
    return username;
  }

  public static void setUsername(String username) {
    User.username = username;
  }

  public static String getPassword() {
    return password;
  }

  public static void setPassword(String password) {
    User.password = password;
  }

  
}
