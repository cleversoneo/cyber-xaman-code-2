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
public class Exer20 {
    
    public static void main (String [] args){
        
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Entre com o primeiro numero: ");
    int num1 = scan.nextInt();
    System.out.println("Entre com o segundo numero: ");
    int num2 = scan.nextInt();
    System.out.println("Entre com o terceiro numero: ");
    int num3 = scan.nextInt();
    
    if (num1 >= num2 && num1>= num3){
       System.out.println("O numero 1 é maior: " + num1);
    }
    
    else if(num2 >=num1 && num2>=num3){ 
        System.out.println("O numero 2 é maior: " + num2);
    }
    
    else if (num3 >=num1 && num3 >=num2){
        System.out.println("O numero 3 é maior: " + num3);
    }
    
    
    
    if (num1 <= num2 && num1<= num3){
       System.out.println("O numero 1 é menor: " + num1);
    }
    
    else if(num2 <=num1 && num2<=num3){ 
        System.out.println("O numero 2 é menor: " + num2);
    }
    
    else if (num3 <=num1 && num3 <=num2){
        System.out.println("O numero 3 é menor: " + num3);
    }
    
    
    }
}
