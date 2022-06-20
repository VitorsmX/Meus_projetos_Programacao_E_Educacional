valores = list()
for cont in range(0, 5):
    valores.append(int(input('Digite um valor: ')))

print(valores)
for c, v in enumerate(valores):
    str = 'Na posição {0} encontrei o valor {1}!'
    print(str.format(c, v))
    