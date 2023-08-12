/*Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem 
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$. Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo. */

package EstruturaCondicional.pratica_8;

import java.util.Scanner;

public class main {
    public static void main (String[] args) throws Exception{
        Scanner sc = new Scanner (System.in);
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("                            LISARB - IMPOSTO DE RENDA\n  PAGUE SEU IMPOSTO DE RENDA EM DIA, TODOS OS RECURSOS ARRECADADOS SÃO BENEFÍCIOS SOCIAIS.\n-------------------------------------------------------------------------------------------------");
        System.out.println("SIMULE AGORA !");
        System.out.print("INFORME A RENDA: ");
        double renda = sc.nextFloat();
        if (renda>=0 && renda<=2000.00){
            System.out.print("CIDADÃO ISENTO.");
        }
        else if (renda>=2000.01 && renda<=3000.00){
            double imposto = renda-2000.00;
            double pagar = imposto*8/100;
            System.out.print(pagar);
        }

        else if (renda>=3001.00 && renda<=4500.00){
            double imposto = renda-2000.00;
            double ba=imposto-1000.00;
            double base=imposto-ba;
            double total = (ba*0.18) + (base*0.08);
            System.out.print(total);
        }
        else {
            double imposto = renda-2000.00;
            double ba=imposto-2000.00;
            double base=imposto-ba;
            double total = (ba*0.28) + (base*0.105);
            System.out.print(total);
        }


        
    }
}
