/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */

package EstruturaSequencial.pratica_5;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main (String[] args) throws Exception{
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        System.out.println("¨¨¨¨¨ CAIXA ¨¨¨¨¨¨\n");
        System.out.print("Código peça-1: ");
        int cp1 = sc.nextInt();
        System.out.print("Quantidade de peças-1: ");
        int q1 = sc.nextInt();
        System.out.print("Valor unitário de cada peça-1: ");
        float vp1 = sc.nextFloat();
        System.out.print("\n");
        System.out.print("Código peça-2: ");
        int cp2 = sc.nextInt();
        System.out.print("Quantidade de peças-2: ");
        int q2 = sc.nextInt();
        System.out.print("Valor unitário de cada peça-2: ");
        float vp2 = sc.nextFloat();
        float total = (q1*vp1) + (q2*vp2);
        System.out.print("===================================\n");
        System.out.printf("Valor total a pagar: R$ %.2f",total);
	
    }
}
