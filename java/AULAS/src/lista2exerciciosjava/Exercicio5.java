package lista2exerciciosjava;

import java.util.Scanner;

public class Exercicio5 {
	
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, soma = 0;
		
		do {
			System.out.print("Digite um n�mero: ");
			num = leia.nextInt();
			
			soma += num;
			
		} while(num != 0);

		System.out.printf("\nSoma dos n�meros digitados = %d\n", soma);
			
			
		leia.close();
	}

}
