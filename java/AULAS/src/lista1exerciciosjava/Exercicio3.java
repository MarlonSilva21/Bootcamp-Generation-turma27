package lista1exerciciosjava;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
Scanner teclado = new Scanner(System.in);
		
		int idade;
		System.out.printf("Informe sua idade: ");
		idade = teclado.nextInt();
		
		teclado.close();
		
		if(idade >= 10 && idade <= 14 ){
			System.out.println("\nINFANTIL \n");
			
		}else if(idade >= 15 && idade <= 17 ){
			System.out.println("\nJUVENIL\n");
			
		}else if(idade >= 18 && idade <= 25 ){
			System.out.println("\nADULTO\n");
		}
		
	}
}
