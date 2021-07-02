package lista1exerciciosjava;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num;
		
		System.out.printf("Informe um número inteiro e positivo: ");
		num = teclado.nextInt();
		
		teclado.close();
		
		if(num == 0) {
			System.out.printf("O numero %d é neutro!", num);
		}
		else if(num % 2 == 0) {
			
			System.out.printf("\nO numero %d é Par e sua raíz quadrada é ", num);
			System.out.println(Math.sqrt(num));
		}
		else {
			
			System.out.printf("\nO numero %d é Ímpar e seu quadrado é ", num);
			System.out.println(Math.pow(num, 2));
		}
		
		
	}
}
