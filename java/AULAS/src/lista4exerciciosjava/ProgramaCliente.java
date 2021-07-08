package lista4exerciciosjava;

//import java.util.Scanner;

public class ProgramaCliente {
	
	public static void main(String[] args) {
		
		//Scanner leia = new Scanner(System.in);
		
		Cliente cliente1 = new Cliente();
		
		cliente1.nome = "Marlon";
		cliente1.idade = 19;
		cliente1.cpf = "07343567809";
		cliente1.telefone = "11964475776";
		cliente1.email = "marlon@generation.com";
		cliente1.endereco = "R Deise";
		cliente1.cidade = "Guarulhos";
		cliente1.sexo = 'M';
		
		//cliente1.ativo();
		
		System.out.println(cliente1.nome);
		System.out.println(cliente1.sexo);
		System.out.println(cliente1.idade);
		System.out.println(cliente1.telefone);
		System.out.println(cliente1.endereco);
		System.out.println(cliente1.cidade);
		System.out.println(cliente1.email);
		System.out.println(cliente1.cpf + "\n");
		
		cliente1.verificarIdade(cliente1.idade);
		//cliente1.verificarIdade(cliente1.idade);
		
		
	}

}
