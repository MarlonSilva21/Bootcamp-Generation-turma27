programa
{
	
	funcao inicio()
	{

		inteiro dias
		inteiro anos
		inteiro meses
		inteiro dia
		inteiro mes
		
		escreva("***********************************************************************************\n")
		escreva("Olá seja bem vindo ao sistema que diz quantos anos meses e dias de vida voce já viveu!\n")
		escreva("***********************************************************************************\n")
	
		escreva("Por favor informe o número de dias que você já viveu : ")
		leia(dias)

		anos = dias /365	
		meses =  dias % 365 
		mes = meses / 30
		dia = meses % 30
		

		escreva("\n Você já viveu  " + anos +" anos, " + mes + " meses e " + dia + " dias\n")
		
		
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 672; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */