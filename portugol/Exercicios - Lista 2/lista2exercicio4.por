programa
{
	
	funcao inicio()
	{
		inteiro num

		escreva("Escreva um numero inteiro : ")
		leia(num)

		se(num % 2 == 0){
			se(num > 0){
				escreva("O numero "+num+" é Par e Positivo")
			}senao{
				escreva("O numero "+num+" é Par e Negativo")
			}
		}senao{
			se(num > 0){
				escreva("O numero "+num+" é Ímpar e Positivo")
			}senao{
				escreva("O numero "+num+" é Ímpar e Negativo")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 160; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */