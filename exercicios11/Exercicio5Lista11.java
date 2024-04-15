package exercicios11;

public class Exercicio5Lista11 {
	public static void main(String[] args) {
		int[] vetor = { 12, 23, 34, 45, 56, 67, 78, 89, 90 };

		int contagem = 0;

		for (int numero : vetor) {
			if (numero % 2 == 0) {
				contagem++;
			}
		}

		System.out.println("Quantidade de números pares no vetor: " + contagem);

	}
}
