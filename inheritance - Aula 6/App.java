public class App {

    public static void imprimeEmpresa(Empresa e)
    {
        for (Departamento d : e.getDepartamentos())
        {
            System.out.println("Departamento: "+d.getNome());
            for (Funcionario f : d.getFuncionarios())
            {
                System.out.printf("Funcionário %s salário: %f\n",f.getNome(),f.getSalario());
            }
        }
    }


    public static void main(String[] args)
    {
        Empresa acme = new Empresa("ACME Inc.");


        System.out.println(acme.toString());


        Departamento rh = new Departamento("Recursos Humanos");
        acme.adicionaDepartamento(rh);
        Departamento ti = new Departamento("TI");
        acme.adicionaDepartamento(ti);

        FuncionarioTempoParcial fulano = new FuncionarioTempoParcial("Fulano");
        fulano.setNome("Fulano da Silva");
        System.out.println(fulano);

        FuncionarioTempoIntegral maria = new FuncionarioTempoIntegral("Maria", 3500);
        maria.setNome("Maria da Silva");
        System.out.println(maria);

        Funcionario f;
        f=maria;
        System.out.println(f);
        f=fulano;
        System.out.println(f);

        FuncionarioTempoParcial f2 =  (FuncionarioTempoParcial) f;
    //    FuncionarioTempoIntegral f3 = (FuncionarioTempoIntegral) f;

        System.out.println(f2.getNome()+" trabalha "+f2.getNumeroHorasSemanais()+"h.");

        rh.adicionaFuncionario(fulano);
        fulano.setSalario(5000.0f);
        rh.adicionaFuncionario(maria);
        maria.setSalario(11000.0f);

        Funcionario beltrano = new Funcionario("Beltrano");
        beltrano.setNome("Beltrano");
        beltrano.setSalario(10000.0f);   
        ti.adicionaFuncionario(beltrano);

        App.imprimeEmpresa(acme);

        beltrano.setNome(beltrano.getNome()+" Ferreira");
        rh.aumentarSalario(0.2f);

        imprimeEmpresa(acme);
    }

}
