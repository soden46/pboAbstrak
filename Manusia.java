/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamodel;

/**
 *
 * @author SYARIF
 */
public abstract class Manusia {
    private String nama;
    private Double tinggibadan;
    
    public Manusia(String nama, Double tinggibadan){
        this.nama=nama;
        this.tinggibadan=tinggibadan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Double getTinggibadan() {
        return tinggibadan;
    }

    public void setTinggibadan(Double tinggibadan) {
        this.tinggibadan = tinggibadan;
    }
    public abstract Double hitungbb();
    
}
