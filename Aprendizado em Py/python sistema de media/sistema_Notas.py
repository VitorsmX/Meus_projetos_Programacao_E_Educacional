#usa biblioteca de estatisticas do python para a média
from statistics import mean

#função que calcula a média da nota pela biblioteca apartir da lista nova criada com dados Float
def calculaNota(listaDadosFloat):
    calculaMedia = mean(listaDadosFloat)
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

notaAV1 = input('Digite sua nota da primeira avaliação: ')

notaAV2 = input('Digite sua nota da segunda avaliação: ')

notaAV3 = input('Digite sua nota da terceira avaliação: ')

notaAV4 = input('Digite sua nota da quarta avaliação: ')

#Agrupa as notas na variavel dados para calcular a média apartir dela
Dados = [notaAV1, notaAV2, notaAV3, notaAV4]

#coloca virgula nas strings da lista Dados que foi solicitada inserção, coloca os dados em uma nova lista que vai ter os valores Float(Decimal)
Dados[0:5] = notaAV1.replace(',','.'), notaAV2.replace(',','.'), notaAV3.replace(',','.'), notaAV4.replace(',','.')
listaDadosFloat = []
for DadosFloat in Dados:
    listaDadosFloat.append(float(DadosFloat))

#define as variáveis para calcular a média
mediaNotas = round(calculaNota(listaDadosFloat),2)
mediaMinima = 6
notaFinalTotal = round(sum(listaDadosFloat),2)
notaFinalSemestre1 = round(sum(listaDadosFloat[0:2]),2)
notaFinalSemestre2 = round(sum(listaDadosFloat[2:4]),2)

#checa se a média é maior ou menor que a nota minima e imprime os resultados
if(mediaNotas >= mediaMinima):
    print('\n' + '*'*60 + '\nParabéns %s, você passou, sua media final foi %s \nMEDIA MINIMA: %s\nNota Final do Primeiro Semestre: %s\nNota Final do Segundo Semestre: %s\nNota Final Total: %s' %(Aluno.title(), mediaNotas, mediaMinima, notaFinalSemestre1, notaFinalSemestre2, notaFinalTotal))    
else:
    print('\n' + '*'*60 + '\nInfelizmente você não passou %s, sua media final foi %s \nMEDIA MINIMA %s\nNota Final do Primeiro Semestre: %s\nNota Final do Segundo Semestre: %s\nNota Final Total: %s' %(Aluno.title(), mediaNotas, mediaMinima, notaFinalSemestre1, notaFinalSemestre2, notaFinalTotal))