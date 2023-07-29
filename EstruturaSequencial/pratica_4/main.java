/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais. */

package EstruturaSequencial.pratica_4;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main (String[] args) throws Exception{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("$$$$$ SALÁRIO DO FUNCIONÁRIO $$$$\n");
        System.out.print("Número do funcionário: ");
        int number = sc.nextInt();
        System.out.print("Horas trabalhadas: ");
        float hours = sc.nextFloat();
        System.out.print("Valor da hora: ");
        float valorHora = sc.nextFloat();
        float salary = hours*valorHora;
        System.out.printf("--------------------------\nNumber: %d\nSALARY: U$ %.2f ",number,salary);

    }
}
