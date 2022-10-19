import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {
        Livro l1 = new Livro("Java", "Pedro", 150.0);
        Livro l2 = new Livro("Python", "José", 100.0);
        Livro l3 = new Livro("C++", "Cristina", 50.75);
        JogoTabuleiro j1 = new JogoTabuleiro("Xadrez", 150.0, 5);
        JogoTabuleiro j2 = new JogoTabuleiro("Damas", 75.75, 7);

        ArrayList lista = new ArrayList();
        lista.add(l1);
        lista.add(l2);
        lista.add(l3);
        lista.add(j1);
        lista.add(j2);

        for (Object o : lista) {
            System.out.println(o);
        }
    }
}
