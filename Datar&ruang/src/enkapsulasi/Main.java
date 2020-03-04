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
        Kubus k= new Kubus();
        Silinder s = new Silinder();
        Balok b = new Balok();
        Segitiga s3 = new Segitiga();
        k.setSisi(7);
        System.out.println("Persegi");
        System.out.println("L = "+k.luas());
        System.out.println("K = "+k.keliling());
        System.out.println("Kubus");
        System.out.println("V = "+k.volume());
        s.setR(7);
        s.setTinggi(21);
        System.out.println("lingkaran");
        System.out.println("L = "+s.luas());
        System.out.println("K = "+s.keliling());
        System.out.println("Silinder");
        System.out.println("V = "+s.volume());
        b.setLebar(3);
        b.setPanjang(4);
        b.setTinggi(5);
        System.out.println("Persegi Panjang");
        System.out.println("L = "+b.luas());
        System.out.println("K = "+b.keliling());
        System.out.println("Balok");
        System.out.println("V = "+b.volume());
        s3.setAlas(6);
        s3.setTinggi(4);
        System.out.println("Segitiga");
        System.out.println("L = "+s3.luas());
        System.out.println("K = "+s3.keliling());
    }
    
}
