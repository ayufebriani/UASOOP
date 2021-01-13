package nomor2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * B @author ASUS
 */
public class main {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bangundatar bd = new bangundatar();
        bd.HitungLuas();
        bd.HitungKeliling();
        System.out.println("NIM SAYA 201969040012");
        System.out.println("==========================");
        System.out.println("===> LUAS DAN KELILING SEGITIGA <====");
        
    Segitiga st = new Segitiga();
    st.HitungLuas();
        System.out.println("===========");
        st.HitungKeliling();
        
        System.out.println("=======================");
        System.out.println("========================");
        System.out.println("=========================");
        
        
        System.out.println("LUAS DAN KELILING PERSEGI");
        Persegi kotak = new Persegi();
        kotak.HitungLuas();
        System.out.println("===================");
        kotak.HitungKeliling();
        
        System.out.println("============");
        System.out.println("=============");
        System.out.println("===============");
        

        System.out.println("Luas Dan Keliling LIngkaran");
        Lingkaran Bundar = new Lingkaran();
        Bundar.HitungLuas();
        System.out.println("=================");
        Bundar.HitungKeliling();
        


    }
}  