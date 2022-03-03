/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 3) Programa Comida.java
Escreva um programa com 3 funções:
Função main:
● Possui a variável precoTotal, para armazenar o valor da compra.
● Possui um menu inicial, que solicita que a pessoa informe o que
deseja comer: D) Doce, S) Salgado ou Z) Sair.
○ Para capturar o char, use next().charAt(0).
● Se a pessoa digitar um caractere inválido, exiba uma mensagem de
alerta e o menu inicial novamente.
● Caso a pessoa digite D, chama a função menuDoce(), passando
como parâmetro a variável do Scanner. O retorno dessa função é
SOMADO à variável precoTotal.
● Caso a pessoa digite S, chama a função menuSalgado(), passando
como parâmetro a variável do Scanner. O retorno dessa função
também é SOMADO à variável precoTotal.
● Quando a pessoa finaliza a compra do doce/salgado, o programa
volta ao menu inicial.

● Caso a pessoa digite Z, o programa exibe o valor total da compra e
é encerrado.

Função menuDoce():
● Possui um parâmetro do tipo Scanner e retorna um float.

● Exibe um menu com três doces: 1) Brigadeiro; 2) Cocada ou 3) Pé-
de-moleque.

● Caso a pessoa digite um número diferente das opções válidas, o
programa reexibe o menu de doces.
● Quando uma opção válida é escolhida, o programa retorna o preço
do doce. Qualquer doce custa R$ 2,00.
Função menuSalgado():
● Possui um parâmetro do tipo Scanner e retorna um float.
● Exibe um menu com quatro salgados: 1) Pastel; 2) Empada; 3)
Coxinha ou 4) Esfirra.
● Caso a pessoa digite um número diferente das opções válidas, o
programa reexibe o menu de salgados.
● Quando uma opção válida é escolhida, o programa retorna o preço
do salgado. Pastel ou empada custa R$ 5,00. Coxinha ou esfirra
custa R$ 3,00.
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
