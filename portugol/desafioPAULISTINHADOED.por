programa 
{
	
	funcao inicio()
	{
		cadeia  time1, time2, time3, time4
		inteiro pontos1 = 0, pontos2 = 0, pontos3 = 0, pontos4 = 0
		caracter resultado = ' '

		escreva("***********************************\n")
		escreva("SEJA BEM VINDO AO PAULISTINHA DO ED\n")
		escreva("***********************************\n")

		escreva("GRUPO: ROOM 3 ")
		escreva("Gustavo Augusto, Jaque, Caroline, Caio Lima, Luan, Fabio e Marlon ")



		para(inteiro i = 1; i <= 4; i++){
			
			escreva("\nRODADA : " + i + "\n")
			escreva("\nCorinthians ganhou perdeu ou empatou? ")
			leia(resultado)
			se(resultado == 'G' ou resultado == 'g'){
				pontos1 += 3
			}
			senao se(resultado == 'E' ou resultado == 'e'){
				pontos1 += 1
			}
			senao se(resultado == 'P' ou resultado == 'p'){
				pontos1 += 0
			}
			
			escreva("Palmeiras ganhou perdeu ou empatou? ")
			leia(resultado)
			se(resultado == 'G' ou resultado == 'g'){
				pontos2 += 3
			}
			senao se(resultado == 'E' ou resultado == 'e'){
				pontos2 += 1
			}
			senao se(resultado == 'P' ou resultado == 'p'){
				pontos2 += 0
			}
			
			escreva("São paulo ganhou perdeu ou empatou? ")
			leia(resultado)
			se(resultado == 'G' ou resultado == 'g'){
				pontos3 += 3
			}
			senao se(resultado == 'E' ou resultado == 'e'){
				pontos3 += 1
			}
			senao se(resultado == 'P' ou resultado == 'p'){
				pontos3 += 0
			}
			
			escreva("Santos ganhou perdeu ou empatou? ")
			leia(resultado)
			se(resultado == 'G' ou resultado == 'g'){
				pontos4 += 3
			}
			senao se(resultado == 'E' ou resultado == 'e'){
				pontos4 += 1
			}
			senao se(resultado == 'P' ou resultado == 'p'){
				pontos4 += 0
			}
		}

		escreva("\ncorinthinas : " + pontos1 + "\n")
		escreva("Palmeiras   : " + pontos2 + "\n")
		escreva("São Paulo   : " + pontos3 + "\n")
		escreva("Santos      : " + pontos4 + "\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 464; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */