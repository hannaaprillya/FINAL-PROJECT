/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author ACER
 */
public class BarangList {
    int id_barang, harga, stok;
    String nama_barang, jenis_barang;

    public BarangList(int id_barang, int harga, int stok, String nama_barang, String jenis_barang) {
        this.id_barang = id_barang;
        this.harga = harga;
        this.stok = stok;
        this.nama_barang = nama_barang;
        this.jenis_barang = jenis_barang;
    }

    public int getId_barang() {
        return id_barang;
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getJenis_barang() {
        return jenis_barang;
    }

    public void setJenis_barang(String jenis_barang) {
        this.jenis_barang = jenis_barang;
    }
    
    
}
