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
public class Exer19 {
    
    
        public static void main (String [] args){
        
    Scanner scan = new Scanner(System.in);
    
    double nota1;
    double nota2;
    
    System.out.println("Informe a primeira nota: ");
    nota1 = scan.nextDouble();
    
    System.out.println("Informe a segunda nota: ");
    nota2 = scan.nextDouble();
    
    double media = (nota1 + nota2) / 2;
    
    
    if (media ==10){
        System.out.println("Aprovado com distinção ");
            } 
    else if(media >= 7){
        System.out.println("Aprovado ");
    }
    else{
        System.out.println("Reprovado ");
    }
   
    
    }
    
}
    
