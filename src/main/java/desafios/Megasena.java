package desafios;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Megasena {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos numeros voce deseja gerar: ");
		int quantidadeNumeros = entrada.nextInt();

		System.out.println("Quantos jogos voce deseja gerar: ");
		int quantidadeJogos = entrada.nextInt();

		if (quantidadeNumeros < 6 || quantidadeNumeros > 15) {
			System.out.print("Quantidade de numeros incorreta!");
		}

		Random gerador = new Random();
		for (int i = 0; i < quantidadeJogos; i++) {
			HashSet<Integer> sorteio = new HashSet<>();

			while (sorteio.size() < quantidadeNumeros) {

				sorteio.add(gerador.nextInt(60) + 1);
			}
			System.out.println("Resultado do sorteio: " + sorteio);
		}

		entrada.close();

	}
}