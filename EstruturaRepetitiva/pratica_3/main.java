/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme 
exemplo. */

package EstruturaRepetitiva.pratica_3;
import java.util.Scanner;
public class main {
    public static void main (String args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int alcool,gasolina,diesel,fim;
        int codigo=0;
        int soma = 0;
        while(codigo!=4){
            System.out.print("Posto Lino\nInforme qual dos produtos é de sua preferência\n1 - Alcool\n2 - Diesel\nDiesel\n4 - Encerrar");
            System.out.print("Codigo do produto: ");
            codigo = sc.nextInt();
            if(codigo==1){
                soma++;
                System.out.print("Gasolina: "+soma);
                break;
            }

        }
    }
}
