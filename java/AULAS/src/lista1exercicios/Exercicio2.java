package lista1exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		int dia, dias, mes, meses, anos;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Por favor informe o n�mero de dias que voc� j� viveu: ");
		dias = teclado.nextInt();
		
		teclado.close();
		
		anos = dias / 365;	
		meses =  dias % 365;
		mes = meses / 30;
		dia = meses % 30;
		
		
		System.out.printf("\nVoc� j� viveu %d anos, %d meses e %d dias.", anos, mes, dia);
		
	}
}
