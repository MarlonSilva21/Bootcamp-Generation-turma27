programa
{
	
	funcao inicio()
	{
		real indicePoluicao

		escreva("Por favor informe o índice de poluição: ")
		leia(indicePoluicao)


		se(indicePoluicao >= 0.05 e indicePoluicao <= 0.25){
			escreva("\nÍndice de poluíção aceitável\n")
		}senao se(indicePoluicao >= 0.3 e indicePoluicao < 0.4){
			escreva("\nÍndustrias do 1º grupo, suspender as atividades!\n")
		}senao se(indicePoluicao >= 0.4 e indicePoluicao < 0.5){
			escreva("\nÍndustrias do 1º e 2º grupo, suspender as atividades!\n")
		}senao se(indicePoluicao >= 0.5){
			escreva("\nAtenção todas as índustrias devem suspender as atividades!\n")
		}senao{
			escreva("\nSem poluição\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 656; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */