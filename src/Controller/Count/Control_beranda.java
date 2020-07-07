/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Count;

import DAO.DAO_Count;
import DAOImplements.Implement_Count;
import View.Panel.berandaPanel;

/**
 *
 * @author MohamadEsa
 */
public class Control_beranda {
  berandaPanel view;
  DAO_Count impl;

  public Control_beranda(berandaPanel view) {
    this.view = view;
    impl = new Implement_Count();
  }
  
  public void hitungJumlah(){
    view.getLabelJumlah().setText(String.valueOf(impl.getCountJumlahTransaksi()));
  }
  
  public void hitungSukses(){
    view.getLabelSukses().setText("Rp "+String.valueOf(impl.getCountSukses()));
  }
  
  public void hitungBelum(){
    view.getLabelBelum().setText("Rp "+String.valueOf(impl.getCountBelumBayar()));
  }
  
  public void hitungTotal(){
    view.getLabelGagal().setText("Rp "+String.valueOf(impl.getCountGagal()));
  }
}
