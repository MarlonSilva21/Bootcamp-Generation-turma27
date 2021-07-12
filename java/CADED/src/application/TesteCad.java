package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;
import entities.Terceiro;

public class TesteCad {
	
	public static void main(String[] args) {
		
	Scanner leia = new Scanner (System.in);
	
	List <Funcionario> lista = new ArrayList<>(); //lista do tipo funcionario
	
	int numero;
	
	System.out.println("CADASTRO DE FUNCIONARIOS");
	
	System.out.println("Digite a quantidade de funcionários a ser cadastrados : ");
	numero = leia.nextInt();
		
	 for(int i = 0; i <= numero; i++) {
		 
		 System.out.println("Funcionário: "+ i);
		 System.out.println("Funcionário terceiro S/N : ");
		 char op = leia.next().toUpperCase().charAt(0);
		 
		 System.out.println("Digite a matricula do funcionario : ");
		 String matricula = leia.next();
		 
		 System.out.println("Digite as horas trabalhadas: ");
		 int horasTrabalhadas = leia.nextInt();
		 
		 System.out.println("Digite o valor por hora trabalhada : R$ ");
		 double valorHora = leia.nextDouble();
		 
		 
		 if (op == 'S') {
			 
			 System.out.println("Digite o valor do adicional : R$ ");
			 double adicional = leia.nextDouble();
			 lista.add(new Terceiro(matricula, horasTrabalhadas, valorHora, adicional));
		 
		 } else if (op =='N'){
			
			 lista.add(new Funcionario(matricula, horasTrabalhadas, valorHora));
			 
		 }
		 
	 }
	 System.out.println("\nFOLHA DE PAGAMENTO");
	 
	 for(Funcionario emp : lista) {
		 System.out.println("Matricula do colaborador :" + emp.getMatricula()+" salario : " + emp.salario());
	 }
	 
	 leia.close();
	}
	

}
