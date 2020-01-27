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
public class Exer18 {
    
    public static void main (String [] args){
        
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Entre com uma letra: ");
    String letra = scan.next();
    
    /*if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") 
            || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
            letra.equalsIgnoreCase("u")){
        System.out.println("VOGAL! ");
    }
    else{
        System.out.println("CONSOANTE! ");
    }*/
    
    
    if(letra.length() > 1 ){
        System.out.println("Não é uma letra válida");
    }
    else{
    switch(letra){
        case "a":
        case "e":
        case "i":
        case "o":
        case "u": 
        case "A":
        case "E":
        case "I":
        case "O":
        case "U": System.out.println("VOGAL!"); break;
        default: System.out.println("CONSOANTE!");
    }
    
       }
    
    }
    
}
