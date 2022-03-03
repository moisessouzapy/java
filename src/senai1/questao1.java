/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senai1;

import java.util.Scanner;

/**
 *
 * @author moise
 */
public class questao1 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um valor");
        double num1 = sc.nextDouble();
        System.out.println("digite um valor");
        double num2 = sc.nextDouble();
        System.out.println("1)Multiplicação\n2)Divisão");
        object(num1,num2);
    }
    static void object(double num1, double num2){
        Scanner sc = new Scanner(System.in);
        double escolha = sc.nextInt();
        if (escolha == 1){
           double total = num1 * num2;
            System.out.println(total);
        }else{
            double total = num1 / num2;
            System.out.println(total);
        }
    }
}
