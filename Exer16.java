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
public class Exer16 {
    
    public static void main (String [] args){
        
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Informe um valor: ");
    int valor = scan.nextInt();
    
    if(valor >=0){
        System.out.println("POSITIVO");
    }
    else{
        System.out.println("NEGATIVO");
    }
    
    }
    
}
