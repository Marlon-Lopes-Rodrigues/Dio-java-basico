
    public static void main(String[] args) {

        Cliente marlon = new Cliente();
        marlon.setNome("Marlon");

        Conta corrente = new ContaCorrente(marlon);

        corrente.depositar(1000.0);
        corrente.sacar(200.0);

        Conta poupanca = new ContaPoupanca(marlon);

        poupanca.depositar(5000.0);
        poupanca.sacar(600.0);
        poupanca.transferir(1000.0, corrente);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    
}
