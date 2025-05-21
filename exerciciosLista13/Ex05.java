package exerciciosLista13;
import java.util.Scanner;
public class Ex05 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Quantos elementos terá o vetor? ");
	        int n = scanner.nextInt();

	        int[] vetor = new int[n];
	        int quantidadePares = 0;

	        System.out.println("Digite os elementos do vetor:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Elemento " + (i + 1) + ": ");
	            vetor[i] = scanner.nextInt();

	            if (vetor[i] % 2 == 0) {
	                quantidadePares++;
	            }
	        }

	        System.out.println("Quantidade de números pares no vetor: " + quantidadePares);

	        scanner.close();
	    }
}
