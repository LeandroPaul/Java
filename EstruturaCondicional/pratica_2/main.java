/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. */
package EstruturaCondicional.pratica_2;

import java.util.Scanner;

public class main {
    public static void main (String[] args) throws Exception{
        Scanner sc = new Scanner (System.in);
        System.out.println("//// PAR OU IMPAR? ////");
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        if (num%2==0){
            System.out.print("PAR !");
        }
        else{
            System.out.print("IMPAR !");
        }

    }
}
