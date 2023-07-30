/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente. */

package EstruturaCondicional.pratica_3;

import java.util.Scanner;

public class main {
    public static void main (String[] args) throws Exception{
        Scanner sc = new Scanner (System.in);
        int a,b;
        System.out.print("Digite o de valor A: ");
        a = sc.nextInt();
        System.out.print("Digite o de valor b: ");
        b = sc.nextInt();
        if (a % b == 0) {
			System.out.println("Sao Multiplos");
		}
        else if (b % a == 0) {
			System.out.println("Sao Multiplos");
		}

        else{
            System.out.print("Não são multiplos");
        }
    }
}
