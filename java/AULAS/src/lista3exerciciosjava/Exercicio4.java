package lista3exerciciosjava;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		final int LINHA = 3;
		final int COLUNA = 3;
		
		int matriz[][] = new int [LINHA][COLUNA];
		int somaGeral = 0, somaDiagonal = 0, valor = 0;
		
		System.out.println("====== MATRIZ ======");
		
		for(int indiceLinha = 0; indiceLinha < LINHA; indiceLinha++) {
			System.out.println("LINHA " + indiceLinha);
			
			for(int indiceColuna = 0; indiceColuna < COLUNA; indiceColuna++) {
				
				System.out.printf("  coluna " + indiceColuna + ": ");
				valor = leia.nextInt();
				
				matriz[indiceLinha][indiceColuna] = valor;
		 		somaGeral += valor;
				
				
				if(indiceLinha == indiceColuna){
		 			somaDiagonal += valor;
		 		}
				
			}
		}
		
		leia.close();
		
		System.out.printf("Soma de todos os valores     : %d ", somaGeral);
		System.out.printf("\nSoma da diagonal principal : %d", somaDiagonal);
		
		
	}

}
