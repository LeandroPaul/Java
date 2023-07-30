/*Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67 */

package EstruturaSequencial.pratica_6;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main (String[] args) throws Exception{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        System.out.println("ººººº CONVERSOR DE TEMPERATURA ººººº");
        System.out.print("Digite a temperatura em ºC: ");
        double c = sc.nextDouble();
        double k = c + 273.15;
        double f = (c*1.8)+32;
        double re = c * 0.8;
        double ra = (c*1.8)+32+459.67;
        System.out.printf("Temperatura em Kelvin: %.1f K\nTemperatura em Réaumur: %.1f Re\nTemperatra em Rankine: %.1f Ra\nTemperatura em Fahrenheit: %.1f F",k,re,ra,f);
    }



}
