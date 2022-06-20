// Função do programa: informa a tabuada que o usuário informar
// Autor: Vitor Sousa Mesquita

programa
{
	
	funcao inicio()
	{
		inteiro contador, limite, tabuada, resultado

		contador = 0
		escreva("Qual tabuada você quer ver? insira o número: ")
		leia(tabuada)
		escreva("Insira o limite do número que vai multiplicar pelo numero anterior: ")
		leia(limite)

          escreva("\n***** TABUADA DO " + tabuada + " *****" + "\n")
          // vai multiplicar o numero informado pela contador até o limite estipulado
		faca {

			resultado = tabuada * contador
			escreva(tabuada + " X " + contador + " = " + resultado + "\n")
			contador++
			
		}enquanto (contador<=limite)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 439; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */