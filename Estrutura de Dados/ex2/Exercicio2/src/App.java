public class App {
    public static void main(String[] args) throws Exception {
        // Faça um programa para apresentar na tela todos os números inteiros entre 100
        // e 1 (ordem decrescente).
        
        for (int i = 1; i<100; i++) { 
            int soma=i+1;
            if(soma%2==0){
                System.out.println("Posição i: "+(i)+" "+"Número inteiros: "+soma);
            }
                

        }
    }

}
