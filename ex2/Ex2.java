public class Ex2 {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("Joao");
        ContaCorrente c2 = new ContaCorrente("Maria");
        ContaCorrenteEspecial c3 = new ContaCorrenteEspecial("Jose");
        ContaCorrenteEspecial c4 = new ContaCorrenteEspecial("Ana");
        c1.depositar(100.0);
        c2.depositar(1000.0);
        c3.depositar(100.0);
        c4.depositar(1000.0);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        c1.sacar(10.0);
        c2.sacar(235.0);
        c3.sacar(10.0);
        c4.sacar(235.0);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
