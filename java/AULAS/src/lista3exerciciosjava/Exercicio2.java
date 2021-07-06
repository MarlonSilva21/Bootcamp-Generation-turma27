package lista3exerciciosjava;

//import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		//Random r = new Random();
		
		int maiorPontuacao = 0, contador = 0;
		double media = 0.0, soma = 0.0;
		int lancamentos[] = new int [10];
		
		for(int i = 0; i < 10; i++) {
			
			lancamentos[i] = (int) ( Math.random() * 6 ) + 1;
			System.out.print( (i+1 ) + "º Lançamento: " + lancamentos[i] + "\n");
			
			soma += lancamentos[i];
			
			if(maiorPontuacao < lancamentos[i]){
				maiorPontuacao = lancamentos[i];
			}
		}
		
		for(int i = 0 ; i < 10; i++) {
			if(maiorPontuacao == lancamentos[i]){
				maiorPontuacao = lancamentos[i];
				contador++;
			}
		}
		
		media = soma / 10;
				
		System.out.println("================================================");
		System.out.printf(" A média artmética dos lançamentos é %.2f \n", media);
		System.out.println("================================================");
		System.out.printf(" A maior pontuação foi %d e foi  sorteada %d vezes\n", maiorPontuacao ,contador);
		System.out.println("================================================");
		
		
		leia.close();
	}
}
