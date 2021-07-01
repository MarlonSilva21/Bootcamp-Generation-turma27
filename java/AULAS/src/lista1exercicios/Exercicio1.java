package lista1exercicios;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		int ano, meses, dias, soma;
		
		System.out.println("************************");
		System.out.println("* Bem vindo ao sistema *");
		System.out.println("************************");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Para prosseguir informa quantos anos você já viveu : ");
		ano = teclado.nextInt();
		System.out.printf("agora os meses : ");
		meses = teclado.nextInt();
		System.out.printf("e por fim os dias : ");
		dias = teclado.nextInt();
		
		teclado.close();
		
		soma = ano * 365 + meses * 30 + dias;
		
		System.out.printf("\nParabéns, voce já viveu %d dias!!!", soma);
		
	}

}
