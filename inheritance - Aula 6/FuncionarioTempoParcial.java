public class FuncionarioTempoParcial extends Funcionario {
    
    private int numeroHorasSemanais=20;
    
    public FuncionarioTempoParcial(String nome) {
        super(nome);
    }
    

    public FuncionarioTempoParcial(String nome, float salario) {
        super(nome, salario);
    }
    


    public FuncionarioTempoParcial(String nome, float salario, int numeroHorasSemanais) {
        super(nome, salario);
        this.numeroHorasSemanais = numeroHorasSemanais;
    }


    @Override
    public int getNumeroHorasSemanais() {
        return numeroHorasSemanais;
    }

    public void setNumeroHorasSemanais(int numeroHorasSemanais) {
        this.numeroHorasSemanais = numeroHorasSemanais;
    }

}

