package exercicios11;

import java.util.HashMap;
import java.util.Map;

public class Exercicio6Lista11 {
	public static void main(String[] args) {
		int[] vetor = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };

		Map<Integer, Integer> frequencia = new HashMap<>();

		for (int num : vetor) {
			if (frequencia.containsKey(num)) {
				frequencia.put(num, frequencia.get(num) + 1);
			} else {
				frequencia.put(num, 1);
			}
		}

		System.out.println("Frequência dos elementos:");
		for (Map.Entry<Integer, Integer> entry : frequencia.entrySet()) {
			System.out.println("Elemento " + entry.getKey() + " aparece " + entry.getValue() + " vezes");
		}
	}
}