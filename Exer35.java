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
public class Exer35 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Entre com a quantidade de kg Morango");
        double qtdMorango = scan.nextDouble();
        
        System.out.println("Entre com a quantidade de kg Maça");
        double qtdMaca = scan.nextDouble();
        
        double precoMorango = 0;
        if(qtdMorango <= 5){
            precoMorango = 2.5;
        } else {
            precoMorango = 2.2;
        }        
        
        
        double precoMaca = 0;
        if(qtdMaca <= 5){
            precoMaca = 1.8;
        } else {
            precoMaca = 1.5;
        } 
        
        double precoTotalMorango = qtdMorango * qtdMorango;
        double precoTotalMaca = qtdMaca * qtdMaca;

        double precoParcial = precoMorango + precoMaca;
        double precoTotal = precoParcial;
        
        if((qtdMorango + qtdMaca > 8) || precoParcial > 25){
            precoTotal = precoParcial - ((precoParcial / 100) * 10);
        }
        
        
        System.out.println("Preco a pagar> " + precoTotal);
        
        
    }
    
}
