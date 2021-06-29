programa
{
	
	funcao inicio()
	{
		cadeia nomes[4]
		inteiro notas[4]
		
		escreva("*******************\n")
		escreva("  BOLETINHO DO ED\n")
		escreva("*******************\n")


		para(inteiro i = 0; i < 4 ; i++){

			escreva("nome : ")
			leia(nomes[i])
			escreva("Nota : ")
			leia(notas[i])
		}

		limpa()
		
		para(inteiro i = 0; i < 4 ; i++){
			se(notas[i] <= 5){
				escreva("Oi " + nomes[i] + " sua nota é " + notas[i] + " | Ainda não, estude mais\n")
			}senao{
				escreva("Oi " + nomes[i] + " sua nota é " + notas[i] + " | Aprovado, continue assim!\n")
			}
			
		}
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 240; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */