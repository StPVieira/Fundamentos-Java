package lacoscondicionais;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		int opcao;
		Scanner scanner = new Scanner(System.in);

		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
		System.out.println("\n--Digite 1 para ver Indicação de um Livro--");
		System.out.println("--Digite 2 para ler uma Frase Motivacional--");
		System.out.println("--Digite 3 para receber uma Indicação de música--");

		opcao = Integer.valueOf(scanner.nextLine());

		switch (opcao) {
		case 1:
			System.out.println("Livro: Alquimista");
			break;
		case 2:
			System.out.println("Frase Motivacional: Não desista do curso da Generation");
			break;
		case 3:
			System.out.println("Indicação de música: Só preciso de dinheiro pra comprar o mé");
			break;
		default:
			System.out.println("Seleção inválida.");
			break;
		}
	}

}
