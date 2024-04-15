package exercicios11;

public class Exercicio2Lista11 {
	public static void main(String[] args) {
		int[] vetor = { 34, 78, 12, 89, 65, 90, 10, 3, 99 };

		int maior = vetor[0];
		int menor = vetor[0];

		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] > menor) {
				menor = vetor[i];
			}
		}

		System.out.println("O maior valor no vetor é: " + maior);
		System.out.println("O menor valor no vetor é: " + menor);
	}
}
