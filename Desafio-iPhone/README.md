# 📱 Desafio POO - Modelagem do iPhone

Este repositório contém a modelagem e implementação das funcionalidades do iPhone com base no vídeo de lançamento de 2007, conforme desafio da plataforma DIO.

## 🔍 Descrição do Desafio

O objetivo deste projeto é representar, por meio de UML e código Java, as seguintes funcionalidades do iPhone:

- 🎵 Reprodutor Musical
- ☎️ Aparelho Telefônico
- 🌐 Navegador na Internet

## 📐 Diagrama UML

O diagrama UML foi desenvolvido utilizando a sintaxe **Mermaid** (Markdown), representando as interfaces e a classe principal `iPhone`.

Arquivo do diagrama: [`uml/diagrama-iphone.mmd`](./uml/diagrama-iphone.mmd)

![Diagrama UML](./uml/diagrama-iphone.png)

## 💻 Código Java

As interfaces e a classe principal estão disponíveis na pasta [`src`](./src):

- `ReprodutorMusical.java`
- `AparelhoTelefonico.java`
- `NavegadorInternet.java`
- `iPhone.java`

### Exemplo de uso:

```java
public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Usando como reprodutor musical
        meuIphone.selecionarMusica("Hey Jude");
        meuIphone.tocar();
        meuIphone.pausar();

        // Usando como telefone
        meuIphone.ligar("11999999999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Usando como navegador
        meuIphone.exibirPagina("https://dio.me");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
