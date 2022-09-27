import java.util.LinkedList;

public class Empresa{
    private String nome;
    private LinkedList<Departamento> departamentos = new LinkedList<Departamento>();
    
    public Empresa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LinkedList<Departamento> getDepartamentos() {
        return new LinkedList<Departamento>(departamentos);
    }

    public void setDepartamentos(LinkedList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public void addDepartamentos(Departamento departamento){
        this.departamentos.add(departamento);
    }
    public void removeDepartamentos(Departamento departamento){
        this.departamentos.remove(departamento);
    }
    public double mediaSalarioEmpresa(){
        double total=0;
        int i=0;
        for (Departamento departamento : departamentos) {
            for (Funcionario funcionario : departamento.getFuncionarios()) {
                total+=funcionario.getSalario();
                i++;
            }
        }
        return total/i;
    }
    public void aumentoEmpresa(Double porcentagem){
        for (Departamento departamento : departamentos) {
            departamento.aumentoDepartamento(porcentagem);
        }
    }
    public void printEmpresa(){
        System.out.println("================================");
        System.out.println("Empresa: "+this.nome);
        System.out.println("Salário Médio: "+this.mediaSalarioEmpresa());
        System.out.println("================================");
        for (Departamento departamento : departamentos) {
            departamento.printDepartamento();
        }
        System.out.println("");
    }
}