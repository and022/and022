import os
from tkinter.filedialog import askdirectory
# acessar a pasta escolhida pelo  usuario dentro da varialvel caminho
#usando a extenssao askdirectory
caminho = askdirectory(title="selecione a pasta")


#usando o metodo listdir para listar os arquivos dentro da pasta

lista_de_arquivos = os.listdir(caminho)
# usando  a variavel locais para armazenar os arquivos de acordo com a extensao
locais = {
    "Imagens": [".png", ".jpg"],
    "Documentos":[".pdf", ".docx", ".txt"],
    "Planilha": [".xlsx", ".csv"],
    "Musicas:": [".mp3", ".wav"],
    "Videos": [".mp4", ".avi"],
    "Outros": [],
    "Arquivos compactados": [".zip", ".rar"],
    "Apresentaçoes": [".pptx", ".keynote"],
    

}


# organizando os arquivos de acordo com a extensao usando a funçao os.path.splitext
for arquivo in lista_de_arquivos:
    nome, extensao = os.path.splitext(f"{caminho}/{arquivo}")
    for nova_pasta in locais:
        #fazendo a organizaçao dos arquivos de acordo com a extensao se a pasta existir
        if extensao in locais[nova_pasta]:
            # se a pasta nao existir, cria uma nova pasta usando os.mkdir
            if not os.path.exists(f"{caminho}/{nova_pasta}"):
                os.mkdir(f"{caminho}/{nova_pasta}")
            # usando a funçao os.rename para mover o arquivo para a nova pasta
            os.rename(f"{caminho}/{arquivo}", f"{caminho}/{nova_pasta}/{arquivo}")