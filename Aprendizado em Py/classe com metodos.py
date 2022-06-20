
# Marca, RAM, Placa de video
class Computador:
    def __init__(self, marca, ram, placa_de_video):
        self.marca = marca
        self.ram = ram
        self.placa_de_video = placa_de_video
    pass

    def Ligar(self):
        print ('estou ligando')
    
    def Desligar(self):
        print ('estou desligando')
    
    def Exibir_inf_pc(self):
        print (self.marca, self.ram, self.placa_de_video)
    
computador1 = Computador('Asus', '4GB', 'Scorpion')
computador1.Ligar()
computador1.Desligar()
computador1.Exibir_inf_pc()