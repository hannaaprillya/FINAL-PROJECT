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
public class KeuanganList {
    int pengeluaran,pemasukan, id_keuangan;

    public int getId_keuangan() {
        return id_keuangan;
    }

    public void setId_keuangan(int id_keuangan) {
        this.id_keuangan = id_keuangan;
    }
    
    public KeuanganList(int pengeluaran, int pemasukan, int id_keuangan) {
        this.pengeluaran = pengeluaran;
        this.pemasukan = pemasukan;
        this.id_keuangan = id_keuangan;
    }

    
    
    public int getPengeluaran() {
        return pengeluaran;
    }

    public void setPengeluaran(int pengeluaran) {
        this.pengeluaran = pengeluaran;
    }

    public int getPemasukan() {
        return pemasukan;
    }

    public void setPemasukan(int pemasukan) {
        this.pemasukan = pemasukan;
    }
    
}
