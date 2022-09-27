public class Funcionario{
    private String nome;
    private Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public void aumento(Double porcentagem){
        this.salario+=this.salario*porcentagem;
    }
    public void printFuncionario(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Salário: "+this.salario+" reais");
    }
}