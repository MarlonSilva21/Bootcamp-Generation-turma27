package lista1exercicios;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		double primeiro, segundo, terceiro, r, s, d, expo, expo1;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Por favor me informe o primeiro numero inteiro: ");
		primeiro = teclado.nextDouble();
		
		System.out.printf("Por favor me informe o primeiro numero inteiro: ");
		segundo = teclado.nextDouble();
		
		System.out.printf("Por favor me informe o primeiro numero inteiro: ");
		terceiro = teclado.nextDouble();
		
		teclado.close();
		
		r  = primeiro + segundo;
		expo = r * r;
				
		s = segundo + terceiro;
		expo1 = s * s;

		d = expo + expo1 / 2;
		
		
		System.out.printf("\nResultado da primeira express�o: %.2f", expo);
		System.out.printf("\nResultado da segunda express�o: %.2f", expo1);
		System.out.printf("\nResultado da terceira express�o: %.2f\n", d);
		
		
	}

}
