/*Função do algoritmo: Calcular a média aritmética apartir da vendas dos funcionários
 * apartir da quantidade de vendas nos meses indicados lidos do teclado
 */
//Autor: Vitor Sousa Mesquita

programa
{
	inclua biblioteca Teclado
	inclua biblioteca Matematica
	funcao inicio() {
		inteiro vend_jan,vend_fev,vend_mar,vend_abr,total,media
		cadeia funcionario
		
		escreva("informe seu nome completo: ")
		leia(funcionario)
		escreva("informe a quantidade de vendas do mês de janeiro: ")
		leia(vend_jan)
		escreva("informe a quantidade de vendas do mês de fevereiro: ")
		leia(vend_fev)
		escreva("informe a quantidade de vendas do mês de março: ")
		leia(vend_mar)
		escreva("informe a quantidade de vendas do mês de abril: ")
		leia(vend_abr)
		
		//soma os meses
		
		total = (vend_jan + vend_fev + vend_mar + vend_abr)
		media = (total / 4)
		
		//verifica se a media e maior ou igual a 7 e aprova
		
		se (media >= 7) {
			escreva("\n" + "Olá " , funcionario , " seu total de vendas durante os meses informados foi " , total , " e sua média de vendas é " , media , ", portanto você foi aprovado!")
			}
		//caso a média for menor que 7 será reprovado
		
		senao {
			escreva("\n" + "Olá " , funcionario , " seu total de vendas durante os meses informados foi " , total , " e sua média de vendas é " , media , " e infelizmente você não foi aprovado.")
			}
		
		}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1158; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */