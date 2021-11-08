/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklseason2;

/**
 *
 * @author USER
 */
public class Laporan {
    public void laporan(Barang barang){
        int x = barang.getJmlBarang();
        
        
            System.out.println("=========Tabel Barang yang dilelang==========");
            System.out.println("ID \tNama Barang \tHarga \tStatus");
            for (int i = 0; i < x; i++) {
                System.out.println(i+".\t"+barang.getNamaBarang(i)+"\t"+"\t"+"Rp   : "+barang.getHargaAwal(i)+"\t"+barang.getStatus(i));
            }
        
    }
    public void laporan(Masyarakat masyarakat){
        int x = masyarakat.getJmlMasyarakat();
        
        
            System.out.println("=========Tabel Nama Masyarakat==========");
            System.out.println("ID \tNama \tAlamat \tTelepon");
            for (int i = 0; i < x; i++) {
                System.out.println(i+".\t"+masyarakat.getNama(i)+"\t"+masyarakat.getAlamat(i)+"\t"+masyarakat.getTelepon(i));
            }
        
    }
    public void laporan(Petugas petugas){
        int x = petugas.getJmlPetugas();
        
        
            System.out.println("=========Tabel Nama Petugas ==========");
            System.out.println("ID \tNama \tAlamat \tTelepon");
            for (int i = 0; i < x; i++) {
                System.out.println(i+".\t"+petugas.getNama(i)+"\t"+petugas.getAlamat(i)+"\t"+petugas.getTelepon(i));
            }
        
    }
    
}

