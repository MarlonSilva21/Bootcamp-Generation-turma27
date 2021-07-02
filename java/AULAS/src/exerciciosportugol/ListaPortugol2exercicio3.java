package exerciciosportugol;

import java.util.Scanner;

public class ListaPortugol2exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2, num3, num4, q1, q2, q3, q4;
		
		System.out.printf("Por favor digite o 1º número: ");
		num1 = teclado.nextInt();
		System.out.printf("Por favor digite o 2º número: ");
		num2 = teclado.nextInt();
		System.out.printf("Por favor digite o 3º número: ");
		num3 = teclado.nextInt();
		System.out.printf("Por favor digite o 4º número: ");
		num4 = teclado.nextInt();
		
		teclado.close();
		
		q1 = (int) Math.pow(num1, 2);
		q2 = (int) Math.pow(num2, 2);
		q3 = (int) Math.pow(num3, 2);
		q4 = (int) Math.pow(num4, 2);
		
		if(q3 > 100) {
			System.out.printf("\n %d",q3);
		}
		else {
			
			System.out.printf("\nO quadrado de %d é %d ", num1, q1);
			System.out.printf("\nO quadrado de %d é %d ", num2, q2);
			System.out.printf("\nO quadrado de %d é %d ", num3, q3);
			System.out.printf("\nO quadrado de %d é %d ", num4, q4);
		}
	}

}
