package lista1exerciciosjava;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Informe o 1º número: ");
		num1 = teclado.nextInt();
		System.out.println("Informe o 2º número: ");
		num2 = teclado.nextInt();
		System.out.println("Informe o 3º número: ");
		num3 = teclado.nextInt();
		
		teclado.close();
		
		if (num1 > num2 && num1 > num3) {
			System.out.printf("O maior número é %d", num1);
		}

		else if (num2 > num1 && num2 > num3) {
			System.out.printf("O maior número é %d", num2);
		}
		else{
			System.out.printf("O maior número é %d", num3);
		}

	}

}
