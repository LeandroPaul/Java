/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. */

package EstruturaCondicional.pratica_1;

import java.util.Scanner;
public class main {
    public static void main (String[] args) throws Exception{
        Scanner sc = new Scanner (System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        if (num>=0){
            System.out.print("NÃO NEGATIVO.");
        }
        else{
            System.out.print("NEGATIVO.");
        }


    }
}
