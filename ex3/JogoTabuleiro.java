public class JogoTabuleiro {
    private String nome;
    private Double preco;
    private Integer idadeMin;

    public JogoTabuleiro(String nome, Double preco, Integer idadeMin) {
        this.nome = nome;
        this.preco = preco;
        this.idadeMin = idadeMin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getIdadeMin() {
        return idadeMin;
    }

    public void setIdadeMin(Integer idadeMin) {
        this.idadeMin = idadeMin;
    }

    @Override
    public String toString() {
        return "Jogo " + nome + ", Idade mínima para jogar: " + idadeMin + ", Preço: R$" + preco;
    }
}
