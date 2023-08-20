/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha 
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser 
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002. */

package EstruturaRepetitiva.pratica_1;

import java.util.Scanner;

public class main {
        public static void main (String[] args) throws Exception{
            int valor = 2002;
            while(true){
            Scanner sc = new Scanner (System.in);
            System.out.print("SENHA: ");
            int senha = sc.nextInt();
            System.out.println("--------------------------------------");
    
            if (senha==valor){
                System.out.println("Acesso Permitido.");
                    break;
            }
            else{
                System.out.println("Senha Inválida.");
                System.out.println("--------------------------------------");
                System.out.println("Digite Novamente");
                  
            }
    
    
        } 
    }
    }
    

