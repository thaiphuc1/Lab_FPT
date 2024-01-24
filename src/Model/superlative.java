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
public class superlative extends Number{

    public superlative() {
    }

    public superlative(double a, double b) {
        super(a, b);
    }
   
    public void bacnhat(superlative k){
        double result = 0;
            if(k.getA() == 0) {
                if(k.getB() == 0){
                    System.out.println("Phuong trinh nghiem dung voi moi x ⋲ R");
                }
                else if(k.getB() != 0){
                    System.out.println("No solution!");
                }
            }
            else if( k.getA() != 0){
                if(k.getB() == 0){
                    System.out.println("No solution!");
                }else{
                   result = -(k.getB()) / k.getA();
                    System.out.println("Solution: x = " + result);
                }
            }
        List<Double> chan = new ArrayList<>();
        List<Double> le = new ArrayList<>();
        List<Double> per = new ArrayList<>();
        List<Double> list = new ArrayList<>();
        list.add(k.getA());
        list.add(k.getB());
        list.add(result);
        for (Double i : list) {
            if(i % 2 == 0){
                chan.add(i);
            }
            else{
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

