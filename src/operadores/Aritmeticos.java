package operadores;

public class Aritmeticos {

	public static void main(String[] args) {
		int x = 4;
		int y = 2;
		int z = 3;
		int soma;
		soma = x * (y + z);
		
		x += y;
		
		soma = x + y;
		
		System.out.println("A soma é: " + soma);
		System.out.println("A soma é: " + (y + z));
		System.out.println("O valor de x é " + x);
	}

}
