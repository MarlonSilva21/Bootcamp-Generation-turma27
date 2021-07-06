package lista3exerciciosjava;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		final int LINHA = 4;
		final int COLUNA = 6;
		
		int n1[][] = new int[LINHA][COLUNA];
		int n2[][] = new int[LINHA][COLUNA];
		int m1[][] = new int[LINHA][COLUNA];
		int m2[][] = new int[LINHA][COLUNA];
		
		int valor, soma; 
		
		System.out.println("\n\n========= MATRIZ N1 ==========");
		
		for(int indiceLinha = 0; indiceLinha < LINHA; indiceLinha++){
			
			System.out.printf("\nLinha: " + (indiceLinha + 1)+ "\n");
			
			for(int indiceColuna = 0; indiceColuna < COLUNA; indiceColuna++){
				
				System.out.printf("\tColunha: " + (indiceColuna + 1) + " : ");
				valor = leia.nextInt();

				n1[indiceLinha][indiceColuna] = valor;
			}
			
		}
		
		System.out.println("\n\n========= MATRIZ N2 ==========\n");
		
		for(int indiceLinha = 0; indiceLinha < LINHA; indiceLinha++){
			
			System.out.printf("\nLinha: " + (indiceLinha + 1)+ "\n");
			
			for(int indiceColuna = 0; indiceColuna < COLUNA; indiceColuna++){
				
				System.out.printf("\tColunha: " + (indiceColuna + 1) + " : ");
				valor = leia.nextInt();

				n2[indiceLinha][indiceColuna] = valor;
			}
			
		}
		
		System.out.println("\n======= MATRIZ DA SOMA DE N1 E N2 ========\n\n");
		
		for(int indiceLinha = 0; indiceLinha < LINHA; indiceLinha++){
			
			
			for(int indiceColuna = 0; indiceColuna < COLUNA; indiceColuna++){
				
				soma = n1[indiceLinha][indiceColuna] + n2[indiceLinha][indiceColuna];
				m1[indiceLinha][indiceColuna] = soma;

				
			}
			
		}
		
		System.out.println("\n======= MATRIZ DA SOMA DE N1 E N2 ========\n\n");
		
		for(int indiceLinha = 0; indiceLinha < LINHA; indiceLinha++){
			
			
			for(int indiceColuna = 0; indiceColuna < COLUNA; indiceColuna++){
				
				soma = n1[indiceLinha][indiceColuna] - n2[indiceLinha][indiceColuna];
				m2[indiceLinha][indiceColuna] = soma;

				
			}
			
		}
		
		leia.close();
	}
}
