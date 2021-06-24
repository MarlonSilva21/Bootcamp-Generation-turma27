programa
{
	
	funcao inicio()
	{
		inteiro ano
		inteiro meses
		inteiro dias
		inteiro soma

	
		escreva("************************************************************************\n")
		escreva("Olá seja bem vindo ao sistema que diz quantos dias de vida voce já viveu!\n")
		escreva("************************************************************************\n")

		escreva("\nPara prosseguir informe quantos anos você já viveu : ")
		leia(ano)
		escreva("Agora os meses : ")
		leia(meses)
		escreva("e por fim os dias :")
		leia(dias)

		soma = ano * 365 + meses * 30 + dias

		escreva("\nParabéns! você já viveu " + soma + " dias!!!\n\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 539; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */