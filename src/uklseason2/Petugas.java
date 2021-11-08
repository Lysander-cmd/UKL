/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklseason2;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Petugas implements User{
    ArrayList <String> namaPetugas = new ArrayList<String>();
    ArrayList <String> alamat = new ArrayList<String>();
    ArrayList <String> telepon = new ArrayList<String>();
    
    public Petugas(){
        this.namaPetugas.add("Yafiq");
        this.alamat.add("Blitar");
        this.telepon.add("0812345678");
    }
    public int getJmlPetugas(){
        return this.namaPetugas.size();
    }

    @Override
    public void setNama(String namaPetugas) {
        this.namaPetugas.add(namaPetugas);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idPetugas) {
        return this.namaPetugas.get(idPetugas);
    }

    @Override
    public String getAlamat(int idPetugas) {
        return this.alamat.get(idPetugas);
    }

    @Override
    public String getTelepon(int idPetugas) {
        return this.telepon.get(idPetugas);
    }
    
}
