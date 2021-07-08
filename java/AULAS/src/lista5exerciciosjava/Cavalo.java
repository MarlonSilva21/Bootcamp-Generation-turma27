package lista5exerciciosjava;

public class Cavalo extends Animal{
	
	
	public Cavalo(String nome, String especie, String tipo, int idade, String somEmitido) {
		super(nome, especie, tipo, idade, somEmitido);
		
	}
	
	
	public void som() {
		System.out.println("IIIIIRRRRIIIINNN");
	}

	public void correr() {
		System.out.println("Cavalo correndo...");
	}
	
	
	
}
