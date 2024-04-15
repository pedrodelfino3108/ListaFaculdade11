package exercicios11;

import java.util.ArrayList;
import java.util.List;

public class Exercicio9Lista11 {
	public static void main(String[] args) {
		int[] vetor = { 7, 12, 7, 29, 7, 40 };

		int elementoParaRemover = 7;

		int[] novoVetor = removerElemento(vetor, elementoParaRemover);

		System.out.print("Vetor após remoção do elemento " + elementoParaRemover + ": ");
		for (int valor : novoVetor) {
			System.out.print(valor + " ");
		}
	}

	public static int[] removerElemento(int[] vetor, int elementoParaRemover) {
		List<Integer> novaLista = new ArrayList<>();

		for (int elemento : vetor) {
			if (elemento != elementoParaRemover) {
				novaLista.add(elemento);
			}
		}

		int[] novoVetor = new int[novaLista.size()];
		for (int i = 0; i < novaLista.size(); i++) {
			novoVetor[i] = novaLista.get(i);
		}

		return novoVetor;
	}
}
