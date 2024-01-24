/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Quadratic;
import Model.superlative;

import Library.CheckValid;
import View.Menu;

/**
 *
 * @author thaip
 */
public class Main extends Menu<String>{
    private static String[] mc = {"Calculate Superlative Equation", "Calculate Quadratic Equation", "Exit"};
    
    private Quadratic qua = new Quadratic();
    private superlative sup = new superlative();
    public Main(){
        super("========= Equation Program =========", mc);
    }
    public static void main(String[] args) {
        new Main().run();
    }
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:superlative();break;
            case 2:quadratic();break;
            case 3: System.exit(0);
        }
        
    }
    public void superlative(){
        System.out.println("Please input number");
       double a = CheckValid.enterA();
       double b = CheckValid.enterB();
        sup.bacnhat(new superlative(a, b));
    }
    public void quadratic(){
        System.out.println("Please input number");
       double a = CheckValid.enterA();
       double b = CheckValid.enterB();
       double c = CheckValid.enterC();
        qua.quadratic(new Quadratic(a, b, c));
    }     
}
