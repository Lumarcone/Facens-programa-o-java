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
public class CalculadoraSimples {
     public static void main(String[] args) {
         
         Scanner scanner = new Scanner(System.in);
         
         System.out.print("Digite o primeiro número: ");
         double numero1 = scanner.nextDouble();
         
         System.out.print("Digite o segundo número: ");
         double numero2 = scanner.nextDouble();
         
         System.out.println("Escolha a operação:");
         System.out.println("1. Adição");
         System.out.println("2. Subtração");
         System.out.println("3. Multiplicação");
         System.out.println("4. Divisão");
         
         int escolha = scanner.nextInt();
         
         double resultado = 0;
         
         switch (escolha){
             case 1:
                 resultado = numero1 + numero2;
                 break;
             case 2:
                 resultado = numero1 - numero2;
                 break;
             case 3:
                 resultado = numero1 * numero2;
                 break;
             case 4:
                 if (numero2 !=0){
                     resultado = numero1 / numero2;
                 }else{
                     System.out.println("Erro: Divisão por zero.");
                     return;
                 }
                
         }
         
         System.out.println("O resultado da operação é:" + resultado);
     }
    
}
