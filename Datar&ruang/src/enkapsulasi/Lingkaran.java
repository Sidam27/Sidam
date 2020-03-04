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
public class Lingkaran extends BangunDatar{
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    @Override
    public double keliling() {
        return Math.PI*2*this.r;
    }

    @Override
    public double luas() {
        return Math.PI*this.r*this.r;
    }
    
    
}
