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
public class Exer33 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Telefonou para a vitima?");
        String resp1 = scan.next();
        
        System.out.println("Esteve no local do crime?");
        String resp2 = scan.next();
        
        System.out.println("Mora perto da vitima?");
        String resp3 = scan.next();
        
        System.out.println("Devia para a vitima?");
        String resp4 = scan.next();
        
        System.out.println("Já trabalhou para a vitima?");
        String resp5 = scan.next();
        
        int count = 0;
        
        if(resp1.equalsIgnoreCase("S")){
            count++;
        }
        
        if(resp2.equalsIgnoreCase("S")){
            count++;
        }
        
        if(resp3.equalsIgnoreCase("S")){
            count++;
        }
        
        if(resp4.equalsIgnoreCase("S")){
            count++;
        }
        
        if(resp5.equalsIgnoreCase("S")){
            count++;
        }
        
        if(count == 2){
            System.out.println("suspeita");
        } else if (count ==3 || count == 4){
            System.out.println("cumplice");
        } else if (count ==5){
            System.out.println("assassino");
        } else if (count ==0){
            System.out.println("inocente");
        }
    }
    
}
