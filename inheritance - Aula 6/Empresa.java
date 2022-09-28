import java.util.*;

public class Empresa {
    private String nome;
    private List<Departamento> departamentos = new LinkedList<>();

    public Empresa(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void adicionaDepartamento(Departamento d)
    {
        departamentos.add(d);
    }
    public void removeDepartamento(Departamento d){
        departamentos.remove(d);
    }
    public List<Departamento> getDepartamentos()
    {
        return new LinkedList<Departamento>(departamentos);
    }

    /**
     * Aumenta o salário de todos os funcionários da empresa
     * usando uma porcentagem de acréscimo ao salário atual.
     * 
     * @param porcentagem Porcentagem expressa como uma fração (ex.: 10% = 0.1f)
     */
    public void aumentarSalario(float porcentagem)
    {
        for (Departamento d : departamentos)
        {
            d.aumentarSalario(porcentagem);
        }
    }

    public double getMediaSalarial()
    {
        double soma=0;
        int i;
        i=0;
        for (Departamento d : departamentos)
        {
            for (Funcionario f : d.getFuncionarios())
            {
                //FIXME: lidar com funcionarios que estão em vários departamentos
                soma+=f.getSalario();
                i++;
            }
        }
        return soma/i;
    }

    @Override
    public String toString()
    {
        return nome;
    }
    
}