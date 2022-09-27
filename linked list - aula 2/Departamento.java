import java.util.LinkedList;

public class Departamento{
    private LinkedList<Funcionario> funcionarios = new LinkedList<Funcionario>();
    private String nome;
    
    public Departamento(String nome) {
        this.nome = nome;
    }

    public LinkedList<Funcionario> getFuncionarios() {
        return new LinkedList<Funcionario>(funcionarios);
    }
    public void setFuncionarios(LinkedList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addFuncionarios(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }
    public void removeFuncionarios(Funcionario funcionario){
        this.funcionarios.remove(funcionario);
    }
    public double mediaSalarioDepartamento(){
        double total=0;
        int i=0;
        for (Funcionario funcionario : funcionarios) {
            total+=funcionario.getSalario();
            i++;
        }
        return total/i;
    }
    public void aumentoDepartamento(double porcentagem){
        for (Funcionario funcionario : funcionarios) {
            funcionario.aumento(porcentagem);
        }
    }
    public void printDepartamento(){
        System.out.println("================================");
        System.out.println("Departamento: "+this.nome);
        System.out.println("Salário Médio: "+this.mediaSalarioDepartamento());
        System.out.println("================================");
        for (Funcionario funcionario : funcionarios) {
            funcionario.printFuncionario();
        }
        System.out.println("");
    }
}