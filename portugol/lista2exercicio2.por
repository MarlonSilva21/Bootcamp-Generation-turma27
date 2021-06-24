programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real valor_hora = 10.00, valor_hora_excedente = 20.00, salario, excesso = 0
		cadeia codigo
		inteiro horas_trabalhadas

		escreva("Informe o seu código: ")
		leia(codigo)
		escreva("Informe o número de horas trabalhadas: ")
		leia(horas_trabalhadas)


		se(horas_trabalhadas > 50){
			excesso = (horas_trabalhadas - 50) * valor_hora_excedente
			salario = (50 * valor_hora) + excesso

			escreva("\nSalário total R$" + Matematica.arredondar(salario, 2) +"\n" )
			escreva("Salário excedente R$" + Matematica.arredondar(excesso, 2) +"\n" )
		}senao{
			salario = horas_trabalhadas * valor_hora
			
			escreva("\nSalário total R$" + Matematica.arredondar(salario, 2) +"\n" )
			escreva("Salário excedente R$" + Matematica.arredondar(excesso, 2) +"\n" )
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 681; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */