
import View.Dialog.SplashScreen;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MohamadEsa
 */
public class manajementransaksi {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        new SplashScreen().setVisible(true);
      }
    });
  }
  }