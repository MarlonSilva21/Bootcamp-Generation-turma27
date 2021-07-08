package lista4exerciciosjava;

import java.util.Scanner;

public class ProgramaPatinete {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Patinete patinete1 = new Patinete();
		
		patinete1.tipo = "Manual";
		patinete1.rodas = 2;
		patinete1.materialFeito = "Plástico e aço";
		patinete1.motorizado = false;
		
		
		System.out.println("---------- PATINETE --------\n");
		
		System.out.println("Tipo : \t\t"+ patinete1.tipo);
		System.out.println("Rodas : \t"+ patinete1.rodas);
		System.out.println("Material : \t"+ patinete1.materialFeito);
		System.out.println("Motorizado : \t"+ patinete1.motorizado);
		System.out.println("\n----------------------------\n");
		
		
		patinete1.velocidade = 0;
		
		
		System.out.println("\nVelocidade atual: "+patinete1.velocidade);
		
		System.out.println("\nAcelerando...");
		System.out.println("Acelerando...");
		System.out.println("Acelerando...");
		
		for(int i = 0; i < 10; i++) {
			
			patinete1.acelerar();
		}
		
		System.out.println("\nVelocidade atual: "+patinete1.velocidade);
		
		System.out.println("\nDesacelerando...");
		System.out.println("Desacelerando...");
		System.out.println("Desacelerando...");
		
		for(int i = 0; i < 10; i++) {
			
			patinete1.desacelerar();
		}
		
		System.out.println("\nVelocidade atual: "+patinete1.velocidade);
		
		
		leia.close();
		
		
	}

}
