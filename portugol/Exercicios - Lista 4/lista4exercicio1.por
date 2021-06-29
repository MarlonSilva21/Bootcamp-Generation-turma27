programa
{
	
	funcao inicio()
	{
		real valores[5]
		inteiro indiceValorMaior = 0

		escreva("**********************\n")
		escreva("COLETA DAS PONTUAÇÕES\n")
		escreva("**********************\n")

		para(inteiro i = 0; i < 5; i++){
		 	escreva("Digite o " + (i + 1) + "º valor: ")
		 	leia(valores[i])
		 }

		 limpa()

		 escreva("Pontuações\n--------------------------\n")

		 para(inteiro i = 0; i < 5; i++){
			escreva("A " + (i + 1) + "º Pontuação é: " + valores[i] + "\n")

			se(valores[indiceValorMaior] < valores[i]){
				indiceValorMaior = i
			}
		 }
		 escreva("\nA maior pontuação é a da  " + (indiceValorMaior + 1) + "º posição, com o valor de: " + valores[indiceValorMaior] + "\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 632; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */