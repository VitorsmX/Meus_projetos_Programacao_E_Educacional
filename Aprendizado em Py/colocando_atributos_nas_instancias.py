
# Marca, RAM, Placa de video
class Computador:
    def __init__(self, marca, ram, placa_de_video):
        self.marca = marca
        self.ram = ram
        self.placa_de_video = placa_de_video
    pass

computador1 = Computador('Dell', '8GB', 'Geforce')
computador2 = Computador('Positivo', '4GB', 'Nvidia')
computador3 = Computador('Multilaser', '8GB', 'Scorpion')

print (computador1.marca, computador1.ram, computador1.placa_de_video)
print (computador2.marca, computador2.ram, computador2.placa_de_video)
print (computador3.marca, computador3.ram, computador3.placa_de_video)