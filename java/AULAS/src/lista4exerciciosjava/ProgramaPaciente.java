package lista4exerciciosjava;

import java.util.Scanner;

public class ProgramaPaciente {
	
	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	Paciente paciente1 = new Paciente();
	
	paciente1.nome = "João";
	paciente1.doenca = "Covid-19";
	paciente1.situacao = "leve";
	paciente1.tratamento = "Repouso e anti-térmico";
	paciente1.doseRemedio = 1;
	
	
	System.out.println("=======================================");
	System.out.println("          Quadro de Pacientes          ");
	System.out.println("=======================================");
	
	System.out.println("\nPACIENTE 01\n");
	
	System.out.println("Paciente   : "+paciente1.nome);
	System.out.println("Doença     : "+ paciente1.doenca);
	System.out.println("Situação   : "+ paciente1.situacao);
	System.out.println("Tratamento : "+ paciente1.tratamento);
	System.out.println("Doses diárias : "+paciente1.doseRemedio);
	
	
	
	leia.close();
	
	}

}
