programa
{
	
	funcao inicio()
	{

		cadeia nomes[5]
		
		escreva("************************\n")
		escreva("CARRETA FURACAO DO ED\n")
		escreva("************************\n")

		para(inteiro i = 0; i < 5 ; i++){

			escreva("nome : ")
			leia(nomes[i])
		}
		para(inteiro i = 4; i >= 0; i--){
			
			escreva("\n" + nomes[i] )
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 343; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */