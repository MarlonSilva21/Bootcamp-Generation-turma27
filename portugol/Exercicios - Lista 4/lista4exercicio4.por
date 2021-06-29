programa
{
	/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
	em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
	diagonal, ou seja, diagonal principal.*/
	
	funcao inicio()
	{
		 const inteiro LINHA = 3
		 const inteiro COLUNA = 3
		
		 inteiro matriz[LINHA][COLUNA]
		 inteiro somaGeral = 0, somaDiagonal = 0, valor = 0
		 

		 escreva("----- MATRIZ -----\n")
		 para(inteiro indiceLinha = 0; indiceLinha < LINHA; indiceLinha++){
		 	escreva("\nLINHA " + indiceLinha + "\n")

		 	para(inteiro indiceColuna = 0; indiceColuna < COLUNA; indiceColuna++){
				
		 		escreva("\tcoluna " + indiceColuna + ": ")
		 		leia(valor)

		 		matriz[indiceLinha][indiceColuna] = valor
		 		somaGeral += valor

		 		se(indiceLinha == indiceColuna){
		 			somaDiagonal += valor
		 		}
		 	}
		 }

		 escreva("\nSoma de todos os valores:  " + somaGeral)
		 escreva("\nSoma da diagonal principal: "+ somaDiagonal + "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 962; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 12, 11, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */