programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real  salario = 0.00, excesso = 0.00
		const real VALOR_HORA = 10.00
		const real VALOR_HORA_EXCEDENTE = 20.00
		cadeia codigo
		inteiro horas_trabalhadas = 0

		escreva("Informe o seu código: ")
		leia(codigo)
		escreva("Informe o número de horas trabalhadas: ")
		leia(horas_trabalhadas)

		se(horas_trabalhadas > 50){
			excesso = (horas_trabalhadas - 50) * VALOR_HORA_EXCEDENTE
			salario = (50 * VALOR_HORA) + excesso

			escreva("\nSalário total R$" + Matematica.arredondar(salario, 2) +"\n" )
			escreva("Salário excedente R$" + Matematica.arredondar(excesso, 2) +"\n" )
		}senao{
			salario = horas_trabalhadas * VALOR_HORA
			
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
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */