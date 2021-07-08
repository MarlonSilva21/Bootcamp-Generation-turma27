package lista5exerciciosjava;

public class Animal {
	
	private String nome;
	private String especie;
	private String tipo;
	private int idade;
	private String somEmitido;
	
	
	public Animal (String nome, String tipo, String especie, int idade, String somEmitido) {
		
		this.nome = nome;
		this.tipo = tipo;
		this.especie = especie;
		this.idade = idade;
		this.somEmitido = somEmitido;
		
				
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getSomEmitido() {
		return somEmitido;
	}


	public void setSomEmitido(String somEmitido) {
		this.somEmitido = somEmitido;
	}
	
	
	
	
	
	
	

}
