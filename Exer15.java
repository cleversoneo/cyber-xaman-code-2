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
public class Exer15 {
    
    public static void main (String [] args){
        
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Entre com o primeiro numero: ");
    int number1 = scan.nextInt();
    
    System.out.println("Entre com o segundo numero: ");
    int number2 = scan.nextInt();
    
    if(number1 > number2){
        System.out.println("Number1 é maior: " + number1);
    }
    else
    {
        System.out.println("Number2 é maior: " + number2);
    }
    
    }
    
}
