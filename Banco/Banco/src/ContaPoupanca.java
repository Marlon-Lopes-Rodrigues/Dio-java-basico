public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);    
    }

    // Método específico para rendimento da poupança
    public void aplicarRendimento(double taxa) {
        if (taxa <= 0) {
            System.out.println("A taxa de rendimento deve ser maior que zero!");
            return;
        }
        saldo += saldo * taxa;
        System.out.println(String.format("Rendimento aplicado! Novo saldo: %.2f", saldo));
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
