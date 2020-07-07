/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.List;

import DAO.DAO_Produk;
import DAOImplements.Implement_Produk;
import Model.Produk;
import TableModel.TM_Produk;
import View.Dialog.listProduktoExport;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author MohamadEsa
 */
public class Control_listProduktoExport {
  listProduktoExport v;
  DAO_Produk impl;
  List<Produk> li;

  public Control_listProduktoExport(listProduktoExport v) {
    this.v = v;
    impl = new Implement_Produk();
  }
  
  public void isiTable(){
    li = impl.getALL();
    TM_Produk tabel = new TM_Produk(li);
    v.getTabelListProduk().setModel(tabel);
  }
  
  public void exportToXLS(){
    li = impl.getALL();
    FileWriter fw;
    
    //menampilkan file chooser
    JFileChooser choose = new JFileChooser();
    choose.setCurrentDirectory(new File("[B]export_output/excel[/B]"));
    int retrival = choose.showSaveDialog(null);
    if(retrival == JFileChooser.APPROVE_OPTION){
      try {
        TM_Produk tabel = new TM_Produk(li);
        fw = new FileWriter(new File(choose.getSelectedFile()+".xls"));
        
      //write header
        for(int i=0; i< tabel.getColumnCount();i++){
          fw.write(tabel.getColumnName(i).toUpperCase()+"\t");
        } 
        fw.write("\n");
        
      //write record  
        for(int i=0; i < tabel.getRowCount(); i++){
          for(int j=0; j < tabel.getColumnCount(); j++){
            fw.write(tabel.getValueAt(i, j).toString()+"\t");
          }
          fw.write("\n");
        }
        JOptionPane.showMessageDialog(null, "Data Berhasil Diekspor", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        
        fw.close();
      } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "[500] Data Gagal Diekspor", "Perhatian", JOptionPane.ERROR_MESSAGE);
        System.out.println("[500] Pesan Error : "+e);
      }
    }
  }
  
}
