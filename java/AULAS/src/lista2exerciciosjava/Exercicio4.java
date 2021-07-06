package lista2exerciciosjava;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0, nervosasComMais40Anos = 0, calmasComMenos18anos = 0, contador = 1 ;
		final int LIMITE = 150;
		char sexo;
		char opcao, op = 'S';      
		
		while (op == 'S' && contador <= LIMITE) {
			
			System.out.println("Participante "+ contador);
			System.out.print("Digite a idade: ");
			idade = leia.nextInt();
			
			System.out.println("Digite ");
			System.out.print("1 - Feminino\n 2 - Masculino\n 3 - Outros :");
			sexo = leia.next().charAt(0);
			System.out.println("Selecione ");
			System.out.print("1 - pessoa calma\n 2 - pessoa nervosa\n 3 - pessoa agressiva");
			opcao = leia.next().charAt(0);
			
			
			
			if(opcao == '1') {
				pessoasCalmas++;
			}
			
			if(sexo == '1' && opcao == '2') {
				mulheresNervosas++;
			}
			
			if(sexo == '2' && opcao == '3') {
				homensAgressivos++;
			}
			
			if(sexo == '3' && opcao == '1') {
				outrosCalmos++;
			}
			
			if(idade < 18 && opcao == '1') {
				calmasComMenos18anos++;
			}
			
			if(idade > 40 && opcao == '2') {
				nervosasComMais40Anos++;
			}
			
			
			System.out.println("Continua S/N:");
			op = leia.next().toUpperCase().charAt(0);
			
			//saida do loop
			contador++;
		}
		
		leia.close();
		
		System.out.println("Pessoas calmas           : "+ pessoasCalmas);
		System.out.println("Mulheres nervosas        : "+ mulheresNervosas);
		System.out.println("Homens Agressivos        : "+ homensAgressivos);
		System.out.println("Outros calmos            : "+ outrosCalmos);
		System.out.println("Menor de 18 calmos       : "+ calmasComMenos18anos);
		System.out.println("Nervosas mais de 40 anos : "+ nervosasComMais40Anos);
	}

}
