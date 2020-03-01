/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

/**
 *
 * @author Lab Informatika
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kubus b = new Kubus();
        Silinder s = new Silinder();
        Balok bl = new Balok();
        Segitiga s3 = new Segitiga();
        b.setSisi(5);
        System.out.println("Persegi");
        System.out.println("L = "+b.luas());
        System.out.println("K = "+b.keliling());
        System.out.println("V = "+b.volume());
        s.setR(7);
        s.setTinggi(14);
        System.out.println("lingkaran");
        System.out.println("L = "+s.luas());
        System.out.println("K = "+s.keliling());
        System.out.println("V = "+s.volume());
        bl.setLebar(5);
        bl.setPanjang(7);
        bl.setTinggi(3);
        System.out.println("Persegi Panjang");
        System.out.println("L = "+bl.luas());
        System.out.println("K = "+bl.keliling());
        System.out.println("V = "+bl.volume());
        s3.setAlas(4);
        s3.setTinggi(3);
        System.out.println("Segitiga");
        System.out.println("L = "+s3.luas());
        System.out.println("K = "+s3.keliling());
    }
    
}
