public abstract class Conta implements InterConta {

    private static final int AGENCIA_PADRAO = 1; // Nome de constantes em maiúsculas
    private static int sequencial = 1; // Nome de variáveis em camelCase

    protected int numeroConta;
    protected int agencia;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = sequencial++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido!");
            return;
        }
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para transferência!");
            return;
        }
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número da Conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
