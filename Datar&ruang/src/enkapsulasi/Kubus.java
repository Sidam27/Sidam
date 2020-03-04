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
public class Kubus extends Persegi {
    public double volume(){
        return Math.pow(super.getSisi(),3);
    }
}
