package variaveis;
import java.util.Scanner;
public class EntradaSaida {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int idade;
		
		String nome;
		
		System.out.println("Entre com sua idade: ");
		idade = Integer.valueOf(scanner.nextLine());
		System.out.println("Entre com sua nome: ");
		nome = scanner.nextLine();
		System.out.println("Sua idade é " + idade + " e seu nome é " + nome);
	}

}
