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
public class Exer17 {
    
    public static void main (String [] args){
        
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Entre com uma letra (M ou F): ");
    
    String input = scan.next();
    
    if(input.equalsIgnoreCase("M")){
        System.out.println("M - Masculino");
    }
    else if(input.equalsIgnoreCase("F")){
        System.out.println("F - Feminino");
    }
    else{
        System.out.println("Sexo inválido");
    }
   
    
    }
    
}
