/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Kategori;
import Model.Produk;
import Model.Provider;
import Model.Transaksi;
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public interface DAO_Count {
  public List<Transaksi> getCountSukses();
  public List<Transaksi> getCountGagal();
  public List<Transaksi> getCountBelumBayar();
  public List<Transaksi> getCountJumlahTransaksi();
}
