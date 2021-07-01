package lista1exercicios;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		double d, x1, x2, y1, y2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Digite o valor de X1: ");
		x1 = teclado.nextDouble();
		
		System.out.printf("Digite o valor de X2: ");
		x2 = teclado.nextDouble();
		
		System.out.printf("Digite o valor de Y3: ");
		y1 = teclado.nextDouble();
		
		System.out.printf("Digite o valor de Y4: ");
		y2 = teclado.nextDouble();
		
		
		teclado.close();
		
		d = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y2 - y1, 2));
		
		System.out.printf("\nA distancia de D é igual a %.2f ", d);
	}

}
