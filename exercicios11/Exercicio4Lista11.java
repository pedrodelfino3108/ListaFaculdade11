package exercicios11;

public class Exercicio4Lista11 {
	public static void main(String[] args) {
		int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		invertVetor(vetor);

		System.out.print("Vetor invertido: ");
		for (int valor : vetor) {
			System.out.print(valor + " ");
		}
	}

	public static void invertVetor(int[] vetor) {
		int temp;
		int n = vetor.length;
		for (int i = 0; i < n / 2; i++) {
			temp = vetor[i];
			vetor[i] = vetor[n - 1 - i];
			vetor[n - 1 - i] = temp;
		}
	}
}