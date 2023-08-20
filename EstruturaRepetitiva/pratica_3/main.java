package EstruturaRepetitiva.pratica_3;

import java.util.Scanner;
public class main {
    public static void main (String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int alcool=0,gasolina=0,diesel=0,fim;
        int codigo=0;
        System.out.print("          Posto Lino\nInforme qual dos produtos é de sua maior preferência\n1 - Alcool\n2 - Diesel\n3 - Gasolina\n4 - Encerrar\n");
        
        while(codigo!=4){
            System.out.print("Codigo: ");
            codigo = sc.nextInt();
            System.out.println("-----------------------------");
            if(codigo==1){
                alcool++;
            }
            else if(codigo==2){
                diesel++;
            }
             else if(codigo==3){
                gasolina++;
            }
            else if(codigo>4){
                System.out.println("Digite um número entre 1 e 4.");
                System.out.println("-----------------------------");
            }
            if(codigo==4){
                System.out.printf("MUITO OBRIGADO\nAlcool: %d\nDiesel: %d\nGasolina: %d",alcool,diesel,gasolina);
                break;
            }

        }
    }
}
