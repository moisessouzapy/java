/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senai;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author moise
 */
public class questao7 {
    public static void main(String[]args){
        ArrayList<String> lista_altura = new ArrayList<String>();
        double nova_altura;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a altura: ");
        nova_altura = sc.nextDouble();
        while(nova_altura >= 1.50){
            System.out.println("Digite a altura: ");
            nova_altura = sc.nextDouble();
        }
        for(int i=0;i<10;i++){
            String altura = new String();
        }
    }
}
