package lista2exerciciosjava;

public class Exercicio2 {
 
public static void main(String[] args) {
		
		int pares = 0, impares = 0;
		
		for (int i = 1; i <=10; i++) {
			
			System.out.println(i);
			
			if (i % 2 == 0) {
				pares++;
			}
			else {
				impares++;
			}
		}
		
		System.out.println("\nTotal de número PARES = " + pares);
		System.out.println("Total de número IMPARES = " + impares);
	}
}
