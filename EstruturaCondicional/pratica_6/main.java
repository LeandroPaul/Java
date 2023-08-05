/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”. */
package EstruturaCondicional.pratica_6;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main (String[] args) throws Exception{
        //Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        System.out.print("DIGITE UM NÚMERO: ");
        double valor = sc.nextDouble();
        if(valor>=0 && valor<=25){
            System.out.print("VVALOR SE ENCONTRA NO SEGUINTE INTERVALO: [0,25]");
        }
        else if(valor>=25.01&&valor<=50){
            System.out.print("VVALOR SE ENCONTRA NO SEGUINTE INTERVALO: [25,50]");
        }
        else if(valor>=50.01&&valor<=75){
            System.out.print("VVALOR SE ENCONTRA NO SEGUINTE INTERVALO: [50,75]");
        }
        else if(valor>=75.01&&valor<=100){
            System.out.print("VVALOR SE ENCONTRA NO SEGUINTE INTERVALO: [75,100]");
        }
        else if (valor>100){
            System.out.print("FORA DO INTERVALO !");
        }
        else{
            System.out.print("FORA DO INTERVALO !");
        }

    }
}
