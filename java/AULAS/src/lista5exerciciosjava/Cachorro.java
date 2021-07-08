package lista5exerciciosjava;

public class Cachorro extends Animal{
	
	private String raca;

	public Cachorro(String nome, String especie, String tipo, int idade, String somEmitido, String raca) {
		
		super(nome, especie, tipo, idade, somEmitido);
		this.raca = raca;
		
	}
	
	public void latir() {
		System.out.println("Au Au Au Auu....");
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	

}
