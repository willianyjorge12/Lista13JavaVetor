package exerciciosLista13;
import java.util.Scanner;
public class Ex03 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Quantos elementos terá o vetor? ");
	        int n = scanner.nextInt();

	        double[] vetor = new double[n];
	        double soma = 0;

	        System.out.println("Digite os elementos do vetor:");

	        for (int i = 0; i < n; i++) {
	            System.out.print("Elemento " + (i + 1) + ": ");
	            vetor[i] = scanner.nextDouble();
	            soma += vetor[i];
	        }

	        double media = soma / n;

	        System.out.println("A média dos elementos é: " + media);

	        scanner.close();
	    }
}
