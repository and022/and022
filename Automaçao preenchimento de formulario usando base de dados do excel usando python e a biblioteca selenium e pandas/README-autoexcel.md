# 🧾 Automação de Preenchimento de Formulário com Excel e Selenium

Este script Python, chamado `autoexcel.py`, automatiza o preenchimento de um formulário do **Google Forms** utilizando dados de uma planilha **Excel**.

---

## 🔧 Bibliotecas Utilizadas

- `selenium` – Automatiza o navegador Google Chrome.
- `pandas` – Faz a leitura da planilha Excel.
- `time` – Insere pausas entre ações automatizadas.
- `openpyxl` – (recomendado) para leitura de arquivos `.xlsx`.

---

## 📂 Etapas da Automação

### 1. 📥 Leitura da Planilha Excel

A planilha deve estar localizada em:

```
C:\Users\Andre Neri\Desktop\planilhas excel\Planilha\planilha vendas.xlsx
```

E conter as seguintes colunas:

- `Vendedor`
- `Código`
- `Loja/Região`
- `Setor`
- `Quantidade de vendas`
- `Valor comissão em R$`

### 2. 🌐 Abertura do Navegador

- Utiliza o **ChromeDriver** para iniciar o navegador.
- Acessa o link do **Google Forms** configurado.

### 3. 📝 Preenchimento Automático

Para cada linha da planilha, o script:

- Lê os dados da planilha.
- Preenche os campos correspondentes no formulário.
- Clica no botão **"Enviar"**.

### 4. ⏱️ Pausas Entre Ações

O script utiliza `time.sleep(segundos)` entre cada etapa para garantir que o carregamento do formulário ocorra corretamente antes das ações.

---

## 📌 Resumo Funcional

Este script permite automatizar o envio de dados de vendas — como nome do vendedor, código, loja/região, setor, quantidade de vendas e valor da comissão — diretamente para um formulário do Google Forms, utilizando como base uma planilha `.xlsx`.

---

## ▶️ Como Executar

1. Instale as dependências:

```bash
pip install selenium pandas openpyxl
```

2. Tenha o ChromeDriver instalado e compatível com a sua versão do Google Chrome.

3. Configure o caminho da planilha e o link do Google Forms dentro do script.

4. Execute:

```bash
python autoexcel.py
```

---

## 👨‍💻 Autor

**André Neri** – Automação criada para facilitar o envio em massa de dados de vendas.

---

## 📄 Licença

Projeto de uso livre para fins educacionais e profissionais.
