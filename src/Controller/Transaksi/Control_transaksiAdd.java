/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Transaksi;

import DAO.DAO_Transaksi;
import DAOImplements.Implement_Transaksi;
import Model.Transaksi;
import View.Dialog.Transaksi.inputTransaksi;
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public class Control_transaksiAdd {
  inputTransaksi v;
  DAO_Transaksi impl;
  List<Transaksi> li;
  
  public Control_transaksiAdd(inputTransaksi v){
    this.v = v;
    impl = new Implement_Transaksi();
  }
  
  public void insert(inputTransaksi d){
    Transaksi m = new Transaksi();
    m.setKategori(d.getTxtKategori().getText());
    m.setProvider(d.getTxtProvider().getText());
    m.setProduk(d.getTxtProduk().getText());
    m.setKeterangan(d.getTxtKeterangan().getText());
    m.setNo_pel(d.getTxtNo_pel().getText());
    m.setHarga(d.getTxtHarga().getText());
    m.setWkt_pesan(d.getTxtWaktu().getText());
    m.setStatus(d.getCbStatus().getSelectedItem().toString());
    m.setPembayaran(d.getCbPembayaran().getSelectedItem().toString());
    m.setTgl_bayar(d.getTxtTgl_bayar().getText());
    m.setSn_id(d.getTxtSN_id().getText());
    impl.add(m);
  }
}
