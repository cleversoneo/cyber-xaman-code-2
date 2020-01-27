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
public class Exer28 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o lado 1: ");
        int lado1 = scan.nextInt();
        
        System.out.println("Entre com o lado 2: ");
        int lado2 = scan.nextInt();
        
        System.out.println("Entre com o lado 3: ");
        int lado3 = scan.nextInt();
        
        if (((lado1 + lado2) > lado3) || 
                ((lado1 + lado3) > lado2) || 
                ((lado2 + lado3) > lado1)){
            
            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
                System.out.println("Triangulo Equilatero");
                
            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2){
                System.out.println("Triangulo Escaleno");
                
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Triangulo Isoceles");
            }
            
        } else {
            System.out.println("nao forma um triangulo");
        }
        
        
    }
    
}
