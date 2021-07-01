package lista1exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int segundo, segundos, minutos, horas, resto;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Por favor, informe a duração do evento em segundos: ");
		segundos = teclado.nextInt();
		
		teclado.close();
		
		horas = segundos / 3600;
		resto = segundos % 3600;
		minutos = resto / 60;
		segundo = resto % 60;
		
		System.out.printf("%dh : %dmin : %dseg", horas, minutos, segundo);
		
		
	}

}
