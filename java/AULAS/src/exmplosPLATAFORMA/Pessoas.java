package exmplosPLATAFORMA;

public class Pessoas {
	
	private String nome;
	private int matricula;
	
	
	public Pessoas(String nome, int matricula) {
		
		this.nome = nome;
		this.matricula = matricula;
		
	}

	 //----------- GETTERS AND SETTERS --------------//

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

}
