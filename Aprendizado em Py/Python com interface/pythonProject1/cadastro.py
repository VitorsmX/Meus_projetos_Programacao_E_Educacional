
from PySimpleGUI import PySimpleGUI as sg

    # Layout
sg.theme('LightBrown13')
layout = [
    [sg.Image(r'...\user_azul.png', size=(200,220))],
    [sg.Text('Usuário'), sg.Input(key='usuario', size=(20, 1))],
    [sg.Text('Senha'), sg.Input(key='senha', password_char='*', size=(20, 1))],
    [sg.Checkbox('Salvar o login?')],
    [sg.Button('Entrar')]
    ]
        # Janela
janela = sg.Window('Tela de Login', layout, size=(250, 360))
        # Ler os eventos
while True:
    eventos, valores = janela.read()
    if eventos == sg.WINDOW_CLOSED:
            break
    if eventos == 'Entrar':
        if valores['usuario'] == 'vitorsmfff@yahoo.com' and valores['senha'] == '123456':
            print('Seu login foi efetuado com sucesso!')
        else:
            print('usuario e/ou senha incorreta(s)')


