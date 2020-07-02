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
public class UserSession {
  private static String id, nama, username, password;

  public static String getId() {
    return id;
  }

  public static void setId(String id) {
    UserSession.id = id;
  }

  public static String getNama() {
    return nama;
  }

  public static void setNama(String nama) {
    UserSession.nama = nama;
  }

  public static String getUsername() {
    return username;
  }

  public static void setUsername(String username) {
    UserSession.username = username;
  }

  public static String getPassword() {
    return password;
  }

  public static void setPassword(String password) {
    UserSession.password = password;
  }

 
}
