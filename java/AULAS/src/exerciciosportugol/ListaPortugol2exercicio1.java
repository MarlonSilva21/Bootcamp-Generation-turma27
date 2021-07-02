package exerciciosportugol;

import java.util.Scanner;

public class ListaPortugol2exercicio1 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		double pesoTomates, multa = 0, excesso = 0;
		
		System.out.printf("**************************************************\n");
		System.out.printf("Seja bem vindo ao sistema para pesar seus tomates\n");
		System.out.printf("**************************************************\n");
		System.out.printf("\nPor favor informe o Kilograma dos tomates: ");
		pesoTomates = teclado.nextDouble();
		
		teclado.close();
		
		if(pesoTomates > 50) {
			
			excesso = pesoTomates - 50;
			multa = excesso * 4;
			
			
			System.out.printf("Você ultrapassou o limite de %.0f quilos\n", excesso);
			System.out.printf("Valor da multa à pagar %.2f ", multa);
		}
		else {
			System.out.printf("\nVocê não precisa pagar multas\n");
			System.out.printf("\nExcesso: %.2f \n", excesso);
			System.out.printf("Multa: %.2f \n", multa);
		}

	}

}
