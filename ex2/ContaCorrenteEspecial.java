public class ContaCorrenteEspecial extends ContaCorrente {
    public ContaCorrenteEspecial(String nome) {
        super(nome);
    }
    @Override
    public void sacar(Double valor) {
        this.setSaldo(this.getSaldo() - 1.001*valor);
    }
}
