/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos. Fórmula da área: area = π . raio2; Considere o valor de π = 3.14159 */

package EstruturaSequencial.pratica_2;

import java.util.Locale;

import java.util.Scanner;

public class main {
    public static void main (String [] Args) throws Exception {
        

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        System.out.print("====== Calculadora de circuferência ======\nDigite o valor do raio do circulo: ");
        double valor = sc.nextDouble();
        double resultado = 3.14159 * Math.pow(valor,2);
        System.out.printf("Área = %.4f",resultado);


    }
}
