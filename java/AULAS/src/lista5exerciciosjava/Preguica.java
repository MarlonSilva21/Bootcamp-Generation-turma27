package lista5exerciciosjava;

public class Preguica extends Animal{

	public Preguica (String nome, String especie, String tipo, int idade, String somEmitido) {
		super(nome, especie, tipo, idade, somEmitido);
		
	}
	
	
	public void escalarArvores() {
		System.out.println("À preguiça está escalando uma arvore...");
	}
	
	public void som() {
		System.out.println("ZzZZZzzzZZzZzZZzzZZZZz");
	}
	
	
	

}
