package exercicios11;

public class Exercicio8Lista11 {
	public static void main(String[] args) {
		int[] vetor = { 5, 8, 12, 15, 22, 30 };

		int elementoProcurado = 15;

		boolean encontrado = contemElemento(vetor, elementoProcurado);

		if (encontrado) {
			System.out.println("O elemento " + elementoProcurado + " está presente no vetor.");
		} else {
			System.out.println("O elemento " + elementoProcurado + " não está presente no vetor.");
		}
	}

	public static boolean contemElemento(int[] vetor, int elementoProcurado) {
		for (int elemento : vetor) {
			if (elemento == elementoProcurado) {
				return true;
			}
		}
		return false;

	}
}
