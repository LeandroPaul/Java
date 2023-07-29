/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa.*/

package EstruturaSequencial.pratica_1;

import java.util.Scanner;

public class main { 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        System.out.print("Primeiro valor: ");
        int valor1 = sc.nextInt();
        System.out.print("Segundo valor: ");
        int valor2 = sc.nextInt();

        int soma = valor1 + valor2;

        System.out.println("Soma = " + soma);
    }
}
