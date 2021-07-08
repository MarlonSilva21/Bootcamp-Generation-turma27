package lista5exerciciosjava;

public class ProgramaAnimais {
	
	public static void main(String[] args) {
		
		Cachorro cachorro = new  Cachorro("Dog","Cachorro", "Canino", 5, "Latido", "Rottweiler");
		
		Cavalo cavalo = new Cavalo("Pé de pano", "Cavalo", "Equidae", 10, "Relinchado");
		
		Preguica preguica = new Preguica("Dona preguiça", "Preguiça" , "Bradypodidae", 12,"Grunhido");
		
		
		
		System.out.println("\nSom emitido pelo "+cachorro.getTipo());
		System.out.println(cachorro.getSomEmitido());
		cachorro.latir();
		
		System.out.println("\nSom emitido pelo "+cavalo.getTipo());
		System.out.println(cavalo.getSomEmitido());
		cavalo.som();

		System.out.println("\nSom emitido pelo "+preguica.getTipo());
		System.out.println(preguica.getSomEmitido());
		preguica.som();
	}

}
