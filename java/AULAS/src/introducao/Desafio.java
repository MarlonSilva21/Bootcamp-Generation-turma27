package introducao;

import java.util.Scanner;

public class Desafio {
	
	public static void main(String[] args) {
		
	    Scanner teclado = new Scanner(System.in) ;
		int numero;
		
		System.out.println("Informe um número inteiro e positivo: ");
		numero = teclado.nextInt();
		
		teclado.close();
		
		if(numero == 0) {
			System.out.printf("O numero %d é neutro", numero);	
		}
		else if(numero < 0) {
			System.out.printf("Você informou um numero negativo, não é possível definir se é par ou ímpar");
		}
		else if (numero % 2 == 0){
			System.out.printf("O numero %d é par", numero);
		}
		else  {
			System.out.printf("O numero %d é ímpar", numero);
		}
		
	}

}
