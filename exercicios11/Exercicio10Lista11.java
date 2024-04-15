package exercicios11;

public class Exercicio10Lista11 {
	public static void main(String[] args) {
		int[] vetor1 = { 1, 3, 5 };
		int[] vetor2 = { 2, 4, 6, 8 };

		int[] vetor_unido = new int[vetor1.length + vetor2.length];

		int posicaoAtual = 0;
		for (int valor : vetor1) {
			vetor_unido[posicaoAtual++] = valor;
		}
		for (int valor : vetor2) {
			vetor_unido[posicaoAtual++] = valor;
		}

		System.out.print("Vetor Unido: ");
		for (int valor : vetor_unido) {
			System.out.print(valor + " ");
		}
	}
}
