/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

/**
 *
 * @author MohamadEsa
 */
public interface Config {
    String user = "root";
    String pass = "";
    String driver = "com.mysql.jdbc.Driver";
    String link = "jdbc:mysql://localhost:3306/mpt_pulsa";
    String db_name = "mpt_pulsa";
    
    String versi = "1.1.6";
    String project_name = "Pengelolaan Transaksi Pulsa";
    
    String inputProduk = "Input Produk";
    String inputKategori = "Input Kategori";
    String inputPengguna = "Input Pengguna";
    String inputProvider = "Input Provider";
    String inputTransaksi = "Input Produk";
    
    String updateProduk = "Update Data Produk";
    String updateKategori = "Update Data Kategori";
    String updatePengguna = "Update Data Pengguna";
    String updateProvider = "Update Data Provider";
    String updateTransaksi = "Update Data Produk";
    
    String listProduk = "Cari Data Produk";
    String listKategori = "Cari Data Kategori";
    String listProvider = "Cari Data Provider";
}
