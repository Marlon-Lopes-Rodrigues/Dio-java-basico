import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas; // Corrigido para List<Conta>

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() { // Corrigido para List<Conta>
        return contas;
    }

    public void setContas(List<Conta> contas) { // Corrigido para List<Conta>
        this.contas = contas;
    }
}
