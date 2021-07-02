package exerciciosportugol;


import java.util.Scanner;

public class ListaPortugol2exercicio5 {
	
	public static void main(String[] args) {
		
		// Usar a , como separador decimal no console
		
		Scanner teclado = new Scanner(System.in);
		
		double indicePoluicao;
		
		System.out.printf("Por favor informe o índice de poluição: ");
		indicePoluicao = teclado.nextDouble();
		
		teclado.close();
		
		if(indicePoluicao >= 0.05 && indicePoluicao <= 0.25){
			System.out.println("\nÍndice de poluíção aceitável\n");
		}else if(indicePoluicao >= 0.3 && indicePoluicao < 0.4){
			System.out.println("\nÍndustrias do 1º grupo, suspender as atividades!\n");
		}else if(indicePoluicao >= 0.4 && indicePoluicao < 0.5){
			System.out.println("\nÍndustrias do 1º e 2º grupo, suspender as atividades!\n");
		}else if(indicePoluicao >= 0.5){
			System.out.println("\nAtenção todas as índustrias devem suspender as atividades!\n");
		}else{
			System.out.println("\nSem poluição\n");
		}
	}

}
