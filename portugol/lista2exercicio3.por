programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		inteiro num1, num2, num3, num4, q1, q2, q3 ,q4
		
		escreva("Por favor, digite quatro números: ")
		leia(num1, num2, num3, num4)

		q1 = Mat.potencia(num1, 2)
		q2 = Mat.potencia(num2, 2)
		q3 = Mat.potencia(num3, 2)
		q4 = Mat.potencia(num4, 2)


		se(q3 > 100){
			escreva("\n"+q3)
		}senao{
			escreva("\nO quadrado de " + num1 + " é " + q1 + "\n")
			escreva("O quadrado de " + num2 + " é " + q2 + "\n")
			escreva("O quadrado de " + num3 + " é " + q3 + "\n")
			escreva("O quadrado de " + num4 + " é " + q4 + "\n")
		}

	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 609; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */