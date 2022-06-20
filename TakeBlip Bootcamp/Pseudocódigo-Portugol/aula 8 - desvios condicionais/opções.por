/* Função do programa: mostra as opções de streaming e pede
 * pro usuário escolher
 */
//Autor: Vitor Sousa Mesquita

programa
{
	
	funcao inicio()
	{
		escreva("1 - Abrir Netflix" + "\n" + "2 - Abrir Amazon Prime"
		 + "\n" + "3 - Abrir HBO GO" + "\n" + "4 - Sair")
		inteiro menu = 0
		escreva("\n" + "Sua opção: ")
		leia(menu)
		escolha(menu) {
			caso 1:
			escreva ("Abrindo Netflix")
			pare
			caso 2:
			escreva ("Abrindo Amazon Prime")
			pare
			caso 3:
			escreva ("Abrindo HBO GO")
			pare
			caso 4:
			escreva ("**PROGRAMA FINALIZADO**")
			pare
			caso contrario:
			escreva ("você deve escolher as opções 1, 2, 3 ou 4")
			pare
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 117; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */