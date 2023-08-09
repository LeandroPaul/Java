/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).Se o ponto estiver na origem, escreva a mensagem “Origem”.Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação. */

package EstruturaCondicional.pratica_7;

import java.util.Scanner;
import java.util.Locale;

public class main {
    public static void main (String[] args) throws Exception{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("INFORME DOIS VALORES");
        System.out.print("VALOR DE X: ");
        double x = sc.nextDouble();
        System.out.print("VALOR DE Y: ");
        double y = sc.nextDouble();
        if (x==0&&y==0){
            System.out.print("ORIGEM");
        }
        else if ((x>0) && (y>0)){
            System.out.print("Q1");
        }
        
        else if ((x<0) && (y>0)){
            System.out.print("Q2");
        }
        
        else if ((x<0) && (y<0)){
            System.out.print("Q3");
        }
        else if ((x>0) && (y<0)){
            System.out.print("Q4");
        }
        else if ((x==0) && (y<0)){
            System.out.print("Q3 E Q4");
        }
        else if ((x==0) && (y>0)){
            System.out.print("Q1 E Q2");
        }
        else if ((y==0) && (x>0)){
            System.out.print("Q1 E Q4");
        }
        else if ((y==0) && (x<0)){
            System.out.print("Q2 E Q3");
        }
    }
    
}
