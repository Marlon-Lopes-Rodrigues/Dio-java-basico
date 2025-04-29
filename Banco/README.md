# Projeto Banco em Java

Este é um projeto básico de um sistema bancário desenvolvido em Java como parte do aprendizado de conceitos fundamentais da linguagem e orientação a objetos.

## Funcionalidades

O sistema bancário implementa as seguintes funcionalidades:

- Criação de contas (Corrente e Poupança).
- Depósito, saque e transferência entre contas.
- Impressão de extratos detalhados.
- Aplicação de rendimento em contas poupança.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- **`src`**: Contém os arquivos-fonte do projeto.
  - `Banco.java`: Classe que representa o banco e gerencia as contas.
  - `Conta.java`: Classe abstrata que define os atributos e métodos comuns às contas.
  - `ContaCorrente.java`: Classe que representa uma conta corrente.
  - `ContaPoupanca.java`: Classe que representa uma conta poupança.
  - `Cliente.java`: Classe que representa o cliente do banco.
  - `Main.java`: Classe principal para execução do programa.
- **`lib`**: Pasta para dependências externas (se necessário).

## Como Executar

1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado em sua máquina.
2. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
