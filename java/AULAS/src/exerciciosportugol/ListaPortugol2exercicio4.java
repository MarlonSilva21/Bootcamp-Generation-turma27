package exerciciosportugol;

import java.util.Scanner;

public class ListaPortugol2exercicio4 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num;
		
		System.out.printf("Escreva úm numero inteiro: ");
		num = teclado.nextInt();
		
		teclado.close();
		
		if(num == 0) {
			System.out.printf("O numero %d é neutro", num);
		}
		
		else if(num % 2 == 0){
			if(num > 0){
				System.out.printf("O numero %d é Par e Positivo", num);
			}else{
				System.out.printf("O numero %d é Par e Negativo", num);
			}
		}else{
			if(num > 0){
				System.out.printf("O numero %d é Ímpar e Positivo", num);
			}else{
				System.out.printf("O numero %d é Ímpar e Negativo", num);
			}
		}
	}

}
