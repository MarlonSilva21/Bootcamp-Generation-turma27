package lista3exerciciosjava;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int indiceValorMaior = 0;
		double valores[]  = new double [5];
		
		System.out.println("===============================");
		System.out.println("      COLETA DE PONTUA��ES     ");
		System.out.println("===============================");
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("Digite o %d� valor: ", i + 1);
			valores[i] = read.nextDouble();
		}
		
		System.out.println("\n\n     Pontua��es    ");
		System.out.println("===================");
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("A " + (i + 1) + "� Pontua��o �: " + valores[i] + "\n");

			if(valores[indiceValorMaior] < valores[i]){
				indiceValorMaior = i;
			}
		 }
		
		System.out.printf("\nA maior pontua��o � a da "+ (indiceValorMaior + 1) + "� posi��o, com o valor de " + valores[indiceValorMaior]);
		
		read.close();
	  }
	
}
