programa
{
	
	funcao inicio()
	{
		inteiro num, soma = 0, cont = 0
		real media = 0.0

		escreva("Digite um numero: ")
		leia(num)

		enquanto(num >= 0){
			
			soma += num
			cont ++
			
			escreva("Digite um numero: ")
			leia(num)
		} 
		media = soma / cont

		escreva("\nA soma dos números é  : " + soma + "\n")
		escreva("A media dos números é : " + media)
		escreva("\nO total de números lidos foram : " + cont + "\n")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 130; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */