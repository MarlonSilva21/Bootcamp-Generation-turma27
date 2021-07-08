package programas;

import java.util.Scanner;

import objetos.pessoa;

public class CadFriends {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		pessoa amigo1 = new pessoa();
		pessoa amigo2 = new pessoa();
		pessoa amigo3 = new pessoa();
		
		
		System.out.println("Digite o nome: ");
		amigo1.nome = leia.next();
		
		System.out.println("Digite o sexo: ");
		amigo1.sexo = leia.next().charAt(0);
		
		System.out.println("Digite o ano de nascimento: ");
		amigo1.anoNascimento = leia.nextInt();
		
		
		System.out.println();
		
		
		System.out.println("Digite o nome: ");
		amigo2.nome = leia.next();
		
		System.out.println("Digite o sexo: ");
		amigo2.sexo = leia.next().charAt(0);
		
		System.out.println("Digite o ano de nascimento: ");
		amigo2.anoNascimento = leia.nextInt();

	}
}
