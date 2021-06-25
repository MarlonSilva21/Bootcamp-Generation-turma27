programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		inteiro filhos = 0
		real salario = 0.00, mediaSalario = 0.00, totalSalario = 0.00, maiorSalario = 0.00
		real totalFilhos = 0, mediaFilhos = 0, salario100 = 0, percentual = 0 
		const inteiro  HABITANTES = 20


		para(inteiro i = 0; i < HABITANTES; i++){
			
			escreva("Por favor informe seu salário: ")
			leia(salario)
			escreva("Por favor informe o número de filhos: ")
			leia(filhos)
			
			totalSalario +=  salario
			

			totalFilhos += filhos

			se(salario > maiorSalario){
				maiorSalario = salario	
			}

			se(salario <= 100){
				salario100 ++
			}

			
			
		}
		mediaSalario = Mat.arredondar((totalSalario / HABITANTES), 2)
		mediaFilhos = totalFilhos / HABITANTES
		percentual = Mat.arredondar( ((salario100 / HABITANTES) * 100),2)

		escreva("\nMédia salarial      : R$ " + mediaSalario)
		escreva("\nMédia de filhos     : " + mediaFilhos)
		escreva("\nMaior Salario       : R$ " + maiorSalario)
		escreva("\nPercentual de pessoas com salario até 100 : " + percentual +"%\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 825; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */