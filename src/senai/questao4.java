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
public class questao4 {
    public static void main(String[]args){
        int ds1 = 0;
        System.out.println("Você vai passar em DS1?");
        Scanner sc = new Scanner(System.in);
        ds1 = sc.nextInt();
        if (ds1 == 1){
            System.out.println("Parabéns");
        }else if (ds1 == 0){
            System.out.println("Estude mais");
        }else {
            System.out.println("Inválido");
        }
    }
}