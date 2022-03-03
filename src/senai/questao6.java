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
public class questao6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite um número: ");
        int num2 = sc.nextInt();
        System.out.println("Digite um número: ");
        int num3 = sc.nextInt();
        System.out.println("Digite um número: ");
        int num4 = sc.nextInt();
        System.out.println("Digite um número: ");
        int num5 = sc.nextInt();
        if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5){
            System.out.println("O menor número é: "+num1);
        }else if (num2 < num1 && num2 < num3 && num1 < num4 && num1 < num5){
            System.out.println("O menor número é: "+num2);
        }else if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5){
            System.out.println("O menor número é: "+num3);
        }else if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5){
            System.out.println("O menor número é: "+num4);
        }else if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4){
            System.out.println("O menor número é: "+num5);
        }
    }
}
