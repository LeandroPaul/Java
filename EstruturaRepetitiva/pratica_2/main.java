/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema 
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo 
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma). */

package EstruturaRepetitiva.pratica_2;

import java.util.Scanner;

public class main {
    public static void main (String[] Args) throws Exception{
        while(true){
            int x,y;
            Scanner sc = new Scanner(System.in);
            System.out.print("X: ");
            x = sc.nextInt();
            System.out.print("Y: ");
            y = sc.nextInt();
            
            if (x>0 && y>0){
                System.out.println("Primeiro Quadrante.");
            }
            else if (y>0 && x<0){
                System.out.println("Segundo Quadrante.");
            }
            else if (x<0 && y<0){
                System.out.println("Terceiro Quadrante.");
            }
            else if (x>0 && y<0){
                System.out.println("Quarto Quadrante.");
            }
            else if(x==0 && y>0 || y==0 && x>0 || x==0 && y<0 || y==0 && x<0){
                break;
            }
            System.out.println("----------------------------");

        }
    }
}
