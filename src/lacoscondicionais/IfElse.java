package lacoscondicionais;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float nota1, nota2, media;
		
		System.out.println("Digite a nota da P1: ");
		nota1 = scanner.nextFloat();
		
		System.out.println("Digite a nota da P2: ");
		nota2 = scanner.nextFloat();
		
		media = (nota1 + nota2) / 2;
		if(media >= 5) {
			System.out.println("Parabéns, você foi aprovado! " + media);
		}else {
			System.out.println("Reprovado, estude mais! " + media);
		}
		
		scanner.close();

	}

}
