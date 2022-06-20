
"""
AULA 3 VAMOS VER LAÇOS DE REPETIÇÃO E LISTA
"""

#print("Bem vindo ao sistema!")

"""
nome = 'aluno'
matricula = 12345
turma = 1001
nota = 9.5

print('nome: ', nome)

print('matricula: '+str(matricula)+' turma: '+str(turma)+' nota: '+str(nota))
"""

# isso comentário!

# LISTAS EM PYTHON == ARRAY
#         0   1   2   3   4
#lista = ['a','b','c','d','e'] # lista de string
#print(lista)
#print(lista[2])
#print(lista[::2])  #  lista[inicial : final : passo = 2]
#print(lista[::-1])

"""
lista.append('z') # insere um valor no final da lista
print(lista)

lista.insert(2,'H') # insere um valor de acordo o indice
print(lista)

lista.pop() # excluir o ultimo item da lista
print(lista)

del(lista[2])
print(lista)

lista2 = [1,2,30,4,5,6,-7,8,9,10] # lista de inteiros
print(type(lista2))

#lista2 = list(range(1,11))
print(lista2)

print(max(lista2))
print(min(lista2))

lista3 = ('string', True, 5, 9.7) # tupla, não pode ser alterado!

lista3 = list(lista3) # cast para transforma a tupla em list
print(lista3)
lista3 = tuple(lista3)
print(lista3)


lista3 = [0,1,2,3,4,5,6,7,8,9,10]
print(len(lista3))

for valor in lista3:
    print(valor)
"""

print('#'*10 + ' JOGO DA FORCA '+'#'*10)

listaDePalavras = ['casa', 'escola', 'mesa', 'faculdade']

secreto = 'palavra'

digitadas = []
chances = 6

while True:

    letra = input('digite uma letra: ')

    if len(letra) > 1:
        print('digite apenas uma letra!')
        continue

    digitadas.append(letra) # guarda as letras que o ususrio digita!
    #print(digitadas)

    """
    if letra in secreto:
        print('a letra existe!')
    else:
        print('a letra não existe!')
    """

    temporario = ''

    for letra_secreta in secreto: # o t o r r i n o l a r i n g o l o g i a
        if letra_secreta in digitadas:
            temporario += letra_secreta
            #temporario = temporario + letra_secreta
        else:
            temporario += '#'

    if temporario == secreto:
        print('parabens vc ganhou!')
        break
    else:
        print(temporario)

    if letra not in secreto:
        chances -= 1

    if chances == 0:
        print('PERDEU!')
        break

    print('vc tem '+str(chances)+' chances!')
    print('numero de chances = ', chances)
