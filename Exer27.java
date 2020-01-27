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
public class Exer27 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com a primeira nota: ");
        double nota1 = scan.nextDouble();
        
        System.out.println("Entre com a segunda nota: ");
        double nota2 = scan.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        String aproveitamento = "";
        if(media >= 9.0 && media <= 10.0 ){
            aproveitamento = "A";
        } else if (media >= 7.5 && media < 9.0 ){
            aproveitamento = "B";
        } else if (media >= 6.0 && media < 7.5 ){
            aproveitamento = "C";
        } else if (media >= 4.0 && media < 6.0 ){
            aproveitamento = "D";
        } else if (media >= 0.0 && media < 4.0 ){
            aproveitamento = "E";
        }
        System.out.println("nota 1: " + nota1);
        System.out.println("nota 2: " + nota2);
        System.out.println("MEDIA> " + media);
        System.out.println("CONCEITO> " + aproveitamento);
        
        switch(aproveitamento){
            case "A":
            case "B":
            case "C":
            System.out.println("APROVADO"); 
            break;
                
            case "D":
            case "E":
            System.out.println("REPROVADO"); 
            break;
        }
        
    }
}
