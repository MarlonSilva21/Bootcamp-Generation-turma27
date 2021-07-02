package exerciciosportugol;

import java.util.Scanner;

public class ListaPortugol2exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int idade;
		System.out.printf("Informe sua idade: ");
		idade = teclado.nextInt();
		
		teclado.close();
		
		if(idade >= 5 && idade <= 7 ){
			System.out.println("\nINFANTIL A\n");
			
		}else if(idade >= 8 && idade <= 11 ){
			System.out.println("\nINFANTIL B\n");
			
		}else if(idade >= 12 && idade <= 13 ){
			System.out.println("\nJUVENIL A\n");
			
		}else if(idade >= 14 && idade <= 17 ){
			System.out.println("\nJUVENIL B\n");
			
		}else if(idade > 18){
			System.out.println("\nADULTO\n");
		}
	}
	
	

}
