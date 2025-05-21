package exerciciosLista13;
import java.util.Scanner;
public class Ex04 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos terá o vetor? ");
        int n = scanner.nextInt();

        int[] vetor = new int[n];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Invertendo o vetor
        for (int i = 0; i < n / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[n - 1 - i];
            vetor[n - 1 - i] = temp;
        }

        System.out.println("Vetor invertido:");
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}
