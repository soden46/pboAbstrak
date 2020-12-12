/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoabstrak;

import datamodel.LakiLaki;
import datamodel.Manusia;
import datamodel.Perempuan;

/**
 *
 * @author SYARIF
 */
public class Main {
    //membuat variabel objek refference untuk kelas manusia
    static Manusia manusia;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ilegal statement -> manusia = new Manusia();
        
        //membuat kelas untuk objek Laki-laki dan Perempuan
        LakiLaki laki=new LakiLaki("syarif", 165.0);
        Perempuan perempuan=new Perempuan("ell", 151.0);
        
        System.out.println("Nama = " +laki.getNama());
        System.out.println("Tinggi Badan = "+laki.getTinggibadan() + "cm");
        System.out.println("Berat Badan Ideal = " +laki.hitungbb() + "kg");
        
        System.out.println("======================================");
        
        System.out.println("Nama = " +perempuan.getNama());
        System.out.println("Tinggi Badan = "+perempuan.getTinggibadan() + "cm");
        System.out.println("Berat Badan Ideal = " +perempuan.hitungbb() + "kg");
    }
    
}
