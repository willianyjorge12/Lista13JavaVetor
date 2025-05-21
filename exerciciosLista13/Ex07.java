package exerciciosLista13;
import java.util.Arrays;
import java.util.Scanner;
public class Ex07 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a quantidade de elementos do vetor: ");
	        int n = scanner.nextInt();
	        int[] vetor = new int[n];

	        // Leitura dos elementos do vetor
	        System.out.println("Digite os elementos do vetor:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Elemento " + (i + 1) + ": ");
	            vetor[i] = scanner.nextInt();
	        }

	        // Ordenação em ordem crescente
	        Arrays.sort(vetor);

	        // Exibição do vetor ordenado
	        System.out.println("\nVetor em ordem crescente:");
	        for (int num : vetor) {
	            System.out.print(num + " ");
	        }

	        scanner.close();
	    }
}
