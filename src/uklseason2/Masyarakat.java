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
public class Masyarakat implements User{
   ArrayList <String> namaMasyarakat = new ArrayList<String>();
    ArrayList <String> alamat = new ArrayList<String>();
    ArrayList <String> telepon = new ArrayList<String>();
    
    public Masyarakat(){
        this.namaMasyarakat.add("Adam");
        this.alamat.add("Blitar");
        this.telepon.add("0812345678");
        
        this.namaMasyarakat.add("Budi");
        this.alamat.add("Kediri");
        this.telepon.add("0812345678");
        
        this.namaMasyarakat.add("Joko");
        this.alamat.add("Kediri");
        this.telepon.add("0812345678");
    }
    public int getJmlMasyarakat(){
        return this.namaMasyarakat.size();
    }

    @Override
    public void setNama(String namaMasyarakat) {
        this.namaMasyarakat.add(namaMasyarakat);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.alamat.add(telepon);
    }

    @Override
    public String getNama(int idMasyarakat) {
        return this.namaMasyarakat.get(idMasyarakat);
    }

    @Override
    public String getAlamat(int idMasyarakat) {
       return this.alamat.get(idMasyarakat);
    }

    @Override
    public String getTelepon(int idMasyarakat) {
       return this.telepon.get(idMasyarakat);
    }
    
}
