/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Laporan;

import Config.DBUtilities;
import java.io.File;
import java.sql.Connection;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author MohamadEsa
 */
public class Control_laporan {
  Connection koneksi;
  
  public void LapRekap(){
    try {
      koneksi = DBUtilities.config();
      
      JasperPrint jprint = JasperFillManager.fillReport(getClass().getResourceAsStream("/Report/RekapLaporan.jasper"), null, koneksi);
      JasperViewer.viewReport(jprint, false);
    } catch (JRException e) {
      JOptionPane.showMessageDialog(null, "[400] Tidak Dapat Mencetak","Error",JOptionPane.ERROR_MESSAGE);
      System.out.println("[400] Kode Error : "+e);
    }
  }
}
