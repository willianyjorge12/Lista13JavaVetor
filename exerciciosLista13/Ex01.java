package exerciciosLista13;
import java.util.Scanner;
public class Ex01 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Quantos elementos terá o vetor? ");
	        int n = scanner.nextInt();

	        int[] vetor = new int[n];

	        System.out.println("Digite os elementos do vetor:");

	        for (int i = 0; i < n; i++) {
	            vetor[i] = scanner.nextInt();
	        }

	        int soma = 0;
	        for (int num : vetor) {
	            soma += num;
	        }

	        System.out.println("A soma dos elementos do vetor é: " + soma);

	        scanner.close();
	    }
}
