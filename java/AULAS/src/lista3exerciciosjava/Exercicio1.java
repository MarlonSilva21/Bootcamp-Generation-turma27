package lista3exerciciosjava;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int indiceValorMaior = 0;
		double valores[]  = new double [5];
		
		System.out.println("===============================");
		System.out.println("      COLETA DE PONTUAÇÕES     ");
		System.out.println("===============================");
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("Digite o %dº valor: ", i + 1);
			valores[i] = read.nextDouble();
		}
		
		System.out.println("\n\n     Pontuações    ");
		System.out.println("===================");
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("A " + (i + 1) + "º Pontuação é: " + valores[i] + "\n");

			if(valores[indiceValorMaior] < valores[i]){
				indiceValorMaior = i;
			}
		 }
		
		System.out.printf("\nA maior pontuação é a da "+ (indiceValorMaior + 1) + "º posição, com o valor de " + valores[indiceValorMaior]);
		
		read.close();
	  }
	
}
