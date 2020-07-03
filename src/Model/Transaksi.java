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
public class Transaksi {
  String id, kategori, provider, produk, keterangan, no_pel, harga, wkt_pesan, status, pembayaran, tgl_bayar, sn_id;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getKategori() {
    return kategori;
  }

  public void setKategori(String kategori) {
    this.kategori = kategori;
  }

  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  
  public String getProduk() {
    return produk;
  }

  public void setProduk(String produk) {
    this.produk = produk;
  }

  public String getKeterangan() {
    return keterangan;
  }

  public void setKeterangan(String keterangan) {
    this.keterangan = keterangan;
  }

  public String getNo_pel() {
    return no_pel;
  }

  public void setNo_pel(String no_pel) {
    this.no_pel = no_pel;
  }

  public String getHarga() {
    return harga;
  }

  public void setHarga(String harga) {
    this.harga = harga;
  }

  public String getWkt_pesan() {
    return wkt_pesan;
  }

  public void setWkt_pesan(String wkt_pesan) {
    this.wkt_pesan = wkt_pesan;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getPembayaran() {
    return pembayaran;
  }

  public void setPembayaran(String pembayaran) {
    this.pembayaran = pembayaran;
  }

  public String getTgl_bayar() {
    return tgl_bayar;
  }

  public void setTgl_bayar(String tgl_bayar) {
    this.tgl_bayar = tgl_bayar;
  }

  public String getSn_id() {
    return sn_id;
  }

  public void setSn_id(String sn_id) {
    this.sn_id = sn_id;
  }
  
}
