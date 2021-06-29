programa
{

	/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
	que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
	imprima a média aritmética dos lançamentos, contabilize e apresente também
	quantas foram as ocorrências da maior pontuação.*/

	
	inclua biblioteca Util //biblioteca para sortear os lançamentos
	
	funcao inicio()
	{
		inteiro lancamentos[10]
		inteiro  maiorPontuacao = 0, contador = 0
		real media = 0.0, soma = 0.0

		para(inteiro i = 0; i < 10; i++){
			
			lancamentos[i]  = Util.sorteia(1, 6)
			escreva( (i + 1) + "º Lancamento: " + lancamentos[i] + "\n")

			soma += lancamentos[i]

			se(maiorPontuacao < lancamentos[i]){
				maiorPontuacao = lancamentos[i]
			}
		}
		
		para(inteiro i = 0; i < 10; i++){
			se(maiorPontuacao == lancamentos[i]){
				contador++
			}
		}
		

		media = soma / 10
		escreva("\n------------------------------------------------")
		escreva("\nA média artimética dos lançamentos é: " + media + "\n")
		escreva("------------------------------------------------")
		escreva("\nA maior pontuação foi sorteada " + contador  + " vezes\n")
		escreva("------------------------------------------------\n")
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 710; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */