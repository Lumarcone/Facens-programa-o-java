/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ac2lista02;

import java.util.Scanner;

/**
 *
 * @author Lucas Marcone RA 121708
 */
public class ParOuImpar {
    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0){
            System.out.println("O número "+ numero +" é par.");
        }else{
            System.out.println("O número "+ numero +" é impar.");
        }
    }
    
}
