package exerciciosLista13;
import java.util.Scanner;
public class Ex02 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Quantos elementos terá o vetor? ");
	        int n = scanner.nextInt();

	        int[] vetor = new int[n];

	        System.out.println("Digite os elementos do vetor:");

	        for (int i = 0; i < n; i++) {
	            vetor[i] = scanner.nextInt();
	        }

	        int maior = vetor[0];
	        int menor = vetor[0];

	        for (int i = 1; i < n; i++) {
	            if (vetor[i] > maior) {
	                maior = vetor[i];
	            }
	            if (vetor[i] < menor) {
	                menor = vetor[i];
	            }
	        }

	        System.out.println("O maior valor é: " + maior);
	        System.out.println("O menor valor é: " + menor);

	        scanner.close();
	    }
}
