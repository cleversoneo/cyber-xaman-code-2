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
public class Exer36 {
    
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o tipo de legume: ");
        System.out.println("1 - tomate: ");
        System.out.println("2 - batata: ");
        System.out.println("3 - mandioca: ");
        int tipo = scan.nextInt();
        
        System.out.println("Entre com a quantidade de legume (kg): ");
        double qtd = scan.nextDouble();
        
        
        double precoKg = 0;
        
        if(tipo == 1){
            
            System.out.println(qtd+" quantidade tomate" );
            
            if (qtd < 5){
                precoKg = 4.9;
            } else{
                precoKg = 5.8;
            }
        } else if(tipo == 2){
            
            System.out.println(qtd+" quantidade batata" );
            
            if (qtd < 5){
                precoKg = 5.9;
            } else{
                precoKg = 6.8;
            } 
        } else if(tipo == 3){
            
            System.out.println(qtd+" quantidade mandioca" );
            
            if (qtd < 5){
                precoKg = 6.9;
            } else{
                precoKg = 7.8;
            }
        }
        
        
        double precoTotal = qtd * precoKg;
        System.out.println(qtd + "kg * " + precoKg + " = " + precoTotal);
        
        System.out.println("Compra com cartão? - digite 1 para SIM: ");
        int tipoPag = scan.nextInt();
        
        if(tipoPag == 1){
            double desconto = (precoTotal / 100) * 5;
            System.out.println("Desconto de: " + desconto);
            System.out.println("Valor a pagar: " + (precoTotal - desconto));
        } else {
            System.out.println("Valor a pagar: " + precoTotal);
        }
        
    } 
    
}
