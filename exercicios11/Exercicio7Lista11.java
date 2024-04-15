package exercicios11;

public class Exercicio7Lista11 {
	public static void main(String[] args) {
		int[] vetor = { 34, 12, 24, 9, 5 };

		selectionSort(vetor);

		System.out.print("Vetor ordenado: ");
		for (int valor : vetor) {
			System.out.print(valor + " ");
		}
	}

	public static void selectionSort(int[] vetor) {
		for (int i = 0; i < vetor.length - 1; i++) {
			int indexMin = i;
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[indexMin]) {
					indexMin = j;
				}
			}

			if (indexMin != i) {
				int temp = vetor[i];
				vetor[i] = vetor[indexMin];
				vetor[indexMin] = temp;
			}
		}
	}
}
