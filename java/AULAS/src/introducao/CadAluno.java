package introducao;

import java.util.Scanner;

public class CadAluno {
	public static void main(String[] args) {
		
		
		Scanner read = new Scanner(System.in);
		
		String produtos[] = {"Camisa", "Cal�a", "Bermuda", };
		String codigo[] = new String[3];
		double valores[] = {75.0, 90.0, 45};
		int estoque[] = new int [3];
		int qtde;
		int carrinho[] = new int[3];
		
		char condicao;
		
		String auxArray ;
		
		
		
		//la�o para preencher os Arrays Codigo e Estoque
		for( int i = 0; i < estoque.length; i++) {
			estoque[i] = 10; 
			codigo[i] = "JM-"+(i + 1);
		}
		
		
		do {
			
			System.out.println("\n\n  BEM VINDO AO E-COMMERCE GENERATION");
			System.out.println("  ==================================================");
			System.out.println("  C�digo \tProduto \t Pre�o \t    Estoque  ");
			System.out.println("  ==================================================");
			
			for( int i = 0; i < produtos.length; i++) {
				System.out.println("  "+ codigo[i] + "\t\t" + produtos[i] + "\t\t  " + valores[i] + "\t\t " + estoque[i]);
				
			}
			System.out.println("  ====================================================");
			
			for (int i = 0; i < produtos.length; i++) {

				if(carrinho[i] != 0) {
					
					System.out.println("  Carrinho: ");
					System.out.println("  "+ codigo[i] + "\t\t" + produtos[i] + "\t\t  " + valores[i] + "\t\t " + estoque[i]);            
				}
			}
			
			System.out.print("\n  Informe o c�digo do produto que voc� deseja comprar: ");
			auxArray = read.next().toUpperCase();
			
			for(int i = 0; i < produtos.length; i++) {
				
//				if(!codigo[i].equals(auxArray)) {
//					System.out.println("not");
//				}
				
				if(codigo[i].equals(auxArray)) {
					System.out.println("  Produto selecionado com sucesso!\n");
					System.out.println("  C�digo \tProduto \t Pre�o \t    Estoque  ");
					System.out.println("  ==================================================");
					System.out.println("  "+ codigo[i] + "\t\t" + produtos[i] + "\t\t  " + valores[i] + "\t\t " + estoque[i]);
					
					if(estoque[i] == 0) {
						System.out.println("Estoque Ind�sponivel");
					}
					else {
						System.out.println("  Qual a quantidade que voc� deseja? : ");
						qtde = read.nextInt();
						
						if (qtde > estoque[i] ) {
							System.out.println("Valor invalido!!!");
	                    }
	                    else {
	                            carrinho[i] = qtde;
	                    }
					}
				}
			}
			
			
			System.out.println("Deseja Finalizar a compra S/N ?");
			
			
			
			
			
			
			
			//-----------------------------------------------------------------------  bloco de saida
			System.out.println("  Deseja continuar S/N : ");
			condicao = read.next().toUpperCase().charAt(0);
			
			if( condicao == 'n') {
				condicao = 'N';
			}
			//-----------------------------------------------------------------------	
			
		}while(condicao == 'S');
			
		
	
		
		read.close();
	}

}
