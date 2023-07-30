/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas */
package EstruturaCondicional.pratica_4;

import java.util.Scanner;

public class main {
    public static void main (String[] args) throws Exception{
        Scanner sc = new Scanner (System.in);
        System.out.print("++++ DURAÇÃO DO JOGO ++++\n");
        System.out.print("DIGITE A HORA INICIAL: ");
        int i = sc.nextInt();
        System.out.print("DIGITE A HORA FINAL: ");
        int f = sc.nextInt();
        if (i>f){
            int soma = (24-i)+f;
            System.out.printf("O JOGO DUROU %d HORAS",soma);
        }

        else if (i<f){
            int soma = f-i;
            System.out.printf("O JOGO DUROU %d HORAS",soma);
        }
        else{
             System.out.printf("O JOGO DUROU 24 HORAS");
        }

    }
}
