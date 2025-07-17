from selenium import webdriver 

import time 

import pandas as pd 

#importando as bibliotecas 

#obs : após instalar o pandas voce deve instalar o openpyxl


tabela = pd.read_excel(r"C:\Users\Andre Neri\Desktop\planilhas excel\Planilha\planilha vendas.xlsx")
print(tabela)


# utilizando o webdriver para acessar o formulario e o navegador (no meu caso vai ser o google crhome)

google = webdriver.Chrome()

print("Iniciando o navegador e acessando o formulario!")

google.maximize_window()

google.get("https://www.google.com.br")
time.sleep(5)
# clicando no botão de login do google
google.find_element("xpath", '//*[@id="gb"]/div[3]/a').click()
time.sleep(7)

#digitando o email/login
google.find_element("xpath", '//*[@id="identifierId"]').send_keys("digite o seu email")
time.sleep(4)



#digitando em avançar
google.find_element("xpath", '//*[@id="identifierNext"]').click()
time.sleep(4)

#digitando a senha 
google.find_element("xpath", '//*[@id="password"]/div[1]/div/div[1]/input').send_keys("digite a sua senha")
time.sleep(3)

#clicando em avançar
google.find_element("xpath", '//*[@id="passwordNext"]').click()
time.sleep(3)


# utilizaremos o for para a repetiçao do código no caso para  buscar as informaçoes na planilha para fazer o preenchimeto dos dados sem a necessidade de parar o código
# chamando o metodo enumeratee para acessar a os dados da variavel tabela onde se encontra a planilha cadastro

for i, vendedor in enumerate(tabela["Vendedor"]):
    Código = tabela.loc[i, "Código"]
    LojaRegião = tabela.loc[i, "Loja/Região"]
    Setor = tabela.loc[i, "Setor"]
    QuantidadedeVendas = tabela.loc[i, "Quantidade de vendas"]
    Vcomissao = tabela.loc[i, "Valor comissão em R$"]

    google.get("Coloque a url com o https//: do seu formulario")
    time.sleep(10)

    #preenchendo o campo Vendedor 
    google.find_element("xpath", '//*[@id="mG61Hd"]/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div/div[1]/input').send_keys(vendedor)
    time.sleep(2)
    #preenchendo o campo Código
    google.find_element("xpath", '//*[@id="mG61Hd"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/input').send_keys(str(Código))
    time.sleep(2)
    #preenchendo o campo Loja/Região
    google.find_element("xpath", '//*[@id="mG61Hd"]/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div[1]/div/div[1]/input').send_keys(LojaRegião)
    time.sleep(2)
    #preenchendo o campo Setor
    google.find_element("xpath", '//*[@id="mG61Hd"]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div/div[1]/input').send_keys(Setor)
    time.sleep(2)
    #preenchendo o campo QuantidadeVendas
    google.find_element("xpath", '//*[@id="mG61Hd"]/div[2]/div/div[2]/div[5]/div/div/div[2]/div/div[1]/div/div[1]/input').send_keys(str(QuantidadedeVendas))
    time.sleep(2)
    #preenchendo o campo Vcomissao
    google.find_element("xpath", '//*[@id="mG61Hd"]/div[2]/div/div[2]/div[6]/div/div/div[2]/div/div[1]/div/div[1]/input').send_keys(str(Vcomissao))
    time.sleep(2)
    #clicando no botão enviar
    google.find_element("xpath", '//*[@id="mG61Hd"]/div[2]/div/div[3]/div[1]/div[1]/div/span').click()
    time.sleep(2)

