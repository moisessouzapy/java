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
public class questao3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a opção desejada:\n1) Doce\n2) Salgado\n3) Sair");
        int opcao = sc.nextInt();
        while(opcao == 1 || opcao == 2 || opcao == 3){
            if (opcao == 1){
                menuDoce(opcao);
                System.out.println("Informe a opção desejada:\n1) Doce\n2) Salgado\n3) Sair");
                opcao = sc.nextInt();
            }else if (opcao == 2){
                menuSalgado(opcao);
                System.out.println("Informe a opção desejada:\n1) Doce\n2) Salgado\n3) Sair");
                opcao = sc.nextInt();
            }else if (opcao == 3){
                System.out.println("Fim de programa");
                break;
            }else {
                opcao = sc.nextInt();
            }
        }
    }
    static void menuDoce(int num1) {
    Scanner sc = new Scanner(System.in);
        System.out.println("1)Brigadeiro\n2)Cocada\n3)Pé-de-moleque");
        System.out.println("Pressione 0 para sair");
    int doce = sc.nextInt();
    while(!(doce >=1 || doce <=3)){
        doce = sc.nextInt();
    }
        System.out.println("O valor da compra é de: R$ 2,00");
}
    static void menuSalgado(int num2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1)Pastel\n2)Empada\n3)Coxinha\n4)Esfirra");
        System.out.println("Pressione 0 para sair");
        int sal = sc.nextInt();
        while(!(sal >=1 || sal <=4)){
           sal = sc.nextInt(); 
        }
        if (sal ==1 || sal == 2){
            double total = 5.00;
            System.out.println("O total foi de: "+total);
        }else{
            double total = 3.00;
            System.out.println("O total foi de: "+total); 
        }
        
}
}
