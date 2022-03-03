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
public class questao2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe qual voo gostaria de realizar:/n1)Salvador-Frankfurt;/n2)Salvador-Tóquio/n3)Frankfurt-Tóquio");
        int voo = sc.nextInt();
        System.out.println("Qual classe você ira viajar: /n1)Econômica/n2)Executiva/n3)Primeira Classe");
        int classe = sc.nextInt();
        System.out.println("Quantos passageiros irão? ");
        float passageiros = sc.nextFloat(); 
        if(voo == 1){
            float km = 8377.0f;
            calcularpreco(passageiros,classe, (float) km);
        }else if(voo ==2){
            double km = 17474.0;
            calcularpreco(passageiros,classe, (float) km);
        }else {
            double km = 9330.0;
            calcularpreco(passageiros,classe, (float) km);
        }
    }
    static void calcularpreco(float qnt_passageiro, int classe, float dist_voo){
        float preco = (dist_voo / 5)*qnt_passageiro;
        if (classe == 2){
            float soma = preco / 20;
            float total = soma + preco;
            System.out.println(total);
        }else if(classe == 3){
            float soma = preco / 10;
            float total = soma + preco;
            System.out.println(total);
        }else{
            float soma = preco;
            System.out.println(soma);
        }
    }
}
