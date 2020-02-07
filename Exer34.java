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
public class Exer34 {
    
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com a quantidade de litros ventidos: ");
        double litros = scan.nextDouble();
        
        System.out.println("Entre com o tipo de combustivel: ");
        String tipo = scan.next();
        
        double precoGas = 2.5;
        double precoAlc = 1.9;
        int percDesconto = 0;
        
        double total = 0;
        double totalDesconto = 0;
        
        if (tipo.equalsIgnoreCase("A")){
            
            if (litros <= 20){
                percDesconto = 3;
            } else{
                percDesconto = 5;
            }
            
            total = litros * precoAlc;
            
            
        } else if (tipo.equalsIgnoreCase("G")){
            
            if (litros <= 20){
                percDesconto = 4;
            } else{
                percDesconto = 6;
            }
                
            total = litros * precoGas;  
    }
        
        
       totalDesconto = (total / 100) * percDesconto;
       
       double precoPagamento = total - totalDesconto;
        
       System.out.println("VALOR A SER PAGO: " + precoPagamento);
}
    
}
