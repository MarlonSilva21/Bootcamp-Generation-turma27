package lista1exerciciosjava;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num;
		
		System.out.printf("Informe um n�mero inteiro e positivo: ");
		num = teclado.nextInt();
		
		teclado.close();
		
		if(num == 0) {
			System.out.printf("O numero %d � neutro!", num);
		}
		else if(num % 2 == 0) {
			
			System.out.printf("\nO numero %d � Par e sua ra�z quadrada � ", num);
			System.out.println(Math.sqrt(num));
		}
		else {
			
			System.out.printf("\nO numero %d � �mpar e seu quadrado � ", num);
			System.out.println(Math.pow(num, 2));
		}
		
		
	}
}
