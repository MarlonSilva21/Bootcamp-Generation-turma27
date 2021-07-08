package lista4exerciciosjava;

public class Cliente {
	
	public String nome;
	public int idade;
	public String cpf;
	public String endereco;
	public String cidade;
	public String email;
	public String telefone;
	public char sexo;
	
	public boolean atividade;
	
	
	public void ativo() {
		
		atividade = true;
		System.out.println("Cliente ativo na plataforma");
	
	}
	public void inativo() {
		atividade = false;
		System.out.println("Cliente inativo na plataforma");
	}
	
	
	public int verificarIdade(int idade) {
		
		if(idade < 18) {
			System.out.println("Este cliente não tem idade suficiente para ter uma conta em nosso ecommerce");
		}
		else {
			System.out.println("Este cliente tem idade suficiente para manter uma conta em nosso ecommerce");
		}
		
		return idade;
	}

	

}
