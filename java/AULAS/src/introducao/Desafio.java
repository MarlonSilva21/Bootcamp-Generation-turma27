package introducao;

import java.util.Scanner;

public class Desafio {
	
	public static void main(String[] args) {
		
	    Scanner teclado = new Scanner(System.in) ;
		int numero;
		
		System.out.println("Informe um n�mero inteiro e positivo: ");
		numero = teclado.nextInt();
		
		teclado.close();
		
		if(numero == 0) {
			System.out.printf("O numero %d � neutro", numero);	
		}
		else if(numero < 0) {
			System.out.printf("Voc� informou um numero negativo, n�o � poss�vel definir se � par ou �mpar");
		}
		else if (numero % 2 == 0){
			System.out.printf("O numero %d � par", numero);
		}
		else  {
			System.out.printf("O numero %d � �mpar", numero);
		}
		
	}

}
