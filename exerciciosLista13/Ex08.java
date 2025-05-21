package exerciciosLista13;
import java.util.Scanner;
public class Ex08 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Entrada do tamanho do vetor
	        System.out.print("Digite a quantidade de elementos do vetor: ");
	        int n = scanner.nextInt();
	        int[] vetor = new int[n];

	        // Leitura dos elementos do vetor
	        System.out.println("Digite os elementos do vetor:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Elemento " + (i + 1) + ": ");
	            vetor[i] = scanner.nextInt();
	        }

	        // Leitura do elemento a ser buscado
	        System.out.print("\nDigite o elemento que deseja buscar: ");
	        int buscado = scanner.nextInt();

	        // Verificação da existência do elemento
	        boolean encontrado = false;
	        for (int valor : vetor) {
	            if (valor == buscado) {
	                encontrado = true;
	                break;
	            }
	        }

	        // Resultado
	        if (encontrado) {
	            System.out.println("O elemento " + buscado + " está presente no vetor.");
	        } else {
	            System.out.println("O elemento " + buscado + " não foi encontrado no vetor.");
	        }

	        scanner.close();
	    }
}
