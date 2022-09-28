import java.util.LinkedList;

public class Departamento {
    private String nome;
    private LinkedList<Funcionario> funcionarios = new LinkedList<>();

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionaFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void removeFuncionario(Funcionario f) {
        funcionarios.remove(f);
    }

    public LinkedList<Funcionario> getFuncionarios() {
        return new LinkedList<Funcionario>(funcionarios);
    }

    /**
     * Aumenta o salário de todos os funcionários do departamento
     * usando uma porcentagem de acréscimo ao salário atual.
     * 
     * @param porcentagem Porcentagem expressa como uma fração (ex.: 10% = 0.1f)
     */
    public void aumentarSalario(float porcentagem) {
        for (Funcionario f : funcionarios) {
            f.aumentarSalario(porcentagem);
        }
    }

    public double getMediaSalarial() {
        double soma = 0;
        for (Funcionario f : funcionarios) {
            soma += f.getSalario();
        }
        return soma / funcionarios.size();
    }

}
