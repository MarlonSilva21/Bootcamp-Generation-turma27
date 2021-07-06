package introducao;

import java.util.Scanner;

public class CadAluno {
	public static void main(String[] args) {
		
		
		Scanner read = new Scanner(System.in);
		
		//String alunos[]	= new String[4];
		String alunos[] = {"João", "Marcos", "Maria", "Pedro"};
		int notas[] = new int [4];
		//double notas2[]  = new double [5];
		//final int LIMITE = 4;
		
		System.out.println("Cadastro de notas");
		for(int x = 0; x < alunos.length; x++) {
		
			System.out.print("Alune " + alunos[x].toUpperCase()+" : ");
			notas[x] = read.nextInt();
		}
		
		
	
	
		
		read.close();
	}

}
