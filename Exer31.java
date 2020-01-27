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
public class Exer31 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro: ");
        int num = scan.nextInt();
        
        if (num % 2 ==0){
            System.out.println("NUMERO PAR ");
        } else {
            System.out.println("NUMERO IMPAR ");
        }
    }
    
}
