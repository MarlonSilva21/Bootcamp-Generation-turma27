package lista1exerciciosjava;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Informe o 1� n�mero: ");
		num1 = teclado.nextInt();
		System.out.println("Informe o 2� n�mero: ");
		num2 = teclado.nextInt();
		System.out.println("Informe o 3� n�mero: ");
		num3 = teclado.nextInt();
		
		teclado.close();
		
		if (num1 > num2 && num1 > num3) {
			System.out.printf("O maior n�mero � %d", num1);
		}

		else if (num2 > num1 && num2 > num3) {
			System.out.printf("O maior n�mero � %d", num2);
		}
		else{
			System.out.printf("O maior n�mero � %d", num3);
		}

	}

}
