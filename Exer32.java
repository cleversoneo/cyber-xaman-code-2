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
public class Exer32 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero");
        int num1 = scan.nextInt();
        
        System.out.println("Digite o segundo numero");
        int num2 = scan.nextInt();
        
        System.out.println("Digite a operação: (+ - / *)");
        String operacao = scan.next();
        
        double resultado = 0;
        
        switch(operacao){
            case "+": resultado = num1 + num2; break;
                
            case "-": resultado = num1 - num2; break;
            
            case "/": resultado = num1 / num2; break;
                    
            case "*": resultado = num1 * num2; break;
            
            default: System.out.println("Operacao invalida;");
        }
        
        System.out.println("RESULTADO OPERACAO " + resultado);
        
        
        if (resultado % 2 ==0){
            System.out.println("NUMERO PAR ");
        } else {
            System.out.println("NUMERO IMPAR ");
        }
        
        if (resultado < 0){
            System.out.println("NUMERO NEGATIVO ");
        } else {
            System.out.println("NUMERO POSITIVO ");   
        }
    }
    
}
