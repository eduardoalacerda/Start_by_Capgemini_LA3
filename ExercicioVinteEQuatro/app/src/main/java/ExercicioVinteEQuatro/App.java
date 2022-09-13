/*
 Faça um algoritmo que receba "N" números e mostre positivo, negativo ou zero para cada número;
 */
package ExercicioVinteEQuatro;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n = 0;
        int numeroDigitado;

        System.out.println("Digite a quantidade de vezes que o app rodará");
        n = leitor.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite um número real");
            numeroDigitado = leitor.nextInt();
            if (numeroDigitado < 0) {
                System.out.println("O número " + numeroDigitado + " é negativo");
            } else {
                if (numeroDigitado == 0) {
                    System.out.println("O número " + numeroDigitado + " é zero");
                } else {
                    System.out.println("O número " + numeroDigitado + " é positivo");
                }
            }
        } 
    }
}
