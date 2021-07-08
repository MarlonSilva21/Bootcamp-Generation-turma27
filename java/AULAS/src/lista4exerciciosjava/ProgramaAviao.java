package lista4exerciciosjava;

public class ProgramaAviao {
	
	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();
		
		aviao1.modelo = "BIMOTOR";
		aviao1.rodas = 3;
		aviao1.tipo = "Passageiro 14 lugares";
		aviao1.noAr = false;
		aviao1.ligado = false;
		aviao1.velocidade = 0;
		
		
		System.out.println("------TESTE DE DECOLAGEM-----\n");
		
		System.out.println("Velocimetro: "+ aviao1.velocidade + " NO AR " + aviao1.noAr + " LIGADO " + aviao1.ligado);
		
		aviao1.ligar();
		aviao1.aumentarVelocidade();
		aviao1.diminuirVelocidade();
		aviao1.decolando();
		aviao1.aumentarVelocidade(40);
		
		System.out.println("Velocimetro: "+ aviao1.velocidade + " NO AR " + aviao1.noAr + " LIGADO " + aviao1.ligado);
		
		aviao1.diminuirVelocidade(40);
		
		System.out.println("Velocimetro: "+ aviao1.velocidade + " NO AR " + aviao1.noAr + " LIGADO " + aviao1.ligado);
		
		aviao1.pousar();
		
		System.out.println("Velocimetro: "+ aviao1.velocidade + " NO AR " + aviao1.noAr + " LIGADO " + aviao1.ligado);

		aviao1.desligar();
		
		
		System.out.println("Velocimetro: "+ aviao1.velocidade + " NO AR " + aviao1.noAr + " LIGADO " + aviao1.ligado);
		
		
		
		
		
		
		
		
		
		
//		aviao1.turbinas = 4;
//		aviao1.modelo = "boeing 132";
//		aviao1.tipo = "comercial";
//		aviao1.combustivel = "Diesel";
//		
//		
//		System.out.println("--------AVIÃO--------\n");
//		
//		System.out.println("Avião :"+aviao1.modelo);
//		System.out.println("Tipo: "+aviao1.tipo);
//		System.out.println("Turbinas: "+aviao1.turbinas);
//		System.out.println("Combustível: "+aviao1.combustivel);
//		
//		System.out.println("\n\n");
//		
//		aviao1.aterrissar();
		
		
		
		
	}
	
	
	
	
		
}
