/*
Escreva um algoritmo que leia o nome  e as três notas obtidas por um aluno durante o semestre. Calcular a sua média (aritmética),
informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (media entre 5.1 e 6.9).
 */
package ExercicioDezesseis;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        float nota1;
        float nota2;
        float nota3;

        String nome;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Escreva o nome do aluno");
        nome = leitor.nextLine();

        System.out.println("Escreva a primeira nota do aluno");
        nota1 = leitor.nextInt();
        System.out.println("Escreva a segunda nota do aluno");
        nota2 = leitor.nextInt();
        System.out.println("Escreva a terceira nota do aluno");
        nota3 = leitor.nextInt();

        var somaNotas = nota1 + nota2 + nota3;
        var media = somaNotas / 3;

        if (media >= 7) {
            System.out.println("O aluno " + nome + " está aprovado");
        }
        if (media >= 5.1 && media <= 6.9) {
            System.out.println("O aluno " + nome + " está de recuperação");
        } else {
            System.out.println("O aluno " + nome + " está reprovado");
        }
    }
}
