public class App {
    public static void main(String[] args) {
        Empresa amazon = new Empresa("Amazon");

        Departamento dev = new Departamento("Dev");
        Departamento xerox = new Departamento("Fotocopia");
        Departamento rh = new Departamento("Recursos Humanos");
        Departamento lixo = new Departamento("Lixo");

        Funcionario vinicius = new Funcionario("Vinicius Cole de Amorim", 14000.00);
        Funcionario henrique = new Funcionario("Henrique Caetano", 2000.00);
        Funcionario matheus = new Funcionario("Matheus Meier Schreiber", 7000.00);
        Funcionario thamya = new Funcionario("Thamya Donadia Hashimoto", 9000.00);
        Funcionario caio = new Funcionario("Caio Fiorotti", 10000.00);
        Funcionario joao = new Funcionario("João Moura", 3000.00);
        Funcionario afonso = new Funcionario("Afonso Salvador Magalhães", 11000.00);
        Funcionario trash = new Funcionario("Lixo", 0.00);
    
        dev.addFuncionarios(vinicius);
        dev.addFuncionarios(caio);
        dev.addFuncionarios(afonso);

        xerox.addFuncionarios(joao);
        xerox.addFuncionarios(thamya);

        rh.addFuncionarios(henrique);
        rh.addFuncionarios(matheus);

        lixo.addFuncionarios(trash);
        
        amazon.addDepartamentos(dev);
        amazon.addDepartamentos(xerox);
        amazon.addDepartamentos(rh);
        amazon.addDepartamentos(lixo);

        amazon.printEmpresa();

        amazon.removeDepartamentos(lixo);

        amazon.printEmpresa();

        amazon.aumentoEmpresa(0.2);

        amazon.printEmpresa();
    }
}
