def Calcula_Conversao_bin_Octa_Dec(pega_numero):
    resto = []
    for y in resto:
        y = pega_numero / 2
    while(y > 0):
        for y in resto:
            resto.append()
    resto_revertido = resto[::-1]
    return resto_revertido


pega_numero = int(input("Digite o número que deseja converter: "))
pega_base = input("Escolha a base numérica do número digitado: \n1 - Decimal \n2 - Binário \n3 - Octal \n")
unidade_conversao = input("Escolha o sistema numérico para o qual você quer converter: \n1 - Decimal \n2 - Binário \n3 - Octal \n")
divisor = 0
resultado = 0

if(pega_base == "1" and unidade_conversao == "2"):
    resultado = Calcula_Conversao_bin_Octa_Dec(pega_numero)
elif(pega_base == unidade_conversao):
    print("Digite um sistema numérico diferente daquele que você inseriu")
else:
    print("Base ou sistema numérico inválido(s)")

for x in resultado:
    resultadoFormatado = [''.join(resultado)]

print(resultadoFormatado)
