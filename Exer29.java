/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CyberXamanCode2;

import java.util.Scanner;

/**
 *
 * @author Cleverneo / Exercicios Java do canal do Youtube: https://www.youtube.com/user/Loianeg
 */
public class Exer29 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o valor de a: ");
        int a = scan.nextInt();
        System.out.println("Informe o valor de b: ");
        int b = scan.nextInt();
        System.out.println("Informe o valor de c: ");
        int c = scan.nextInt();
        
        
        double delta = ((b * b) - (4*a*c));
        
        System.out.println("Delta> "+ delta);
        
        if(delta < 0){
            System.out.println("A equacao nao possui raizes - DELTA NEGATIVO");
        } else {
            double x1 = ((-b + (Math.sqrt (delta)))  / (2*a) );
            double x2 = ((-b - (Math.sqrt (delta)))  / (2*a) );
            
            System.out.println("x1> "+ x1);
            System.out.println("x2> "+ x2);
        }
        
        
    }
    
}
