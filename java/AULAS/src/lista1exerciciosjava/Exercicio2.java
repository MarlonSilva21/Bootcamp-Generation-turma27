package lista1exerciciosjava;

import java.util.Scanner;

public class Exercicio2 {
	
public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.printf("Informe o 1� n�mero: ");
		n1 = teclado.nextInt();
		
		System.out.printf("Informe o 2� n�mero: ");
		n2 = teclado.nextInt();
		
		System.out.printf("Informe o 3� n�mero: ");
		n3 = teclado.nextInt();
		
		teclado.close();
		
		if (n3 > n1)
		    if (n1 > n2)
		      System.out.printf("A ordem crescente: %d %d %d\n", n2, n1, n3);
		    else if (n2 < n3)
		    	System.out.printf("A ordem crescente: %d %d %d\n", n1, n2, n3);
		  if (n1 > n2)
		    if (n2 > n3)
		    	System.out.printf("A ordem crescente: %d %d %d\n", n3, n2, n1);
		    else if (n3 < n1)
		    	System.out.printf("A ordem crescente: %d %d %d\n", n2, n3, n1);
		  if (n2 > n1)
		    if (n1 > n3)
		    	System.out.printf("A ordem crescente: %d %d %d\n", n3, n1, n2);
		    else if (n3 < n2)
		    	System.out.printf("A ordem crescente: %d %d %d\n", n1, n3, n2);
		  
	}
}
