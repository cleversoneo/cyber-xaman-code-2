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
public class Exer23 {
    
        public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o turno que voce estuda: ");
        String turno = scan.next();
        
        switch(turno){
            case "m":
            case "M": System.out.println("BOM DIA!"); 
            break; 
                
            case "v":
            case "V": System.out.println("BOA TARDE!"); 
            break; 
                
            case "n":
            case "N": System.out.println("BOA NOITE!"); 
            break;  
                
            default: System.out.println("VALOR INVALIDO"); 
        }
    }
}
