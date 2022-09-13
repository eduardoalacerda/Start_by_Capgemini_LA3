/*
Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O desconto deverá ser calculado
de acordo com o ano do veículo. Até o ano 2000 - 12% e acima de 2000 - 7%. O sistema deverá perguntar se deseja continuar calculando o desconto até
que a resposta seja: "(N) Não". Informar o total de carros com ano até 2000 e o total geral.
 */
package ExercicioVinte;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int anoCarro = 0;
        float valorCarro = 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorFinal = 0.0f;
        int totalSeminovos = 0;
        int totalCarros = 0;

        char desejaRepetir = 's';

        while (desejaRepetir == 's' || desejaRepetir == 'S') {

            System.out.println("Informe o ano do carro: ");
            anoCarro = leitor.nextInt();
            System.out.println("Informe o valor do carro: ");
            valorCarro = leitor.nextFloat();

            if (anoCarro <= 2000) {
                porcentagemDesconto = 0.12f;
                totalSeminovos = +1;
            } else {
                porcentagemDesconto = 0.07f;
            }
            totalCarros++;

            valorDesconto = valorCarro * porcentagemDesconto;
            System.out.println("Valor do desconto = " + valorDesconto);

            valorFinal = valorCarro - valorDesconto;
            System.out.println("Valor do carro = " + valorFinal);

            System.out.println("Deseja fazer mais cadastros? S - Sim / N - Nao");
            desejaRepetir = leitor.next().charAt(0);

            if (desejaRepetir == 'n' || desejaRepetir == 'N') {
                System.out.println("Total de carros seminovos = " + totalSeminovos);
                System.out.println("Total de carros = " + totalCarros);
            }
        }
    }
}