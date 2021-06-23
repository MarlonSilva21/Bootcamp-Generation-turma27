programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro temperatura
		inteiro temperaturaConversao

		escreva("Digite seu nome :")
		leia(nome)

		escreva("Digite a temperatura em graus celsius :  ")
		leia(temperatura)

		temperaturaConversao = temperatura * 9/5 + 32

		
		escreva("------------------------------------------------------------------\n")
		escreva("Olá " + nome + " a temperatura atual em graus Farenheight  é: " + temperaturaConversao + "\n")
		escreva("------------------------------------------------------------------\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 544; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */