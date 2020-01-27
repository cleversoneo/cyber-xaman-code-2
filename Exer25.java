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
public class Exer25 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o valor/hora:");
        double valorHora = scan.nextDouble();
        
        System.out.println("Entre com as horas trabalhadas no mes:");
        double qtdHoras = scan.nextDouble();
        
        double salarioBruto = valorHora * qtdHoras;
        
        int percentualIR = 0;
        if (salarioBruto <= 900){        //salário bruto até 900 (inclusive) ISENTO
            percentualIR = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500){    //salário bruto até 1500 (inclusive) Desconto 5%
            percentualIR = 5;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500){   //salário bruto até 2500 (inclusive) Desconto 10%
            percentualIR = 10;
        } else if (salarioBruto > 2500){    //salário bruto acima de 2500 Desconto 20%
            percentualIR = 20;
        }
        
        double ir = (salarioBruto / 100) * percentualIR;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;  //salário liquido é salário bruto menos os descontos.
        
        System.out.println("Salário Bruto: (" + valorHora + " * " + qtdHoras + "): " + salarioBruto);
        System.out.println("(-) IR (" + percentualIR + "%):" + ir);
        System.out.println("(-) INSS ( 10%): " + inss);
        System.out.println("FGTS (11%): " + fgts);
        System.out.println("Total de descontos: " + totalDescontos);
        System.out.println("Salario Liquido: " + salarioLiquido);
        
        
    }
    
}
