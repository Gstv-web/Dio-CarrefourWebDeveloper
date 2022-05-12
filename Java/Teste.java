import java.util.Scanner;

// Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X se for o caso.


public class Teste {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;
        int zero = 0;
        
        for(int i = 0; i < 5; i++) {
            int x = input.nextInt();
            if(x % 2 == 0) {
                par++;
            } else {
                impar++;
            }

            if (x < 0) {
                negativo++;
            } else if (x > 0) {
                positivo++;
            } else {
                zero++;
            }

        }
        
        System.out.println("Pares: " + par);
        System.out.println("Impares: " + impar);
        System.out.println("Positivos: " + positivo);
        System.out.println("Negativos: " + negativo);

        input.close();
    }

    
}

