package lista4exerciciosjava;

import java.util.Scanner;

public class ProgramaFuncionario {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String stts;
		
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.nome = "Ednilson";
		funcionario1.idade = 47;
		funcionario1.cpf = "76026423954";
		funcionario1.telefone = "11 90946723";
		funcionario1.email = "ed@generation.com";
		funcionario1.cidade = "S�o Paulo";
		funcionario1.endereco = null;
		funcionario1.sexo = null;
		funcionario1.funcao = "Instrutor GEN";
		funcionario1.salario = 20.000;
		funcionario1.status = true;
		
		
		System.out.println("-----FUNCION�RIO DO M�S-----\n");
		
		System.out.println("Funcion�rio : "+funcionario1.nome);
		System.out.println("Idade : "+funcionario1.idade);
		System.out.println("Fun��o : "+funcionario1.funcao);
		System.out.println("Estatus ativo : "+funcionario1.status);
		
		
		System.out.println("\nPara desligar o funcion�rio digite [desligar]: ");
		stts = leia.next().toUpperCase();
		
		if(stts.equals("DESLIGAR")) {
			
			funcionario1.cadastroInativo();
			System.out.println(" FUNCION�RIO DESLIGADO COM SUCESSO!");
		}
		
		leia.close();
		
	}

}
