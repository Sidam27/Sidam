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
public class PersegiPanjang extends BangunDatar{
    private double panjang,lebar;

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    public double luas(){
        return this.panjang*this.lebar;
    }
    
    public double keliling(){
        return this.panjang*2 + this.lebar*2;
    }
}
