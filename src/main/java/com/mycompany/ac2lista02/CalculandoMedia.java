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
public class CalculandoMedia {
    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro N: ");
        int n = scanner.nextInt();
        
        if(n <=0){
            System.out.println("N deve se maior que 0. ");
            return;
        }
        
        int soma = 0;
        
        for (int i = 1; i<= n; i++){
            System.out.print("Digite o valor #" + i +":");
            int valor = scanner.nextInt();
            soma += valor;
        }
        double media = (double) soma/ n;
        System.out.println("A média dos valores é: " + media);
    }
}
