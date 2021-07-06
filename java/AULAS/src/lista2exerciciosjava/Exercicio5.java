package lista2exerciciosjava;

import java.util.Scanner;

public class Exercicio5 {
	
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, soma = 0;
		
		do {
			System.out.print("Digite um número: ");
			num = leia.nextInt();
			
			soma += num;
			
		} while(num != 0);

		System.out.printf("\nSoma dos números digitados = %d\n", soma);
			
			
		leia.close();
	}

}
