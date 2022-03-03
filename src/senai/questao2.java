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
public class questao2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int valor_camisa = 30;
        
        int qnt_camisa = 0;
        while (qnt_camisa>5 || qnt_camisa <1){
            System.out.println("Informe uma opção abaixo\n 1- Uma camisa\n 2- Duas camisas\n 3- Três camisas\n 4- Quatro camisas\n 5- Cinco camisas\n");
            qnt_camisa = sc.nextInt();
        }
        double total;
        double frete = 20;
        String sigla_estado;
        System.out.println("Luffy-kun digite a sigla do seu estado: Ex:Ba, Sp, Rj ");
        sigla_estado = sc.next();
        
        if("Ba".equals(sigla_estado)){
            total = valor_camisa * qnt_camisa;
            System.out.println("Frete gratis");
            System.out.println("O total será de: " +total);
        } else {
            total = valor_camisa * qnt_camisa + frete;
            System.out.println("20R$ de frete");
            System.out.println("O total será de: " +total);
        }
        
    }
}
