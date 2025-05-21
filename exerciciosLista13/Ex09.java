package exerciciosLista13;
import java.util.ArrayList;
import java.util.Scanner;
public class Ex09 {
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

	        // Elemento a ser removido
	        System.out.print("\nDigite o elemento que deseja remover: ");
	        int remover = scanner.nextInt();

	        // Armazenar os elementos restantes em uma lista
	        ArrayList<Integer> novoVetor = new ArrayList<>();
	        for (int valor : vetor) {
	            if (valor != remover) {
	                novoVetor.add(valor);
	            }
	        }

	        // Exibição do novo vetor
	        System.out.println("\nVetor após remoção de \"" + remover + "\":");
	        if (novoVetor.isEmpty()) {
	            System.out.println("Todos os elementos foram removidos. Vetor está vazio.");
	        } else {
	            for (int valor : novoVetor) {
	                System.out.print(valor + " ");
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }
}
