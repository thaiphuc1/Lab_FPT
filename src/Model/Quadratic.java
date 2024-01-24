/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Library.CheckValid;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thaip
 */
public class Quadratic extends Number{
    private double c;

    public Quadratic() {
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    
    public Quadratic(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }
    public  void quadratic (Quadratic k){
        double x1 = 0;
        double x2 = 0;
        double delta = Math.pow(k.getB(), 2) - 4 * k.getA() * k.getC();
        if(delta < 0){
            System.out.println("No solution!");
        }else if(delta == 0) {
            x1 = x2 = -(k.getB())/(2*k.getA());
        }
        else {
            x1 = (-(k.getB()) + Math.sqrt(delta))/2* k.getA();
             x2 = (-(k.getB()) - Math.sqrt(delta))/2* k.getA();
        }
        List<Double> chan = new ArrayList<>();
        List<Double> le = new ArrayList<>();
        List<Double> per = new ArrayList<>();
        List<Double> arr = new ArrayList<>();
        arr.add(k.getA());
        arr.add(k.getB());
        arr.add(k.getC());
        arr.add(x1);
        arr.add(x2);
        System.out.println("Solution: x1 = " + x1 + " and x2 = " + x2);
        for (Double i : arr) {
            if(i % 2 == 0){
                chan.add(i);
            }
            else if(i % 2 != 0){
                le.add(i);
            }
            if(checkPerfect(i)){
                per.add(i);
            }
        }
        System.out.println("Number is even : " + CheckValid.display(chan));
        System.out.println("Number is odd : " + CheckValid.display(le));
        System.out.println("Number is perfect number : " + CheckValid.display(per));
    }

    @Override
    public boolean checkPerfect(Double i) {
        double result = Math.sqrt(i);
        if((result - Math.floor(result) == 0)){
            return true;
        }
        return false;    }
}
