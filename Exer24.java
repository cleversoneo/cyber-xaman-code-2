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
public class Exer24 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor do salario: ");
        double salario = scan.nextDouble();
        
        int percentual = 0;
        
        if (salario < 280 ){
            percentual = 20;
        } else if (salario > 280 && salario < 700){
            percentual = 15;
        } else if (salario >= 700 && salario <1500){
            percentual = 10;
        } else if (salario > 1500){
            percentual = 5;
        }
        
        double aumento = (salario / 100) * percentual;
        double salarioAjustado = salario + aumento;
        
        
        System.out.println("salario antes do ajuste: " + salario);
        System.out.println("percentual de aumento aplicado: " + percentual);
        System.out.println("valor do aumento: " + aumento);
        System.out.println("novo salario apos aumento: " + salarioAjustado);
        
    }
    
}
