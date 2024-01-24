/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author thaip
 */
public abstract class Number {
    private double a, b;

    public Number() {
    }

    public Number(double a, double b) {
        this.a = a;
        this.b = b;
        
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

   public abstract boolean checkPerfect(Double i);
       
   
    
}
