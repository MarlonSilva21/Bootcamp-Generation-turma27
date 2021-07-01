package introducao;

import java.util.Scanner;

public class DesafioIdade {
	public static void main(String[] args) {
		
		//LocalesetDefault(Locale.US);
		
		Scanner leia = new Scanner(System.in);
		
		int anoNascimento, idade;
		String nome;
		
		
		System.out.println("Digite o nome: ");
		nome = leia.next();
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		idade = 2021 - anoNascimento;
		
		leia.close();
		
		
		System.out.printf("Oi %s sua idade é %d ", nome, idade);
	}

}
