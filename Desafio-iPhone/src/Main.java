public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Usando como reprodutor musical
        System.out.println("🎵 Reprodutor Musical:");
        meuIphone.selecionarMusica("Hey Jude");
        meuIphone.tocar();
        meuIphone.pausar();

        // Usando como telefone
        System.out.println("\n📞 Aparelho Telefônico:");
        meuIphone.ligar("11999999999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Usando como navegador
        System.out.println("\n🌐 Navegador na Internet:");
        meuIphone.exibirPagina("https://dio.me");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
