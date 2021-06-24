programa
{
	
	funcao inicio()
	{
		inteiro base, altura, resultado

		escreva("Informe o valor da base do  triângulo: ")
		leia(base)
		escreva("Informe o valor da altura do  triângulo: ")
		leia(altura)

		enquanto(base <= 0 ou altura <= 0){
			
			escreva("\n**********************************************\n")
			escreva("Por favor informe números inteiro e POSITIVOS")
			escreva("\n**********************************************\n")
			
			escreva("\nInforme o valor da base do  triângulo: ")
			leia(base)
			escreva("Informe o valor da altura do  triângulo: ")
			leia(altura)
		}
		se(base > 0 e altura > 0){
			resultado = (base * altura) / 2

			escreva("\nA área do triângulo correspondente é : " + resultado + "\n")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 743; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */