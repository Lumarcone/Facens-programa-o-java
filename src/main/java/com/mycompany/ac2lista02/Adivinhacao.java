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
public class Adivinhacao {
     public static void main(String[] args) {
        
        int numeroAleatorio = (int) (Math.random() * 100) + 1;

        Scanner scanner = new Scanner(System.in);

        int tentativa;

        while (true) {
            System.out.print("Digite um número entre 1 e 100: ");

            tentativa = scanner.nextInt();
            
            if (tentativa == numeroAleatorio) {
                System.out.println("Você acertou o número. Parabéns!");
                break; 
            } else if (tentativa < numeroAleatorio) {
                System.out.println("O número é maior. Tente novamente");
            } else {
                System.out.println("O número é menor.Tente novamente. ");
            }
        }

    }
}
