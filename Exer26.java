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
public class Exer26 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("ENTRE com um dia da semana (entre 1-7): ");
        int numDia = scan.nextInt();
        
        switch(numDia){
            case 1:
            System.out.println("DOMINGO"); 
            break;
                
            case 2:
            System.out.println("SEGUNDA"); 
            break;
                
            case 3:
            System.out.println("TERÇA"); 
            break;    
            
            case 4:
            System.out.println("QUARTA"); 
            break;
                
            case 5:
            System.out.println("QUINTA"); 
            break;
                
            case 6:
            System.out.println("SEXTA"); 
            break;
                
            case 7:
            System.out.println("SABADO"); 
            break;
                
                
            default: System.out.println("VALOR INVALIDO"); 
        }
        
        
    }
}
