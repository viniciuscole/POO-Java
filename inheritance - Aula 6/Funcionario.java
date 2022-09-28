
public class Funcionario {
    private String nome;
    private float salario;
    public Funcionario(String nome) {
        this.nome = nome;
    }
    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     * Aumenta o salário usando uma porcentagem de acréscimo ao salário atual.
     * 
     * @param porcentagem Porcentagem expressa como uma fração (ex.: 10% = 0.1f)
     */
    public void aumentarSalario(float porcentagem)
    {
        this.salario = this.salario * (1.0f + porcentagem);
    }

    public int getNumeroHorasSemanais() {
        return 40;
    }

    @Override
    public String toString()
    {
        return getNome()+" - R$ "+getSalario()+" - trabalha "+getNumeroHorasSemanais()+
            "h.";
    }
}
