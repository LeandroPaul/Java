/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/

package EstruturaSequencial.pratica_3;

import java.util.Scanner;

public class main{
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        System.out.println("======= Cubo da Diferença =======");
        System.out.println("Informe quatro valores");
        System.out.print("Valor de A: ");
        int valorA = sc.nextInt();
        System.out.print("Valor de B: ");
        int valorB = sc.nextInt();
        System.out.print("Valor de C: ");
        int valorC = sc.nextInt();
        System.out.print("Valor de D: ");
        int valorD = sc.nextInt();
        int diferenca = ((valorA * valorB) - (valorC * valorD));
        System.out.print("----------------------------------\nDIFERENÇA = "+diferenca);

    
} 
    
}
