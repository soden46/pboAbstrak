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
// final digunakan agar kelas laki-laki tidak dapat diturunkan
public final class LakiLaki extends Manusia{
    
   public LakiLaki(String nama, Double tinggibadan){
       super(nama, tinggibadan);
   }

    @Override
    public Double hitungbb() {
    return (super.getTinggibadan()-100)*0.8;
    
    }
}
