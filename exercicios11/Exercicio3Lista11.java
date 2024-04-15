package exercicios11;

public class Exercicio3Lista11 {
	public static void main(String[] args) {
		double[] vetor = { 10.5, 20.3, 30.2, 40.4, 50.1 };

		double soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];

		}

		double media = soma / vetor.length;

		System.out.println("A média dos elementos do vetor é: " + media);
	}
}
