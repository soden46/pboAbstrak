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
public final class Perempuan extends Manusia{

    public Perempuan(String nama, Double tinggibadan) {
        super(nama, tinggibadan);
    }
    
    @Override
    public Double hitungbb() {
        return (super.getTinggibadan()-100)*0.9;
    }
    
}
