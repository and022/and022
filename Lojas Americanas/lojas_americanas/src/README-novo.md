# Sistema de Gerenciamento de Filiais, Funcionários e Produtos

Este projeto Java tem como objetivo simular um sistema simples de cadastro e exibição de informações relacionadas a **filiais**, **funcionários** e **produtos** de uma empresa.

> Desenvolvido no Visual Studio Code com suporte ao Java Development Kit (JDK).

---

## 📁 Estrutura do Projeto

```
projeto-java/
│
├── src/                    # Arquivos-fonte Java (.java)
│   ├── App.java            # Classe principal (ponto de entrada)
│   ├── Produtos.java       # Classe para cadastro de produtos
│   ├── Funcionario.java    # Classe para cadastro de funcionários
│   └── Filiais.java        # Classe para cadastro de filiais
│
├── bin/                    # Arquivos compilados (.class)
│
├── lib/                    # Bibliotecas externas (.jar) - se necessário
│
├── .vscode/
│   └── settings.json       # Configurações do projeto para o VS Code
│
└── README.md               # Documentação do projeto
```

---

## 🚀 Como Executar o Projeto

### 1. Pré-requisitos

- [JDK 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) instalado
- Visual Studio Code com a extensão **Extension Pack for Java**

### 2. Clonando o Projeto

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
```

### 3. Compilando e Executando

No terminal, dentro da pasta do projeto:

```bash
javac -d bin src/*.java
java -cp bin App
```

Ou use o botão "Run" do VS Code na classe `App.java`.

---

## 📌 Funcionalidades

### 🔹 `App.java`
- Classe principal
- Realiza a chamada dos métodos de exibição de dados das outras classes

### 🔹 `Produtos.java`
- Cadastra dados de um produto
- Exibe informações como nome, código e preço

### 🔹 `Funcionario.java`
- Armazena e exibe dados de um funcionário
- Campos como nome, matrícula e cargo

### 🔹 `Filiais.java`
- Registra e exibe informações de uma filial
- Inclui nome da filial, endereço e número identificador

---

## 📷 Exemplo de Saída no Console

```
----- Dados do Produto -----
Nome: Teclado Mecânico
Código: 001
Preço: R$ 250.00

----- Dados do Funcionário -----
Nome: João Silva
Matrícula: 123
Cargo: Gerente

----- Dados da Filial -----
Nome: Loja Centro
Endereço: Av. Brasil, 500
Número: 10
```

---

## 📦 Gerenciamento de Dependências

Atualmente, este projeto não utiliza bibliotecas externas, mas o suporte está preparado para aceitar `.jar` dentro da pasta `lib/`.

---

## 🧑‍💻 Autor

- **André Neri**  
  Projeto desenvolvido para prática de Java e organização de sistemas simples.

---

## 🛠️ Licença

Este projeto é livre para uso educacional.
