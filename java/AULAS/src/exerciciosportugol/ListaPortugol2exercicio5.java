package exerciciosportugol;


import java.util.Scanner;

public class ListaPortugol2exercicio5 {
	
	public static void main(String[] args) {
		
		// Usar a , como separador decimal no console
		
		Scanner teclado = new Scanner(System.in);
		
		double indicePoluicao;
		
		System.out.printf("Por favor informe o �ndice de polui��o: ");
		indicePoluicao = teclado.nextDouble();
		
		teclado.close();
		
		if(indicePoluicao >= 0.05 && indicePoluicao <= 0.25){
			System.out.println("\n�ndice de polu���o aceit�vel\n");
		}else if(indicePoluicao >= 0.3 && indicePoluicao < 0.4){
			System.out.println("\n�ndustrias do 1� grupo, suspender as atividades!\n");
		}else if(indicePoluicao >= 0.4 && indicePoluicao < 0.5){
			System.out.println("\n�ndustrias do 1� e 2� grupo, suspender as atividades!\n");
		}else if(indicePoluicao >= 0.5){
			System.out.println("\nAten��o todas as �ndustrias devem suspender as atividades!\n");
		}else{
			System.out.println("\nSem polui��o\n");
		}
	}

}
