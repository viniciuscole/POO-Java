public class ContaCorrente {
    private Double saldo;
    private String nome;

    public ContaCorrente(String nome) {
        this.nome = nome;
        this.saldo = 0.0;
    }

    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void depositar(Double valor) {
        this.saldo += valor;
    }
    
    public void sacar(Double valor) {
        this.saldo -= 1.005*valor;
    }

    @Override
    public String toString() {
        return "ContaCorrente [saldo=" + saldo + ", nome=" + nome + "]";
    }

    
    
}
