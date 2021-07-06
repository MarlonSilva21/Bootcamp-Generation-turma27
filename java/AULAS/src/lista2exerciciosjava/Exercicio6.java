package lista2exerciciosjava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
	
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int multiplo3 = 0, cont = 0, num;
		double media = 0.0;
		
		do {
			System.out.print("Digite um numero: ");
			num = leia.nextInt();
			
			if(num % 3 == 0) {
				multiplo3 += num;
				cont++;
			}
			
		}while(num != 0);
		
		media = multiplo3 / cont;
		
		System.out.printf("Média dos números múltiplos de 3 = %.2f\n", media);
		
		leia.close();
	}

}
