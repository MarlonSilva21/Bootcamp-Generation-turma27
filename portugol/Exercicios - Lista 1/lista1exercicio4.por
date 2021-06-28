programa
{
	inclua biblioteca Matematica 
	
	funcao inicio()
	{
		real primeiro, segundo, terceiro, r, s, d, expo, expo1
		
	
		escreva("Por favor me informe o primeiro numero inteiro: ")
		leia(primeiro)

		escreva("Por favor me informe o segundo numero inteiro:")
		leia(segundo)

		escreva("Por favor me informe o terceiro numero inteiro:")
		leia(terceiro)


		r  = primeiro + segundo
		expo = r * r
		
		s = segundo + terceiro
		expo1 = s * s

		d = expo + expo1 / 2

		escreva("\n resultado da primeira expressão: "+ expo )
		escreva("\n resultado da segunda expressão: " + expo1 )
		escreva("\n resultado da terceira expressão: " + d + "\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 651; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */