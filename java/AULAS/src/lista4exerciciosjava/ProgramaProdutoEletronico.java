package lista4exerciciosjava;

import java.util.Scanner;

public class ProgramaProdutoEletronico {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String ligar;
		
		ProdutoEletronico celular = new ProdutoEletronico();
		
		
		celular.marca = "Xiaomi";
		celular.modelo = "Redmi Note 8";
		celular.tipo = "Celular";
		celular.ligado = false; 
		celular.telaDigital = true;
		celular.teclado = false;
		celular.RAM = true;
		celular.processador = true;
		
		
		
		System.out.println("---APARELHO ELETRONICO---\n");	
		
		System.out.println("O aparelho " + celular.tipo + " é da marca " +celular.marca+" e do modelo "+ celular.modelo);
		
		System.out.println("\nCARACTERISTICAS: \n");
		System.out.println("Tela Digital: \t"+celular.telaDigital);
		System.out.println("Processador: \t"+celular.processador);
		System.out.println("Memória ram: \t"+celular.RAM);
		System.out.println("Teclado: \t"+celular.teclado);
		
		System.out.println("\n");
		
		System.out.println("Para ligar digite [ligar] :");
		ligar = leia.next().toUpperCase();
		
		if(ligar.equals("LIGAR")) {
			
			celular.ligar();
			System.out.println("Celular ligado: "+celular.ligado);
		}
		
		System.out.println("\nPara desligar digite [desligar] : ");
		ligar = leia.next().toUpperCase();
		
		if(ligar.equals("DESLIGAR")) {
			
			celular.desligar();
			System.out.println("\nCelular ligado: "+celular.ligado);
		}
		
		
		leia.close();
	}

}
