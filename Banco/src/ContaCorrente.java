public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente); // Chama o construtor da classe pai
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns(); // Reutiliza o método da classe pai para imprimir informações comuns
    }
}