/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senai;

import java.util.Scanner;

/**
 *
 * @author moise
 */
public class questao5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor 1");
        int x = sc.nextInt();
        System.out.println("Digite o valor 2");
        int y = sc.nextInt();
        conta(x,y);
    }
    static void conta(double x, double y){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a operação aritmética desejada:\n(1)" +
" Multiplicação\n(2) Divisão"); 
        int valor = sc.nextInt();
        if (valor == 1){
            System.out.println("Multiplicacao");
            System.out.println(x*y);
        }else if (valor == 2){
            System.out.println("Divisao");
            System.out.println(x/y);
        }
    }
}