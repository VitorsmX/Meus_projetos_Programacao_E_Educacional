#usa biblioteca de estatisticas do python para a média
from statistics import mean

#função que calcula a média da nota pela biblioteca
def calculaNota(Dados):
    calculaMedia = mean(Dados)
    return calculaMedia

#função que limita os caracteres da variavel aluno e das variáveis de notas e emite um erro se for maior que o máximo permitido
def limitarCaracteresAluno(Aluno):
    maxAluno = 70
    if len(Aluno) > maxAluno:
        print('Quantidade de caracteres excedida')
        return True
    else:
        return False
        

print('#'*40 + '\nBem vindo ao sistema institucional da Universidade Federal do Tangamandápio\n' + '#'*40)

'''
Define as variaveis de alunos, notas das AVs, media e nota minima como Strings - em seguida, enquanto o numero de caracteres de aluno for maior que o limite, ele vai continuar pedindo para inserir
'''
Aluno = input('Digite seu nome: ')
while limitarCaracteresAluno(Aluno) == True:
    Aluno = input('Digite seu nome: ')
    pass

#recebe dados das notas e substitui se o usuario digitar virgula
notaAV1 = float(input('Digite sua nota da primeira avaliação: ').replace(',','.'))

notaAV2 = float(input('Digite sua nota da segunda avaliação: ').replace(',','.'))

notaAV3 = float(input('Digite sua nota da terceira avaliação: ').replace(',','.'))

notaAV4 = float(input('Digite sua nota da quarta avaliação: ').replace(',','.'))

#Agrupa as notas na variavel dados para calcular a média apartir dela
Dados = [notaAV1, notaAV2, notaAV3, notaAV4]

#define as variáveis para calcular a média
mediaNotas = round(calculaNota(Dados),2)
mediaMinima = 6
notaFinalTotal = round(sum(Dados),2)
notaFinalSemestre1 = round(sum(Dados[0:2]),2)
notaFinalSemestre2 = round(sum(Dados[2:4]),2)

#checa se a média é maior ou menor que a nota minima e imprime os resultados
if(mediaNotas >= mediaMinima):
    print('\n' + '*'*60 + '\nParabéns %s, você passou, sua media final foi %s \nMEDIA MINIMA: %s\nNota Final do Primeiro Semestre: %s\nNota Final do Segundo Semestre: %s\nNota Final Total: %s' %(Aluno.title(), mediaNotas, mediaMinima, notaFinalSemestre1, notaFinalSemestre2, notaFinalTotal))    
else:
    print('\n' + '*'*60 + '\nInfelizmente você não passou %s, sua media final foi %s \nMEDIA MINIMA %s\nNota Final do Primeiro Semestre: %s\nNota Final do Segundo Semestre: %s\nNota Final Total: %s' %(Aluno.title(), mediaNotas, mediaMinima, notaFinalSemestre1, notaFinalSemestre2, notaFinalTotal))