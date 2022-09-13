package ExercicioQuinze;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        int numero;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número");
        
        numero = leitor.nextInt();
        
        if(numero >= 100 && numero <= 200){
            System.out.println("O número " + numero + " está entre 100 e 200");
        } else {
            System.out.println("O número " + numero + " não está entre 100 e 200");
        }
    }
}
