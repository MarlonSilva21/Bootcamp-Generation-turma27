programa
{
	
	funcao inicio()
	{
		inteiro horas, minutos, segundos, segundo, resto


		escreva("Por favor informe o tempo de duração do evento em segundos: ")
		leia(segundos)

		
		horas = segundos / 3600
		resto = segundos % 3600
		minutos = resto / 60
		segundo = resto % 60

		escreva("\n" + horas + ":" + minutos + ":" + segundo)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 298; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */