package exerciciosportugol;

import java.util.Scanner;

public class ListaPortugol2exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		final double VALOR_HORA = 10.0;
		final double VALOR_HORA_EXCEDENTE = 20.0;
		String codigo;
		int horas_trabalhadas = 0;
		double salario = 0.00, excesso = 0.00;
		
		System.out.printf("Por favor informe o código: ");
		codigo = teclado.next();
		System.out.printf("Informe o número de horas trabalhadas: ");
		horas_trabalhadas = teclado.nextInt();
		
		teclado.close();
		
		if(horas_trabalhadas > 50) {
			excesso = (horas_trabalhadas - 50) * VALOR_HORA_EXCEDENTE;
			salario = (50 * VALOR_HORA) + excesso;
			
			System.out.printf("\nSalário total R$ %.2f \n", salario);
			System.out.printf("Salário excedente R$ %.2f\n", excesso);
		}
		else {
			salario = horas_trabalhadas * VALOR_HORA;
			
			System.out.printf("\nCódigo do funcionário:  %s\n ", codigo);
			System.out.printf("\nSalário total R$ %.2f \n", salario);
			System.out.printf("Salário excedente R$ %.2f\n", excesso);
		}
		
		
	}

}
