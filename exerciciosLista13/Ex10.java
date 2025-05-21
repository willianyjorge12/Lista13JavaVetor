package exerciciosLista13;
import java.util.Scanner;
public class Ex10 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Entrada do primeiro vetor
	        System.out.print("Digite o tamanho do primeiro vetor: ");
	        int n1 = scanner.nextInt();
	        int[] vetor1 = new int[n1];
	        System.out.println("Digite os elementos do primeiro vetor:");
	        for (int i = 0; i < n1; i++) {
	            System.out.print("Elemento " + (i + 1) + ": ");
	            vetor1[i] = scanner.nextInt();
	        }

	        // Entrada do segundo vetor
	        System.out.print("\nDigite o tamanho do segundo vetor: ");
	        int n2 = scanner.nextInt();
	        int[] vetor2 = new int[n2];
	        System.out.println("Digite os elementos do segundo vetor:");
	        for (int i = 0; i < n2; i++) {
	            System.out.print("Elemento " + (i + 1) + ": ");
	            vetor2[i] = scanner.nextInt();
	        }

	        // União dos vetores
	        int[] vetorUnido = new int[n1 + n2];
	        for (int i = 0; i < n1; i++) {
	            vetorUnido[i] = vetor1[i];
	        }
	        for (int i = 0; i < n2; i++) {
	            vetorUnido[n1 + i] = vetor2[i];
	        }

	        // Exibição do vetor unido
	        System.out.println("\nVetor resultante da união:");
	        for (int valor : vetorUnido) {
	            System.out.print(valor + " ");
	        }

	        scanner.close();
	    }
}
