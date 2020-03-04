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
public class Persegi extends BangunDatar{
    private double sisi;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    public double luas(){
        return this.sisi*this.sisi;
    }
    
    public double keliling(){
        return this.sisi*4;
    }
}
