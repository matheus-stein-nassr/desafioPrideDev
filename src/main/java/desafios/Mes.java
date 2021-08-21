package desafios;

import java.util.Scanner;

public class Mes {

	// Usando switch-case vamos construir um sistema que imprima qual mes equivalente ao numero digitado no teclado.

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 1;

		while (numero != 0) {
			System.out.println("Informe um número para verificar o Mês Correspondente ou digite 0 para SAIR: ");

			numero = entrada.nextInt();

			switch (numero) {

			case 1:
				System.out.println("Janeiro");
				break;
			case 2:
				System.out.println("Fevereiro");
				break;
			case 3:
				System.out.println("Março");
				break;
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Maio");
				break;
			case 6:
				System.out.println("Junho");
				break;
			case 7:
				System.out.println("Julho");
				break;
			case 8:
				System.out.println("Agosto");
				break;
			case 9:
				System.out.println("Setembro");
				break;
			case 10:
				System.out.println("Outubro");
				break;
			case 11:
				System.out.println("Novembro");
				break;
			case 12:
				System.out.println("Dezembro");
				break;

			// aqui usei case 0 para parar o laco de repeticao
			case 0:
				System.exit(numero);

				// aqui usei o default para identificar quando nao for digitado um numero
				// correspondente a um mes
			default:
				System.out.println("Esse mes nao existe!");
			}
		}

		entrada.close();
	}
}