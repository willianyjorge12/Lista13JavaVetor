package exerciciosLista13;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Ex06 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o número de elementos do vetor: ");
	        int n = scanner.nextInt();
	        int[] vetor = new int[n];

	        System.out.println("Digite os elementos do vetor:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Elemento " + (i + 1) + ": ");
	            vetor[i] = scanner.nextInt();
	        }

	        // Mapeia os elementos e conta a frequência
	        Map<Integer, Integer> frequencia = new HashMap<>();
	        for (int num : vetor) {
	            frequencia.put(num, frequencia.getOrDefault(num, 0) + 1);
	        }

	        // Exibe as frequências
	        System.out.println("\nFrequência dos elementos:");
	        for (Map.Entry<Integer, Integer> entry : frequencia.entrySet()) {
	            System.out.println("Elemento " + entry.getKey() + ": " + entry.getValue() + " vez(es)");
	        }

	        scanner.close();
	    }
}
