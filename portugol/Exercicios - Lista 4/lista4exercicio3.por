programa
{

	/* Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
  
	a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
	das matrizes N1 e N2;

	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
	posição das matrizes N1 e N2. */
	
	inclua biblioteca Util
	
	funcao inicio(){

		const inteiro LINHA = 4
		const inteiro COLUNA = 6
		 
		inteiro n1[LINHA][COLUNA]
		inteiro n2[LINHA][COLUNA]
		inteiro m1[LINHA][COLUNA]
		inteiro m2[LINHA][COLUNA]
		
		inteiro valor, soma 

		para(inteiro indiceLinha = 0; indiceLinha < LINHA; indiceLinha++){
			escreva("\nLinha: " + (indiceLinha + 1) + "\n")

			para(inteiro indiceColuna = 0; indiceColuna < COLUNA; indiceColuna++){
			
				escreva("\tColunha: " + (indiceColuna + 1) + " : ")
				leia(valor)

				n1[indiceLinha][indiceColuna] = valor
			}
		}

		para(inteiro indiceLinha = 0; indiceLinha < LINHA; indiceLinha++){
			escreva("\nLinha: " + (indiceLinha + 1) + "\n")

			para(inteiro indiceColuna = 0; indiceColuna < COLUNA; indiceColuna++){
			
				escreva("\tColunha: " + (indiceColuna + 1) + " : ")
				leia(valor)

				n2[indiceLinha][indiceColuna] = valor
			}
		}

		escreva("\n------Matriz da soma de N1 e N2------\n")

		para(inteiro indiceLinha = 0; indiceLinha < LINHA; indiceLinha++){

			escreva("\n")

			para(inteiro indiceColuna = 0; indiceColuna < COLUNA; indiceColuna++){

				soma = n1[indiceLinha][indiceColuna] + n2[indiceLinha][indiceColuna]
				m1[indiceLinha][indiceColuna] = soma

				escreva("[" + m1[indiceLinha][indiceColuna] + "]\t")
			}
		}

		escreva("\n------Matriz da diferença de N1 e N2------\n")

		para(inteiro indiceLinha = 0; indiceLinha < LINHA; indiceLinha++){
		 
		 	escreva("\n")

		 	para(inteiro indiceColuna =0; indiceColuna < COLUNA; indiceColuna++){
				
				soma = n1[indiceLinha][indiceColuna] - n2[indiceLinha][indiceColuna]
				m2[indiceLinha][indiceColuna] = soma
				
		 		escreva("[" + m2[indiceLinha][indiceColuna] + "]\t")
		 	}
		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 521; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 19, 10, 2}-{n2, 20, 10, 2}-{m1, 21, 10, 2}-{m2, 22, 10, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */