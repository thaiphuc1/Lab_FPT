/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import View.Menu;
import java.util.InputMismatchException;
import java.util.List;
/**
 *
 * @author thaip
 */
public class CheckValid {
    public static double enterA() {
         while (true) {
            try {
                double a = Double.parseDouble(Menu.getString("Enter A : "));
                return a;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Not a number. Please try again!");
                
            }
        }
    }
    public static double enterB() {
         while (true) {
            try {
                double b = Double.parseDouble(Menu.getString("Enter B : "));
                return b;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Not a number. Please try again!");
                
            }
        }
    }
    public static double enterC() {
         while (true) {
            try {
                double c = Double.parseDouble(Menu.getString("Enter C : "));
                return c;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Not a number. Please try again!");
                
            }
        }
    }
    public static String display(List<Double> a){
        StringBuilder result = new StringBuilder();
        for (Double k : a) {
            result.append(k)
                  .append(", ");
        }
        if (result.length() > 1) {
            result.setLength(result.length() - 2); 
        }
        return result.toString();
    }
}
