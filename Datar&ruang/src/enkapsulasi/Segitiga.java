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
public class Segitiga extends BangunDatar{
    private double alas,tinggi;

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public double luas(){
        return 0.5*this.alas*this.tinggi;
    }
    
    public double keliling(){
        return this.alas+2*(Math.sqrt(Math.pow(this.alas/2,2)+Math.pow(this.tinggi,2)));
    }
}
