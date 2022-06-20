valores = list()
for cont in range(0, 5):
    valores.append(int(input('Digite um valor: ')))

maior = max(valores)
pos_maior = valores.index(max(valores))
print('o maior valor é ', maior, ', e sua posição é ', pos_maior)

menor = min(valores)
pos_menor= valores.index(min(valores))
print('o menor valor é ', menor, ', e sua posição é ', pos_menor)