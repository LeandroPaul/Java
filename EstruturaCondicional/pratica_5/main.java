/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar. */

package EstruturaCondicional.pratica_5;

import java.util.Scanner;

public class main {
    public static void main (String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================================\n================= CARDÁPIO ==============");
        System.out.print("Codigo      Especificação         Preço\n1          Cachorro Quente        R$ 4.00\n2          X-Salada               R$ 4.50\n3          X-Bacon                R$ 5.00\n4          Torada Simples         R$ 2.00\n5          Refrigerante           R$ 1.50\n");
        System.out.print("==========================================\n         PEDIDO\nDIGITE O CODIGO DO ITEM: ");
        int codigo = sc.nextInt();
    }
    
}
