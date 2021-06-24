programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real pesoTomates, multa = 0, excesso = 0

		escreva("**************************************************\n")
		escreva("Seja bem vindo ao sistema para pesar seus tomates\n")
		escreva("**************************************************\n")
		escreva("\nInforme o Kilograma dos tomates: ")
		leia(pesoTomates)


		se(pesoTomates > 50){
			excesso = pesoTomates - 50
			multa = excesso * 4

			escreva("\nVocê ultrapassou o limite de "+  mat.arredondar(excesso, 2) +" quilos\n")
			escreva("Valor da multa à pagar: R$ " + mat.arredondar(multa, 2))
			
		}senao {
			escreva("\nVocê não precisa pagar multas\n")
			escreva("Excesso: " + excesso + "\n")
			escreva("Multa: " + multa + "\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 761; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */