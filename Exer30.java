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
public class Exer30 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o ano> ");
        
        int ano = scan.nextInt();
        
        if((ano % 400 == 0) || (ano % 4 ==0 && ano % 100 != 0)){
            System.out.println("É ANO BISSEXTO");
        } else {
            System.out.println("NÃO É ANO BISSEXTO");
        }
        
    }
    
}
