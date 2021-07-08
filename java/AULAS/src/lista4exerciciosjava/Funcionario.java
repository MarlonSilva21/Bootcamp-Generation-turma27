package lista4exerciciosjava;

public class Funcionario {
	
	public String nome;
	public int idade;
	public String cpf;
	public String endereco;
	public String cidade;
	public String email;
	public String telefone;
	public String sexo;
	public String funcao;
	public double salario;
	public boolean status;
	

	public void cadastroAtivo() {
		status = true;
	}
	
	public void cadastroInativo() {
		status = false;
	}
	
	
	
	
}
