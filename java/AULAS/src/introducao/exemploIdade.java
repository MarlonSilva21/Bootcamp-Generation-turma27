package introducao;

import java.util.Scanner;

public class exemploIdade {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		String nomes[] = new String[3];
		int idades[] = new int [3];
		int idadeVelha, idadeNova; 
		//int anoNascimento, anoNascimento2, anoNascimento3;
		String sexo;
		
		for(int i = 1; i <=3 ; i++) {
			
			System.out.println("Informe o nome do "+i +"º participante: ");
			nomes[i] = leia.next();
		
			System.out.println("Informe o gênero do "+ i+ "º Gênero: ");
			sexo = leia.next();
		
			System.out.println("Informeo ano de nascimento do " +i+ "º participante: ");
			idades[i] = leia.nextInt();

		}
		
		if(idades[1] > idades[2] && idades[1] > idades[3] ) {
			
			idadeVelha = idades[1];
			
			if(idades[2] > idades[3]) {
				idadeNova = idades[3];
			}
			else {
				idadeNova = idades[2];
			}
			
		}
		if(idades[2] > idades[1] && idades[2] > idades[3]) {
			
			idadeVelha = idades[2];
			
			if(idades[1] > idades[3]) {
				idadeNova = idades[1];
			}
			else {
				idadeNova = idades[3];
			}
		}
		
		if(idades[3] > idades[1] && idades[3] > idades[2]) {
			
			idadeVelha = idades[3];
			
			if(idades[1] > idades[2]) {
				idadeNova = idades[2];
			}
			else {
				idadeNova = idades[1];
			}
		}
		
		
		
		
		
		
		
		leia.close();
		
		
	}
}
