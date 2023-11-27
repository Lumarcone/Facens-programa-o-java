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
public class Tabuada {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

       
        System.out.println("Tabuada de " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

    }
}
    

