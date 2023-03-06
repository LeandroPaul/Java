import java.util.Scanner;

// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
// mensagem explicativa, conforme exemplos.
public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // Saída do nome do programa
        System.out.println("  ### Calculadora de Adição ### ");

        // Entrada do primeiro valor
        System.out.print("Primeiro valor: ");
        int v1 = sc.nextInt();

        // Entrada do segundo valor
        System.out.print("Segundo valor: ");
        int v2 = sc.nextInt();

        // metodo do calculo
        int soma = v1 + v2;

        // Saída do resultado
        System.out.println("Soma = " + soma);

    }
}