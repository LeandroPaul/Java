/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).Se o ponto estiver na origem, escreva a mensagem “Origem”.Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação. */

package EstruturaCondicional.pratica_7;

import java.util.Scanner;
import java.util.Locale;

public class main {
    public static void main (String[] args) throws Exception{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("INFORME DOIS VALORES");
        System.out.print("PRIMEIRO VALOR: ");
        double valor1 = sc.nextDouble();
        System.out.print("SEGUNDO VALOR: ");
        double valor2 = sc.nextDouble();
        if (valor1==0&&valor2==0){
            System.out.print("ORIGEM");
        }
        if (valor1>=0&&valor2>0){
            System.out.print("Q1");
        }
        if (valor2>=0&&valor1>0){
            System.out.print("Q1");
        }
        
    }
    
}
