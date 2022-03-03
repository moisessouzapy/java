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
public class questao1 {
    public static void main(String[]args){
        System.out.println("Digite as 3 notas de DS1");
        double[] notas = new double[3];
        Scanner a = new Scanner(System.in);
        float nota1 = a.nextFloat();
        Scanner b = new Scanner(System.in);
        float nota2 = b.nextFloat();
        Scanner c = new Scanner(System.in);
        float nota3 = c.nextFloat();
        notas[0] = nota1;
        notas[1] = nota2;
        notas[2] = nota3;
        
        float media = 0;
        for(int i=0;i < notas.length;i++){
           media +=notas[i];
        }       
        float total = media / notas.length;
        System.out.println("A média é: "+total);
        if (media >=9){
            System.out.println("Conceito A"); 
        } else if (media >=8 || media <=8.9){
            System.out.println("Conceito B");
        } else if (media >= 7 || media <= 7.9){
            System.out.println("Conceito C"); 
        } else if (media >= 6 || media <= 6.9){
            System.out.println("Conceito D");
        } else{
            System.out.println("Conceito F");
        }  
    }
  }
